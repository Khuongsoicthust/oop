package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FDocTor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FDocTor frame = new FDocTor();
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
	public FDocTor() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello!");
		lblNewLabel.setBounds(5, 5, 47, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnThot = new JButton("\u0110\u0103ng xu\u1EA5t");
		btnThot.setBounds(439, 1, 101, 23);
		contentPane.add(btnThot);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 94, 123, 224);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSearchHistory = new JButton("T\u00ECm h\u1ED3 s\u01A1");
		btnSearchHistory.setBounds(0, 4, 123, 23);
		panel.add(btnSearchHistory);
		
		JButton btnAddSpecialist = new JButton("Kh\u00E1m chuy\u00EAn khoa");
		btnAddSpecialist.setBounds(0, 38, 123, 23);
		panel.add(btnAddSpecialist);
		
		JButton btnAddTest = new JButton("X\u00E9t nghi\u1EC7m");
		btnAddTest.setBounds(0, 72, 123, 23);
		panel.add(btnAddTest);
		
		JButton btnAddPrescription = new JButton("L\u1EADp \u0111\u01A1n thu\u1ED1c");
		btnAddPrescription.setBounds(0, 106, 123, 23);
		panel.add(btnAddPrescription);
		
		JButton btnUpdate = new JButton("C\u1EADp nh\u1EADt phi\u1EBFu");
		btnUpdate.setBounds(0, 140, 123, 23);
		panel.add(btnUpdate);
		
		JButton btnPrint = new JButton("In phi\u1EBFu");
		btnPrint.setBounds(0, 174, 123, 23);
		panel.add(btnPrint);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(126, 94, 424, 322);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, ""},
			},
			new String[] {
				"ID", "ID Bac si", "K\u1EBFt Lu\u1EADn", "Chi ph\u00ED kh\u00E1m "
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(474, 66, 76, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblChKhm = new JLabel("Ch\u1EDD kh\u00E1m:");
		lblChKhm.setBounds(418, 69, 61, 14);
		contentPane.add(lblChKhm);
		
		JLabel lblChKtQu = new JLabel("Ch\u1EDD k\u1EBFt qu\u1EA3:");
		lblChKtQu.setBounds(126, 69, 68, 14);
		contentPane.add(lblChKtQu);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 66, 76, 20);
		contentPane.add(textField_1);
	}
}
