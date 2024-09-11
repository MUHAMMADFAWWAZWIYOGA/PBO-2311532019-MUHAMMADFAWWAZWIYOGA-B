package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.user;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Setia Budi");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 6, 564, 84);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(20, 119, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(20, 204, 65, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(20, 144, 293, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cuaca tidak mendukung coba kesini");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(177, 101, 233, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(20, 229, 293, 20);
		contentPane.add(txtPassword);
		
		JButton btnLoggin = new JButton("Gass Login");
		btnLoggin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (user.login(txtUsername.getText(),txtPassword.getText())) {
					new MainFrame ().setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null,"login gagal");
				
				}
			}
		});
		btnLoggin.setBackground(SystemColor.activeCaption);
		btnLoggin.setBounds(209, 273, 164, 23);
		contentPane.add(btnLoggin);
	}
}
