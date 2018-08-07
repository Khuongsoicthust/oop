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

public class FAddMainForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtCost;
	private JTextField txtPrediction;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAddMainForm frame = new FAddMainForm();
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
	public FAddMainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDetail = new JPanel();
		panelDetail.setLayout(null);
		panelDetail.setBounds(10, 11, 237, 279);
		contentPane.add(panelDetail);
		
		JLabel lblId = new JLabel("ID ");
		lblId.setBounds(10, 66, 74, 14);
		panelDetail.add(lblId);
		
		JLabel lblIdBacS = new JLabel("ID b\u00E1c s\u0129");
		lblIdBacS.setBounds(10, 99, 60, 14);
		panelDetail.add(lblIdBacS);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(94, 63, 122, 20);
		panelDetail.add(txtId);
		
		JComboBox cbIdDoctor = new JComboBox();
		cbIdDoctor.setBounds(94, 96, 122, 20);
		panelDetail.add(cbIdDoctor);
		
		JLabel lblChiPh = new JLabel("Chi ph\u00ED");
		lblChiPh.setBounds(10, 131, 60, 14);
		panelDetail.add(lblChiPh);
		
		txtCost = new JTextField();
		txtCost.setColumns(10);
		txtCost.setBounds(94, 127, 122, 20);
		panelDetail.add(txtCost);
		
		JLabel lblChunon = new JLabel("Chu\u1EA9n \u0111o\u00E1n");
		lblChunon.setBounds(10, 161, 60, 14);
		panelDetail.add(lblChunon);
		
		txtPrediction = new JTextField();
		txtPrediction.setColumns(10);
		txtPrediction.setBounds(94, 158, 122, 110);
		panelDetail.add(txtPrediction);
		
		JButton btnPrint = new JButton("In s\u1ED1");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrint.setBounds(269, 132, 104, 23);
		contentPane.add(btnPrint);
		
		JButton btnAdd = new JButton("Th\u00EAm phi\u1EBFu ");
		btnAdd.setBounds(269, 65, 104, 23);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("H\u1EE7y");
		btnCancel.setBounds(269, 166, 104, 23);
		contentPane.add(btnCancel);
		
		JButton btnUpdate = new JButton("S\u1EEDa phi\u1EBFu");
		btnUpdate.setBounds(269, 98, 104, 23);
		contentPane.add(btnUpdate);
	}

}
