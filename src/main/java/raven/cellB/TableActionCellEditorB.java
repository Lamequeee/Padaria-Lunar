package raven.cellB;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableActionCellEditorB extends DefaultCellEditor{

	private TableActionEventB event;
	
	public TableActionCellEditorB(TableActionEventB event) {
		super(new JCheckBox());
		this.event = event;
	}
	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		// TODO Auto-generated method stub
	PanelActionB action = new PanelActionB();
	action.initEvent(event, row);
	action.setBackground(table.getSelectionBackground());
	return action;
	}
	
}
