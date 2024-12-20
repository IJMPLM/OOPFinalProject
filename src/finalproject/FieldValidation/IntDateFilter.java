package finalproject.FieldValidation;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class IntDateFilter extends DocumentFilter {
    private String currentValue;
    private boolean isMonth;

    public IntDateFilter(String currentValue, boolean isMonth) {
        this.currentValue = currentValue;
        this.isMonth = isMonth;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }
        String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + string;
        if (isValid(newText)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }
        String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
        if (isValid(newText)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);
    }

    private boolean isValid(String text) {
        if (!text.matches("\\d*")) { // Only digits are allowed
            return false;
        }
        try {
            int value = Integer.parseInt(text);
            if (isMonth) {
                return value >= 1 && value <= 12; // Validate month
            } else {
                int maxDays = getMaxDaysInMonth(currentValue);
                return value >= 1 && value <= maxDays; // Validate day
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int getMaxDaysInMonth(String monthValue) {
        try {
            int month = Integer.parseInt(monthValue);
            switch (month) {
                case 2:
                    return 28; // Assume not a leap year for simplicity
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        } catch (NumberFormatException e) {
            return 31;
        }
    }
}
