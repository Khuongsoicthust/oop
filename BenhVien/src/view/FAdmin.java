package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FAdmin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtID;
	private JTextField txtUserName;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAdmin frame = new FAdmin();
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
	public FAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 478, 31);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnExit = new JButton("Tho\u00E1t");
		btnExit.setToolTipText("");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setFont(new Font("Arial", Font.BOLD, 9));
		btnExit.setBounds(270, 1, 89, 31);
		panel.add(btnExit);
		
		JButton btnChangePassWd = new JButton("\u0110\u1ED5i M\u1EADt Kh\u1EA9u");
		btnChangePassWd.setBackground(Color.WHITE);
		btnChangePassWd.setFont(new Font("Arial", Font.BOLD, 10));
		btnChangePassWd.setBounds(368, 1, 105, 31);
		panel.add(btnChangePassWd);
		
		JLabel lblAdmin = new JLabel("Hello Admin!");
		lblAdmin.setBounds(10, 1, 67, 31);
		panel.add(lblAdmin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 98, 478, 186);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "UserName", "PassWord"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Arial", Font.PLAIN, 11));
		txtID.setToolTipText("UserName");
		txtID.setBounds(73, 320, 121, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Arial", Font.PLAIN, 11));
		txtUserName.setBounds(73, 363, 121, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JTextField txtPassWord = new JTextField();
		txtPassWord.setFont(new Font("Arial", Font.PLAIN, 11));
		txtPassWord.setBounds(73, 406, 121, 20);
		contentPane.add(txtPassWord);
		txtPassWord.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(204, 319, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(204, 362, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(204, 405, 89, 23);
		contentPane.add(btnDelete);
		
		txtSearch = new JTextField();
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		txtSearch.setBounds(347, 67, 121, 20);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(248, 66, 89, 23);
		contentPane.add(btnSearch);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(14, 366, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setBounds(14, 409, 49, 14);
		contentPane.add(lblPassword);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(14, 323, 49, 14);
		contentPane.add(lblId);
	}
}
