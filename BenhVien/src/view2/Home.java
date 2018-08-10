package view2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.dll.UserDLL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassWord;
    
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	UserDLL dll = new UserDLL();
	

	public Home() {
	

		setType(Type.UTILITY);
		setResizable(false);
		setBackground(Color.GRAY);
		setBounds(100, 100, 587, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocation(500, 200);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 579, 450);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 0, 600, 89);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Quản lí bệnh viện");
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(150, 24, 423, 35);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 100, 579, 309);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Tài khoản");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(123, 66, 130, 32);
		panel_2.add(lblNewLabel_1);

		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMtKhu.setForeground(Color.BLACK);
		lblMtKhu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblMtKhu.setBackground(Color.WHITE);
		lblMtKhu.setBounds(123, 121, 130, 32);
		panel_2.add(lblMtKhu);

		txtUserName = new JTextField();
		txtUserName.setBounds(297, 66, 213, 28);
		panel_2.add(txtUserName);
		txtUserName.setColumns(10);

		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String u = txtUserName.getText();
				String p = new String(txtPassWord.getPassword());
				boolean check = true;
				if (check && u.isEmpty()) {
					check = false;
					JOptionPane.showMessageDialog(txtUserName, "Chưa nhập tài khoản");

				}
				if (check && p.isEmpty()) {
					check = false;
					JOptionPane.showMessageDialog(txtPassWord, "Chưa nhập mật khẩu");

				}
				if (check) {
					int positonAccount= dll.getLogin(u, p);
					switch (positonAccount) {
					case 1:
						
						ReceptionistInterface r = new ReceptionistInterface();
						setVisible(false);
						r.main(null);
						break;
					case 2:
						GeneralDoctorInterface d = new GeneralDoctorInterface();
						setVisible(false);
						d.main(null);
						break;
					case 3:
						AdminInterface a = new AdminInterface();
						setVisible(false);
						a.main(null);break;
					case 4:
						ConsultingFileInterface s = new ConsultingFileInterface();
						setVisible(false);
						s.main(null);
						break;
					case 5:
						LabotoryFileInterface t = new LabotoryFileInterface();
						setVisible(false);
						t.main(null);break;
					case 6:
						PharamistInterface pp = new PharamistInterface	();
						setVisible(false);
						pp.main(null);break;
					default:
						JOptionPane.showMessageDialog(btnLogin, "Lỗi đăng nhập");
						
					}

					
				}
			}
		});
		btnLogin.setFont(new Font("Arial", Font.BOLD, 11));
		btnLogin.setBounds(406, 175, 104, 32);
		panel_2.add(btnLogin);

		txtPassWord = new JPasswordField();
		txtPassWord.setBounds(297, 121, 213, 28);
		panel_2.add(txtPassWord);
	}
}
