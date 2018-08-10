package view2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
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
import model.Adapter;
import model.ConsultingFile;
import model.PatientFile;

import java.awt.Color;

public class ReceptionistInterface extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumberOfPatients;
	private JTable table;
    ReceptionistDLL repdll = new ReceptionistDLL();
    
    DefaultTableModel model ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceptionistInterface frame = new ReceptionistInterface();
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
    
    
	public void setValuesTable(DefaultTableModel modell) {
		ArrayList<PatientFile> pfile = repdll.getAllPatientFiles();
		for (PatientFile patientFile : pfile) {
			modell.addRow(patientFile.toObject());
		}
		
		
	}
	public void fillTxtNumberOfPatients(JTextField j) {
		String date = LocalDate.now().toString();
		int count = repdll.getConsultingFileByDate(date);
		j.setText(String.valueOf(count));
	}
	public ReceptionistInterface() {
		setTitle("B\u00E0n ph\u00E1t phi\u1EBFu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setSize(1000, 500);
		setLocation(500, 200);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		
		JLabel lblNewLabel = new JLabel("S\u1ED1 b\u1EC7nh nh\u00E2n hi\u1EC7n t\u1EA1i:");
		
		txtNumberOfPatients = new JTextField();
		txtNumberOfPatients.setColumns(10);
		fillTxtNumberOfPatients(txtNumberOfPatients);
		
		JButton btnExit = new JButton("Tho\u00E1t");
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(1);
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(38)
									.addComponent(txtNumberOfPatients, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnExit)
							.addGap(21))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnExit)
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtNumberOfPatients, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, 0, 0, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {

			},
			new String[] {
				"ID", "H\u1ECD t\u00EAn", "Gi\u1EDBi t\u00EDnh", "N\u0103m sinh", "Qu\u00EA qu\u00E1n", "Ngh\u1EC1 nghi\u1EC7p", "S\u1ED1 CMND", "ID phi\u1EBFu kh\u00E1m"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		panel.setLayout(null);
		model= (DefaultTableModel)table.getModel();
		setValuesTable(model);
		JButton btnCF = new JButton("Phi\u1EBFu kh\u00E1m");
		btnCF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ConsultingInterfce cf = new ConsultingInterfce();
				cf.setVisible(false);
				cf.main(null);
				
			}
		});
		btnCF.setBounds(10, 11, 120, 23);
		panel.add(btnCF);
		
		JButton btnFile = new JButton("H\u1ED3 s\u01A1");
		btnFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileInterface f = new FileInterface();
				f.setVisible(false);
				f.main(null);
				
			}
		});
		btnFile.setBounds(10, 45, 120, 23);
		panel.add(btnFile);
		
		JButton btnFee = new JButton("Vi\u1EC7n ph\u00ED");
		btnFee.setBounds(10, 81, 120, 23);
		panel.add(btnFee);
		contentPane.setLayout(gl_contentPane);
		
	}
}
