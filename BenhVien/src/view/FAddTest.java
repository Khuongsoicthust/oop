package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FAddTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAddTest frame = new FAddTest();
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
	public FAddTest() {
		setTitle("X\u00E9t nghi\u1EC7m");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDetail = new JPanel();
		panelDetail.setLayout(null);
		panelDetail.setBounds(10, 38, 284, 279);
		contentPane.add(panelDetail);
		
		JLabel label = new JLabel("ID");
		label.setBounds(10, 35, 60, 14);
		panelDetail.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(94, 32, 122, 20);
		panelDetail.add(textField);
		
		JLabel lblIdPhiuKhm = new JLabel("ID phi\u1EBFu kh\u00E1m");
		lblIdPhiuKhm.setBounds(10, 66, 74, 14);
		panelDetail.add(lblIdPhiuKhm);
		
		JLabel lblIdBac = new JLabel("ID b\u00E1c s\u0129");
		lblIdBac.setBounds(10, 99, 60, 14);
		panelDetail.add(lblIdBac);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 63, 122, 20);
		panelDetail.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(94, 96, 122, 20);
		panelDetail.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 127, 122, 20);
		panelDetail.add(textField_2);
		
		JLabel label_4 = new JLabel("Chi ph\u00ED");
		label_4.setBounds(10, 130, 46, 14);
		panelDetail.add(label_4);
		
		JLabel lblXtNghim = new JLabel("X\u00E9t nghi\u1EC7m");
		lblXtNghim.setBounds(10, 161, 74, 14);
		panelDetail.add(lblXtNghim);
		
		JComboBox cbTestName = new JComboBox();
		cbTestName.setBounds(94, 158, 122, 20);
		panelDetail.add(cbTestName);
		
		JLabel label_3 = new JLabel("Chu\u1EA9n \u0111o\u00E1n");
		label_3.setBounds(10, 196, 60, 14);
		panelDetail.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(94, 196, 159, 72);
		panelDetail.add(textField_3);
		
		JButton btnAdd = new JButton("Th\u00EAm phi\u1EBFu");
		btnAdd.setBounds(363, 38, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnPrint = new JButton("In phi\u1EBFu");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrint.setBounds(363, 140, 89, 23);
		contentPane.add(btnPrint);
		
		JButton btnUpdate = new JButton("S\u1EEDa phi\u1EBFu");
		btnUpdate.setBounds(363, 72, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnCancel = new JButton("H\u1EE7y phi\u1EBFu");
		btnCancel.setBounds(363, 106, 89, 23);
		contentPane.add(btnCancel);
	}

}
