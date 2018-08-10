package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

import controller.dll.ReceptionistDLL;
import controlloer.dao.ReceptionistDAO;
import model.PatientFile;

public class FReceptionist extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumberOfPatients;
	private JTable table;
    ReceptionistDLL repdll = new ReceptionistDLL();
    ArrayList<PatientFile> pfile = repdll.getAllPatientFiles();
    DefaultTableModel model ;
	public void setValuesTable(ArrayList<PatientFile> a ,DefaultTableModel modell) {
		for (PatientFile patientFile : a) {
			modell.addRow(patientFile.toObject());
		}
		
		
	}
	/**
	 * Launch the application.
	 */
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FReceptionist frame = new FReceptionist();
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

	public FReceptionist() {
		setTitle("Quầy tiếp tân");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setSize(1000, 500);
		setLocation(500, 200);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		
		JLabel lblNewLabel = new JLabel("S\u1ED1 b\u1EC7nh nh\u00E2n hi\u1EC7n t\u1EA1i:");
		
		txtNumberOfPatients = new JTextField();
		txtNumberOfPatients.setColumns(10);
		
		JButton btnExit = new JButton("Tho\u00E1t");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNumberOfPatients, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(485, Short.MAX_VALUE)
					.addComponent(btnExit))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnExit)
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addComponent(txtNumberOfPatients, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		table = new JTable();

		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
			new String[] {
				"ID", "Họ tên", "Giới tính", "Năm sinh", "Quê quán", "Nghề nghiệp", "Số CMND", "ID phiếu khám"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class
			};
			
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			//
			
	
		});
		model= (DefaultTableModel)table.getModel();
		setValuesTable(repdll.getAllPatientFiles(),model);
		scrollPane.setViewportView(table);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Quản lý phiếu");
		btnNewButton.setBounds(10, 11, 150, 23);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				FAddMainForm fAddMainForm = new FAddMainForm();
				fAddMainForm.setVisible(true);
				setVisible(false);
			}
			
		});
		
		JButton btnNewButton_1 = new JButton("Quản lý hồ sơ");
		btnNewButton_1.setBounds(10, 45, 150, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				FFile fFile = new FFile();
				fFile.setVisible(true);
				setVisible(false);
			}
			
		});
		
		JButton btnThanhTon = new JButton("Viện phí");
		btnThanhTon.setBounds(10, 79, 150, 23);
		panel.add(btnThanhTon);
		contentPane.setLayout(gl_contentPane);
	}
}
