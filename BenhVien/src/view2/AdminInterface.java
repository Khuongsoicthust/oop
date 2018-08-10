package view2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;

public class AdminInterface extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtId;
	private JTextField txtIdEmployee;
	private JTextField txtIdAccount;
	private JTextField txtUserName;
	private JPasswordField txtPassWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminInterface frame = new AdminInterface();
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
	public AdminInterface() {
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		setSize(1000, 500);
		setLocation(500, 200);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setLayout(null);
		
		JButton button_3 = new JButton("Thanh to\u00E1n");
		button_3.setBounds(10, 149, 107, 23);
		panel_2.add(button_3);
		
		JButton btnSearch = new JButton("T\u00ECm ki\u1EBFm ");
		btnSearch.setBounds(10, 11, 91, 23);
		panel_2.add(btnSearch);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(60)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
					.addGap(22))
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		
		txtIdAccount = new JTextField();
		txtIdAccount.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		txtIdAccount.setBounds(111, 12, 86, 20);
		panel_2.add(txtIdAccount);
		txtIdAccount.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 11, 107, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblHTn = new JLabel("ID Nh\u00E2n vi\u00EAn");
		lblHTn.setBounds(10, 45, 107, 23);
		panel_1.add(lblHTn);
		
		JLabel lblNmSinh = new JLabel("M\u1EADt kh\u1EA9u");
		lblNmSinh.setBounds(10, 115, 107, 23);
		panel_1.add(lblNmSinh);
		
		JLabel lblGiiTnh = new JLabel("T\u00E0i kho\u1EA3n");
		lblGiiTnh.setBounds(10, 81, 107, 23);
		panel_1.add(lblGiiTnh);
		
		JLabel lblLAdmin = new JLabel("L\u00E0 admin");
		lblLAdmin.setBounds(10, 149, 107, 23);
		panel_1.add(lblLAdmin);
		
		txtId = new JTextField();
		txtId.setBounds(127, 12, 130, 22);
		panel_1.add(txtId);
		txtId.setColumns(10);
		
		txtIdEmployee = new JTextField();
		txtIdEmployee.setColumns(10);
		txtIdEmployee.setBounds(127, 46, 130, 22);
		panel_1.add(txtIdEmployee);
		
		JComboBox cbIsAdmin = new JComboBox();
		cbIsAdmin.setBounds(127, 150, 130, 23);
		panel_1.add(cbIsAdmin);
		
		txtUserName = new JTextField();
		txtUserName.setColumns(10);
		txtUserName.setBounds(127, 82, 130, 22);
		panel_1.add(txtUserName);
		
		txtPassWord = new JPasswordField();
		txtPassWord.setBounds(127, 116, 130, 22);
		panel_1.add(txtPassWord);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "ID nh\u00E2n vi\u00EAn", "T\u00E0i kho\u1EA3n ", " M\u1EADt kh\u1EA9u", "L\u00E0 admin"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		panel.setLayout(null);
		
		JButton btnAdd = new JButton("Th\u00EAm m\u1EDBi");
		btnAdd.setBounds(10, 11, 107, 23);
		panel.add(btnAdd);
		
		JButton btnUpdate = new JButton("C\u1EADp nh\u1EADt");
		btnUpdate.setBounds(10, 45, 107, 23);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("X\u00F3a");
		btnDelete.setBounds(10, 79, 107, 23);
		panel.add(btnDelete);
		
		JButton btnExit = new JButton("Tho\u00E1t");
		btnExit.setBounds(10, 113, 107, 23);
		panel.add(btnExit);
		contentPane.setLayout(gl_contentPane);
	}
}
