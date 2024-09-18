package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.UserRepo;
import model.User;
import table.TableUser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class UserFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTable tableUsers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
					frame.setVisible(true);
					frame.loadTable();
				} catch (Exception e) {
					e.printStackTrace();
				}
				UserFrame frame = new UserFrame();
				frame.setVisible(true);
				frame.loadTable();
			}
		});
	}
	public void reset ()
	{
		txtName.setText("");
		txtUsername.setText("");
		txtPassword.setText("");
	}
	public void loadTable () {
		ls =usr.show();
		TableUser tu = new TableUser (ls);
		tableUsers.setModel((tu));
		tableUsers.getTableHeader().setVisible(true);
	}
	
	UserRepo usr = new UserRepo ();
	List<User> ls ;
	public String id;
	
	

	/**
	 * Create the frame.
	 */
	public UserFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.light"));
		panel.setBounds(0, 44, 666, 234);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(33, 73, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(33, 117, 67, 13);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(33, 159, 45, 13);
		panel.add(lblPassword);
		
		txtName = new JTextField();
		txtName.setBounds(97, 70, 535, 19);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(97, 114, 535, 19);
		panel.add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(97, 156, 535, 19);
		panel.add(txtPassword);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.setNama(txtName.getText());
				user.setUsername(txtUsername.getText());
				user.setPassword(txtPassword.getText());
				usr.save(user);
				reset ();
			}
		});
		
		btnSave.setBounds(97, 203, 85, 21);
		panel.add(btnSave);
		
		JButton btnUpdates = new JButton("Updates");
		btnUpdates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User ();
				user.setNama(txtName.getText());
				user.setUsername(txtUsername.getText());
				user.setPassword(txtPassword.getText());
				user.setId(id);
			}
		});
		btnUpdates.setBounds(202, 203, 85, 21);
		panel.add(btnUpdates);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id != null) {
					usr.delete(id);
					reset();
					loadTable();
				} else {
					JOptionPane.showMessageDialog (null, "SIlahkan pilih data yang akan di hapus");
				}
			}
		});
		btnDelete.setBounds(307, 203, 85, 21);
		panel.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(416, 203, 85, 21);
		panel.add(btnCancel);
		
		tableUsers = new JTable();
		tableUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id = tableUsers.getValueAt (tableUsers.getSelectedRow(), 0 ).toString();
				txtName.setText(tableUsers.getValueAt(tableUsers.getSelectedRow(), 1 ).toString());
				txtUsername.setText(tableUsers.getValueAt(tableUsers.getSelectedRow(), 2 ).toString());
				txtPassword.setText(tableUsers.getValueAt(tableUsers.getSelectedRow(), 3 ).toString());
			}
		});
		tableUsers.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		tableUsers.setBounds(10, 288, 666, 264);
		contentPane.add(tableUsers);
	}
}
