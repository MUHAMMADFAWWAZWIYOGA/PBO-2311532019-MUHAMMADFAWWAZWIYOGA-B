package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ServiceFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldJenis;
	private JTextField textFieldSatuan;
	private JTextField textFieldHarga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServiceFrame frame = new ServiceFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ServiceFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 210, 642, 131);
		contentPane.add(table);
		
		textFieldJenis = new JTextField();
		textFieldJenis.setBounds(60, 58, 96, 19);
		contentPane.add(textFieldJenis);
		textFieldJenis.setColumns(10);
		
		textFieldSatuan = new JTextField();
		textFieldSatuan.setColumns(10);
		textFieldSatuan.setBounds(60, 129, 96, 19);
		contentPane.add(textFieldSatuan);
		
		textFieldHarga = new JTextField();
		textFieldHarga.setColumns(10);
		textFieldHarga.setBounds(60, 181, 96, 19);
		contentPane.add(textFieldHarga);
		
		JLabel lblJenis = new JLabel("Jenis");
		lblJenis.setBounds(70, 34, 45, 13);
		contentPane.add(lblJenis);
		
		JLabel lblSatuan = new JLabel("Satuan");
		lblSatuan.setBounds(60, 106, 45, 13);
		contentPane.add(lblSatuan);
		
		JLabel lblHarga = new JLabel("Harga");
		lblHarga.setBounds(60, 158, 45, 13);
		contentPane.add(lblHarga);
		
		JButton btnSave = new JButton("Simpan");
		btnSave.setBounds(200, 181, 85, 21);
		contentPane.add(btnSave);
		
		// Action Listener for Save button
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveToDatabase();
			}
		});
	}

	// Method to save data to database
	private void saveToDatabase() {
		String jenis = textFieldJenis.getText();
		String satuan = textFieldSatuan.getText();
		int harga = Integer.parseInt(textFieldHarga.getText());

		// Database connection and SQL insert
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password")) {
			String sql = "INSERT INTO `Order` (jenis, satuan, harga) VALUES (?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, jenis);
			pstmt.setString(2, satuan);
			pstmt.setInt(3, harga);
			
			pstmt.executeUpdate();
			System.out.println("Data berhasil disimpan");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
