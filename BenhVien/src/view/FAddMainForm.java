package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import controller.dll.ReceptionistDLL;
import model.ConsultingFile;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FAddMainForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtCost;
	private JTextArea txtPrediction;
	ReceptionistDLL repdll = new ReceptionistDLL();

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
	
	public void fillCb(JComboBox cb) {
		ArrayList<String> ids = repdll.getAllDoctorIdAndName();
		for (String id : ids) {
			cb.addItem(id);
		}
	}
	public void fillTxt(JTextField j, String tablename) {
		int i = repdll.getLastIdByTableName(tablename);
		j.setText(String.valueOf(i+1));
	}
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
		fillTxt(txtId, "consultingfile");
		txtId.setColumns(10);
		txtId.setBounds(94, 63, 122, 20);
		panelDetail.add(txtId);
		
		JComboBox cbIdDoctor = new JComboBox();
		fillCb(cbIdDoctor);
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
		
		txtPrediction = new JTextArea(1,1);
		txtPrediction.setColumns(10);
		txtPrediction.setBounds(94, 158, 122, 110);
		panelDetail.add(txtPrediction);
		
		JButton btnPrint = new JButton("In phiếu");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrint.setBounds(269, 132, 104, 23);
		contentPane.add(btnPrint);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtId.getText());
				String idAndName = cbIdDoctor.getSelectedItem().toString();
				int idDoctor = Integer.parseInt(idAndName.substring(idAndName.indexOf("-")+1));
				int cost = Integer.parseInt(txtCost.getText());
				String result =txtPrediction.getText();
				String examedDay = LocalDate.now().toString();
				ConsultingFile u = new ConsultingFile(id, idDoctor, examedDay, cost, result);
				if(repdll.insertConsultingFile(u)) {
					JOptionPane.showMessageDialog(btnAdd, "Đã tạo");
				}
				else {
					JOptionPane.showMessageDialog(btnAdd, "Lỗi");
				}
				
				
			}
		});
		btnAdd.setBounds(269, 65, 104, 23);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("Hủy");
		btnCancel.setBounds(269, 166, 104, 23);
		contentPane.add(btnCancel);
		
		JButton btnUpdate = new JButton("Sửa");
		btnUpdate.setBounds(269, 98, 104, 23);
		contentPane.add(btnUpdate);
	}

}
