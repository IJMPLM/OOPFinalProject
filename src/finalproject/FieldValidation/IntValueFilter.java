package finalproject.FieldValidation;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class IntValueFilter extends DocumentFilter {
    private int intValue;

    public IntValueFilter(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }
        String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + string;
        if (newText.matches("\\d*") && isValid(newText)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }
        String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
        if (newText.matches("\\d*") && isValid(newText)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean isValid(String text) {
        try {
            int value = Integer.parseInt(text);
            return value < intValue;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
