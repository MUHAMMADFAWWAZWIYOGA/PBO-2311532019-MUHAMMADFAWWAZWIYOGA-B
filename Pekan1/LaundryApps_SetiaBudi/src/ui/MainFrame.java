package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("PESANAN");
		btnNewButton.setBounds(57, 169, 134, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Laundry Setia Budi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabel.setBounds(10, -7, 564, 83);
		contentPane.add(lblNewLabel);
		
		JButton btnPengguna = new JButton("PENGGUNA ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UserFrame ().setVisible(true);
			}
		});
		btnPengguna.setBounds(57, 87, 134, 50);
		contentPane.add(btnPengguna);
		
		JButton btnNewButton_1_1 = new JButton("LAYANAN");
		btnNewButton_1_1.setBounds(396, 169, 134, 50);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("PELANGGAN");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setBounds(396, 87, 134, 50);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("LAPORAN");
		btnNewButton_1_3.setBounds(233, 169, 134, 50);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("PROFILE");
		btnNewButton_1_4.setBounds(233, 87, 134, 50);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_4_1 = new JButton("KELUAR");
		btnNewButton_1_4_1.setBounds(193, 257, 218, 23);
		contentPane.add(btnNewButton_1_4_1);
	}

}
