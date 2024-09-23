package table;

import java.awt.Window;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.User;

public class TableUser extends AbstractTableModel {
	List <User>ls ;
	private String [] columnNames = { "id","name","username","password"};
	public TableUser(List<User>ls) {
		this.ls =ls;
		
	}
	@Override
	public int getRowCount() {
		return ls.size();
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getColumnName (int column) {
		return columnNames[column];
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0 :
		return ls.get(rowIndex).getId();
		case 1 : 
		return ls.get(rowIndex).getName();
		case 2 :
			return ls.get(rowIndex).getUsername();
		case 3 :
			return ls.get(rowIndex).getPasword();
		default :
		return null;
	}
	}
	public static void setModel(TableUser tableUser) {
		// TODO Auto-generated method stub
		
	}
	public static Window getTableHeader() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
	
	



	