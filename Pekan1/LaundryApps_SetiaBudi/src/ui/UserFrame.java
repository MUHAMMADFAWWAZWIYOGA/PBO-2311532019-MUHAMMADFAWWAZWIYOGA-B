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
import DAO.UserRepo;
import model.User;
import table.TableUser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class UserFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtPassword;

	
	UserRepo usr = new UserRepo ();
	List<User> ls ;
	public String id;
	private JTable table_User;

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
				
			}
		});
	}
	public void loadTable () {
		ls =usr.show();
		TableUser tu = new TableUser(ls);
		
	}
	public void reset ()
	{
		txtName.setText("");
		txtUsername.setText("");
		txtPassword.setText("");
	}
	
	

	
	

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
		panel.setBounds(0, 44, 666, 234);
		panel.setBackground(UIManager.getColor("Button.light"));
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
				user.setName(txtName.getText());
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
				user.setName(txtName.getText());
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
		
		table_User = new JTable();
		table_User.setSurrendersFocusOnKeystroke(true);
		table_User.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Name", "Username", "Password"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_User.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id = table_User.getValueAt(table_User.getSelectedRow(), 0).toString();
				txtName.setText(table_User.getValueAt(table_User.getSelectedRow(),1).toString());
				txtUsername.setText(table_User.getValueAt(table_User.getSelectedRow(),2).toString());
				txtPassword.setText(table_User.getValueAt(table_User.getSelectedRow(),3).toString());
				
			}
		});
		table_User.setBounds(0, 288, 666, 242);
		contentPane.add(table_User);
		
		table_User = new JTable();
		table_User.setBounds(0, 292, 666, 270);
		contentPane.add(table_User);
	}
}
