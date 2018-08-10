package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FFile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1, textField_2, textField_3, textField_4, textField_5, textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FFile frame = new FFile();
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
	public FFile() {
		setTitle("Quản lý hồ sơ bệnh nhân");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelDetail = new JPanel();
		panelDetail.setLayout(null);
		panelDetail.setBounds(10, 38, 400, 330);
		contentPane.add(panelDetail);

		JLabel lblIdName = new JLabel("Họ tên");
		lblIdName.setBounds(10, 30, 90, 30);
		panelDetail.add(lblIdName);

		JLabel lblIdSex = new JLabel("Giới tính");
		lblIdSex.setBounds(10, 80, 90, 30);
		panelDetail.add(lblIdSex);

		JLabel lblIdBirth = new JLabel("Năm sinh");
		lblIdBirth.setBounds(10, 130, 90, 30);
		panelDetail.add(lblIdBirth);

		JLabel lblIdAdd = new JLabel("Quê quán");
		lblIdAdd.setBounds(10, 180, 90, 30);
		panelDetail.add(lblIdAdd);

		JLabel lblIdJob = new JLabel("Nghề nhiệp");
		lblIdJob.setBounds(10, 230, 90, 30);
		panelDetail.add(lblIdJob);

		JLabel lblIdCMND = new JLabel("Số CMND");
		lblIdCMND.setBounds(10, 280, 90, 30);
		panelDetail.add(lblIdCMND);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 30, 200, 30);
		panelDetail.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 80, 200, 30);
		panelDetail.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 130, 200, 30);
		panelDetail.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(110, 180, 200, 30);
		panelDetail.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(110, 230, 200, 30);
		panelDetail.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(110, 280, 200, 30);
		panelDetail.add(textField_6);

		JButton btnAdd = new JButton("Thêm hồ sơ");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = textField_1.getText();
				String b = textField_2.getText();
				String c = textField_3.getText();
				String d = textField_4.getText();
				String e = textField_5.getText();
				String f = textField_6.getText();

				if (a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty() || e.isEmpty() || f.isEmpty()) {
					JOptionPane.showMessageDialog(btnAdd, "Chưa nhập đủ giá trị");
				} else {
					FAddMainForm fAddMainForm = new FAddMainForm();
					fAddMainForm.setVisible(true);
					setVisible(false);
				}

				//
			}
		});
		btnAdd.setBounds(500, 72, 130, 23);
		contentPane.add(btnAdd);

		JButton btnUpdate = new JButton("Sửa hồ sơ");
		btnUpdate.setBounds(500, 130, 130, 23);
		contentPane.add(btnUpdate);

		JButton btnReturn = new JButton("Quay lại");
		btnReturn.setBounds(680, 350, 100, 23);
		contentPane.add(btnReturn);

	}

}