package finalproject.Table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Render the action buttons or custom panel
        PanelAction action = new PanelAction();
        if (isSelected) {
            action.setBackground(table.getSelectionBackground());
        } else {
            action.setBackground(table.getBackground());
        }
        return action;
    }
}
