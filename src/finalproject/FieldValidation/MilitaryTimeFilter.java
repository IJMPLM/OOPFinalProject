package finalproject.FieldValidation;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class MilitaryTimeFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }
        String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + string;
        if (isValidTime(newText)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }
        String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
        if (isValidTime(newText)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);
    }

    private boolean isValidTime(String text) {
        // Allow partial input that leads to a valid HH:mm format
        String partialTimePattern = "^([0-2]?\\d:?\\d{0,2})?$";
        return text.matches(partialTimePattern) && isValidCompleteTime(text);
    }

    private boolean isValidCompleteTime(String text) {
        // Ensure only valid HH:mm time is accepted once input is complete
        String completeTimePattern = "^([01]\\d|2[0-3]):[0-5]\\d$";
        return text.matches(completeTimePattern);
    }
}
