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

public class PrecirptionInterface extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtUnit;
	private JTextField txtIdSearch;
	private JTextField txtNote;
	private JTextField txtIdCF;
	private JTextField txtQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecirptionInterface frame = new PrecirptionInterface();
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
	public PrecirptionInterface() {
		setTitle("Qu\u1EA3n l\u00ED \u0111\u01A1n thu\u1ED1c");
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
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(60)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
					.addGap(22))
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		
		txtIdSearch = new JTextField();
		txtIdSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		txtIdSearch.setBounds(111, 12, 86, 20);
		panel_2.add(txtIdSearch);
		txtIdSearch.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 11, 107, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblHTn = new JLabel("T\u00EAn thu\u1ED1c");
		lblHTn.setBounds(10, 45, 107, 23);
		panel_1.add(lblHTn);
		
		JLabel lblNmSinh = new JLabel("\u0110\u01A1n v\u1ECB");
		lblNmSinh.setBounds(10, 115, 107, 23);
		panel_1.add(lblNmSinh);
		
		JLabel lblGiiTnh = new JLabel("S\u1ED1 l\u01B0\u1EE3ng");
		lblGiiTnh.setBounds(10, 81, 107, 23);
		panel_1.add(lblGiiTnh);
		
		txtId = new JTextField();
		txtId.setBounds(127, 12, 130, 22);
		panel_1.add(txtId);
		txtId.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(127, 46, 130, 22);
		panel_1.add(txtName);
		
		txtUnit = new JTextField();
		txtUnit.setColumns(10);
		txtUnit.setBounds(127, 116, 130, 22);
		panel_1.add(txtUnit);
		
		JLabel label = new JLabel("Ch\u1EC9 \u0111\u1ECBnh");
		label.setBounds(10, 150, 107, 23);
		panel_1.add(label);
		
		txtNote = new JTextField();
		txtNote.setColumns(10);
		txtNote.setBounds(127, 161, 130, 58);
		panel_1.add(txtNote);
		
		JLabel lblIdPhiuKhm = new JLabel("ID phi\u1EBFu kh\u00E1m");
		lblIdPhiuKhm.setBounds(10, 233, 107, 23);
		panel_1.add(lblIdPhiuKhm);
		
		txtIdCF = new JTextField();
		txtIdCF.setColumns(10);
		txtIdCF.setBounds(127, 233, 130, 22);
		panel_1.add(txtIdCF);
		
		txtQuantity = new JTextField();
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(127, 82, 130, 22);
		panel_1.add(txtQuantity);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "T\u00EAn thu\u1ED1c", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n v\u1ECB", "Ch\u1EC9 \u0111\u1ECBnh", "ID phi\u1EBFu kh\u00E1m"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, Integer.class
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
		
		JButton btnStatic = new JButton("Th\u1ED1ng k\u00EA");
		btnStatic.setBounds(10, 79, 107, 23);
		panel.add(btnStatic);
		
		JButton btnReturn = new JButton("Tr\u1EDF v\u1EC1");
		btnReturn.setBounds(10, 153, 107, 23);
		panel.add(btnReturn);
		
		JButton btnSell = new JButton("B\u00E1n thu\u1ED1c");
		btnSell.setBounds(10, 113, 107, 23);
		panel.add(btnSell);
		contentPane.setLayout(gl_contentPane);
	}
}
