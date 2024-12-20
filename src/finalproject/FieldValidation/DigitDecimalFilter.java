package finalproject.FieldValidation;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class DigitDecimalFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }
        String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
        String newText = new StringBuilder(currentText).insert(offset, string).toString();
        if (isValidInput(newText)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }
        String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
        String newText = new StringBuilder(currentText).replace(offset, offset + length, text).toString();
        if (isValidInput(newText)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
        String newText = new StringBuilder(currentText).delete(offset, offset + length).toString();
        if (isValidInput(newText)) {
            super.remove(fb, offset, length);
        }
    }

    private boolean isValidInput(String text) {
        if (text.isEmpty()) {
            return true; // Allow empty field
        }
        // Regex to match up to 3 digits before the decimal and up to 2 digits after the decimal
        String pattern = "^\\d{0,3}(\\.\\d{0,2})?$";
        if (!text.matches(pattern)) {
            return false;
        }

        // Ensure the value does not exceed 100.00
        try {
            double value = Double.parseDouble(text);
            return value <= 100.00;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
