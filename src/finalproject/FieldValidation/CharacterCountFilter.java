package finalproject.FieldValidation;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class CharacterCountFilter extends DocumentFilter {
    private int intCharacterCount;
    public CharacterCountFilter(int intCharacterCount){
        this.intCharacterCount = intCharacterCount;
    }
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }
        String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + string;
        if (newText.length() <= intCharacterCount) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }
        String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
        if (newText.length() <= intCharacterCount) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);
    }
}
