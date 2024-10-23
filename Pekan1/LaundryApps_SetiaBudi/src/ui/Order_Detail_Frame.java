package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTable;

public class Order_Detail_Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order_Detail_Frame frame = new Order_Detail_Frame();
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
	public Order_Detail_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order ID");
		lblNewLabel.setBounds(10, 25, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPelanggan = new JLabel("pelanggan ");
		lblPelanggan.setBounds(10, 80, 60, 14);
		contentPane.add(lblPelanggan);
		
		JLabel lblTanggal = new JLabel("tanggal");
		lblTanggal.setBounds(10, 130, 60, 14);
		contentPane.add(lblTanggal);
		
		JLabel lblTanggalPengembalian = new JLabel("Tanggal Pengembalian");
		lblTanggalPengembalian.setBounds(10, 187, 115, 14);
		contentPane.add(lblTanggalPengembalian);
		
		JLabel lblStatus = new JLabel("status");
		lblStatus.setBounds(10, 249, 60, 14);
		contentPane.add(lblStatus);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 320, 60, 14);
		contentPane.add(lblTotal);
		
		JLabel lblPembayaran = new JLabel("Pembayaran");
		lblPembayaran.setBounds(10, 368, 60, 14);
		contentPane.add(lblPembayaran);
		
		JLabel lblStatusPembayaran = new JLabel("Status Pembayaran ");
		lblStatusPembayaran.setBounds(10, 423, 167, 14);
		contentPane.add(lblStatusPembayaran);
		
		JLabel lblLayanan = new JLabel("Layanan");
		lblLayanan.setBounds(291, 25, 60, 14);
		contentPane.add(lblLayanan);
		
		JLabel lblHargakg = new JLabel("Harga/Kg");
		lblHargakg.setBounds(291, 232, 60, 14);
		contentPane.add(lblHargakg);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setBounds(308, 301, 60, 14);
		contentPane.add(lblTotal_1);
		
		JLabel lblJumlah = new JLabel("Jumlah");
		lblJumlah.setBounds(480, 232, 60, 14);
		contentPane.add(lblJumlah);
		
		JButton btnNewButton = new JButton("simpan");
		btnNewButton.setBounds(277, 364, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnUbah = new JButton("ubah");
		btnUbah.setBounds(381, 364, 89, 23);
		contentPane.add(btnUbah);
		
		JButton btnHapus = new JButton("Hapus");
		btnHapus.setBounds(480, 364, 89, 23);
		contentPane.add(btnHapus);
		
		JButton btnBatal = new JButton("Batal");
		btnBatal.setBounds(584, 364, 89, 23);
		contentPane.add(btnBatal);
		
		JButton btnNewButton_4 = new JButton("simpan");
		btnNewButton_4.setBounds(10, 536, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("simpan");
		btnNewButton_5.setBounds(112, 536, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"cash", "transfer"}));
		comboBox.setBounds(10, 393, 127, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"lunas ", "tidak lunas "}));
		comboBox_1.setBounds(10, 448, 127, 22);
		contentPane.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(10, 50, 191, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 105, 191, 22);
		contentPane.add(comboBox_2);
		
		table = new JTable();
		table.setBounds(301, 50, 372, 156);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(291, 398, 372, 156);
		contentPane.add(table_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(291, 249, 167, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(483, 249, 190, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(291, 317, 167, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 156, 191, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 218, 191, 20);
		contentPane.add(textField_5);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(10, 274, 191, 22);
		contentPane.add(comboBox_2_1);
	}
}
