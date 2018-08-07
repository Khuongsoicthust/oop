package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Window.Type;

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
	public Home() {
		setType(Type.UTILITY);
		setResizable(false);
		setBackground(Color.GRAY);
		setBounds(100, 100, 587, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 579, 398);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 0, 579, 89);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1EC7 Th\u1ED1ng Qu\u1EA3n L\u00ED B\u1EC7nh Vi\u1EC7n");
		lblNewLabel.setBounds(77, 24, 423, 35);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 100, 579, 309);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00E0i kho\u1EA3n");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(123, 66, 130, 32);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblMtKhu = new JLabel("M\u1EADt kh\u1EA9u");
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
		
		JButton btnLogin = new JButton("\u0110\u0103ng Nh\u1EADp");
		btnLogin.setFont(new Font("Arial", Font.BOLD, 11));
		btnLogin.setBounds(406, 175, 104, 32);
		panel_2.add(btnLogin);
		
		txtPassWord = new JPasswordField();
		txtPassWord.setBounds(297, 121, 213, 28);
		panel_2.add(txtPassWord);
	}
}
