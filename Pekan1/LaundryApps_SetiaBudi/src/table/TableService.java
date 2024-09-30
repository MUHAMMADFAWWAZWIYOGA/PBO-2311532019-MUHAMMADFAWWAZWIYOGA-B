package table;

import java.awt.Window;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Service;

public class TableService extends AbstractTableModel {
	List <Service>ls ;
	private String [] columnNames = { "ID","Jenis","Harga","Status"};
	public TableService(List<Service>ls) {
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
		return ls.get(rowIndex).getJenis();
		case 2 :
			return ls.get(rowIndex).getHarga();
		case 3 :
			return ls.get(rowIndex).getStatus();
		default :
		return null;
	}
	}
	public static void setModel(TableService tableService) {
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
	
	



	