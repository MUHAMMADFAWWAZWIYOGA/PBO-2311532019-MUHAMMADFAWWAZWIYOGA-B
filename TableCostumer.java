package table;

import java.awt.Window;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Costumer;

public class TableCostumer extends AbstractTableModel {
	List<Costumer> ls ;
	private String [] columnNames = { "ID","Nama","Alamat","NomorHp"};
	public TableCostumer(List<Costumer>ls) {
		this.ls =ls;
		
	}
	@Override
	public int getRowCount() {
		return ls.size();
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
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
		return ls.get(rowIndex).getNama();
		case 2 :
			return ls.get(rowIndex).getAlamat();
		case 3 :
			return ls.get(rowIndex).getNomorHp();
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
	public static int getSelectedRow() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
	
	



	