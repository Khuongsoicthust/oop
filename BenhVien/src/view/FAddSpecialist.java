package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class FAddSpecialist extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtForm;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAddSpecialist frame = new FAddSpecialist();
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
	public FAddSpecialist() {
		setTitle("Khám chuyên khoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDetail = new JPanel();
		panelDetail.setBounds(33, 37, 284, 279);
		contentPane.add(panelDetail);
		panelDetail.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 35, 60, 14);
		panelDetail.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(94, 32, 122, 20);
		panelDetail.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblIdPhiuKhm = new JLabel("ID Phi\u1EBFu Kh\u00E1m");
		lblIdPhiuKhm.setBounds(10, 66, 74, 14);
		panelDetail.add(lblIdPhiuKhm);
		
		JLabel lblIdBacSi = new JLabel("ID Bac Si");
		lblIdBacSi.setBounds(10, 99, 60, 14);
		panelDetail.add(lblIdBacSi);
		
		txtForm = new JTextField();
		txtForm.setColumns(10);
		txtForm.setBounds(94, 63, 122, 20);
		panelDetail.add(txtForm);
		
		JComboBox cbIdDoctor = new JComboBox();
		cbIdDoctor.setBounds(94, 96, 122, 20);
		panelDetail.add(cbIdDoctor);
		
		JLabel lblKhmKhoa = new JLabel("T\u00EAn b\u00E1c s\u0129");
		lblKhmKhoa.setBounds(10, 130, 60, 14);
		panelDetail.add(lblKhmKhoa);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(94, 158, 122, 20);
		panelDetail.add(comboBox);
		
		JLabel label = new JLabel("Kh\u00E1m khoa");
		label.setBounds(10, 161, 60, 14);
		panelDetail.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(94, 127, 122, 20);
		panelDetail.add(textField);
		
		JLabel lblChiPhi = new JLabel("Chi ph\u00ED");
		lblChiPhi.setBounds(10, 195, 60, 14);
		panelDetail.add(lblChiPhi);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 189, 122, 20);
		panelDetail.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 220, 180, 48);
		panelDetail.add(textField_2);
		
		JLabel lblChunon = new JLabel("Chu\u1EA9n \u0111o\u00E1n");
		lblChunon.setBounds(10, 223, 60, 14);
		panelDetail.add(lblChunon);
		
		JButton btnAdd = new JButton("Th\u00EAm phi\u1EBFu");
		btnAdd.setBounds(350, 37, 89, 23);
		btnAdd.setSize(120, 20);
		contentPane.add(btnAdd);
		
		JButton btnPrint = new JButton("In chi ti\u1EBFt");
		btnPrint.setBounds(350, 139, 89, 23);
		btnPrint.setSize(120, 20);

		contentPane.add(btnPrint);
		
		JButton btnSaPhiu = new JButton("S\u1EEDa phi\u1EBFu");
		btnSaPhiu.setBounds(350, 71, 89, 23);
		btnSaPhiu.setSize(120, 20);

		contentPane.add(btnSaPhiu);
		
		JButton btnHyPhiu = new JButton("H\u1EE7y phi\u1EBFu");
		btnHyPhiu.setBounds(350, 105, 89, 23);
		btnHyPhiu.setSize(120, 20);
		contentPane.add(btnHyPhiu);
	}
}
