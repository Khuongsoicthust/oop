package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class FHoSo extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdHoSo;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FHoSo frame = new FHoSo();
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
	public FHoSo() {
		setTitle("Qu\u1EA3n l\u00ED h\u1ED3 s\u01A1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 101, 518, 236);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "H\u1ECD T\u00EAn", "Gi\u1EDBi t\u00EDnh", " N\u0103m sinh", "Qu\u00EA Qu\u00E1n ", "Ngh\u1EC1 Nghi\u1EC7p", "S\u1ED1 CMND", "ID Phi\u1EBFu Kh\u00E1m"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(66);
		table.getColumnModel().getColumn(7).setPreferredWidth(80);
		scrollPane.setViewportView(table);
		
		txtIdHoSo = new JTextField();
		txtIdHoSo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		txtIdHoSo.setBounds(395, 70, 113, 20);
		contentPane.add(txtIdHoSo);
		txtIdHoSo.setColumns(10);
		
		JButton btnSearch = new JButton("T\u00EDm ki\u1EBFm");
		btnSearch.setBounds(272, 69, 113, 23);
		contentPane.add(btnSearch);
		
		JButton btnSearchHistoy = new JButton("Chi ti\u1EBFt kh\u00E1m");
		btnSearchHistoy.setBounds(272, 35, 113, 23);
		contentPane.add(btnSearchHistoy);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(395, 36, 113, 20);
		contentPane.add(textField);
	}

}
