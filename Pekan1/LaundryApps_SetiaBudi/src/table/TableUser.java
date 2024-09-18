package table;

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
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0 :
		return ls.get(rowIndex).getId();
		case 1 : 
		return ls.get(rowIndex).getNama();
		case 2 :
			return ls.get(rowIndex).getUsername();
		case 3 :
			return ls.get(rowIndex).getPasword();
		default :
		return null;
	}
	
	


}}
