package raven.cellB;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRenderB extends DefaultTableCellRenderer {

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// TODO Auto-generated method stub
		Component con = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			PanelActionB action = new PanelActionB();
			if(isSelected==false&&row%2==0) {
				action.setBackground(Color.white);
			}else {
				action.setBackground(con.getBackground());
			}
			
		return action;
	}
	
}
