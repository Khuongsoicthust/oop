package view2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.dll.GeneralDoctor;
import controller.dll.LabotoryDLL;
import controller.dll.ReceptionistDLL;
import model.ConsultingFile;
import model.LabotoryFile;

import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class LabotoryFileInterface extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtCost;
	private JTextField txtResult;
	private JTextField txtIdSearch;
	private JTextField txtDetail;
	private JTextField txtIdCF;
	ReceptionistDLL repcll = new ReceptionistDLL();
	GeneralDoctor docDao = new GeneralDoctor();
	DefaultTableModel model;
	Genneral gen = new Genneral();
	LabotoryDLL labdll = new LabotoryDLL();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabotoryFileInterface frame = new LabotoryFileInterface();
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
	private void setValuesTable(DefaultTableModel modell, ArrayList<LabotoryFile> pfile) {

		for (LabotoryFile p : pfile) {
			modell.addRow(p.toObject());
		}
	}

	public LabotoryFileInterface() {
		setTitle("Qu\u1EA3n l\u00ED x\u00E9t nghi\u1EC7m");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		setSize(1000, 500);
		setLocation(500, 200);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setLayout(null);

		JButton button_3 = new JButton("Thanh to\u00E1n");
		button_3.setBounds(10, 149, 107, 23);
		panel_2.add(button_3);

		JButton btnSearch = new JButton("T\u00ECm ki\u1EBFm");
		btnSearch.setBounds(10, 11, 91, 23);
		panel_2.add(btnSearch);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(60).addComponent(panel,
										GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addComponent(panel_2,
										GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
						.addGap(22))
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(29)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(21).addComponent(panel_1,
								GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE).addGap(19)));

		txtIdSearch = new JTextField();
		txtIdSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		txtIdSearch.setBounds(111, 12, 86, 20);
		panel_2.add(txtIdSearch);
		txtIdSearch.setColumns(10);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 12, 107, 23);
		panel_1.add(lblNewLabel);

		JLabel lblHTn = new JLabel("T\u00EAn x\u00E9t nghi\u1EC7m");
		lblHTn.setBounds(10, 45, 107, 23);
		panel_1.add(lblHTn);

		JLabel lblNmSinh = new JLabel("Chi ph\u00ED kh\u00E1m");
		lblNmSinh.setBounds(10, 115, 107, 23);
		panel_1.add(lblNmSinh);

		JLabel lblGiiTnh = new JLabel("Id b\u00E1c s\u0129");
		lblGiiTnh.setBounds(10, 81, 107, 23);
		panel_1.add(lblGiiTnh);

		JLabel lblKtLun = new JLabel("K\u1EBFt lu\u1EADn");
		lblKtLun.setBounds(10, 149, 107, 23);
		panel_1.add(lblKtLun);

		txtId = new JTextField();
		gen.fillTxt(txtId, "labotoryfile");
		txtId.setBounds(127, 12, 130, 22);
		panel_1.add(txtId);
		txtId.setColumns(10);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(127, 46, 130, 22);
		panel_1.add(txtName);

		JComboBox cbIdDoctor = new JComboBox();
		gen.fillCb(cbIdDoctor, repcll.getAllDoctorIdAndName());
		cbIdDoctor.setBounds(127, 82, 130, 23);
		panel_1.add(cbIdDoctor);

		txtCost = new JTextField();
		txtCost.setColumns(10);
		txtCost.setBounds(127, 116, 130, 22);
		panel_1.add(txtCost);

		txtResult = new JTextField();
		txtResult.setColumns(10);
		txtResult.setBounds(127, 150, 130, 22);
		panel_1.add(txtResult);

		JLabel lblChiTit = new JLabel("Chi ti\u1EBFt");
		lblChiTit.setBounds(10, 183, 107, 23);
		panel_1.add(lblChiTit);

		JLabel lblIdPhiuKhm = new JLabel("ID phi\u1EBFu kh\u00E1m");
		lblIdPhiuKhm.setBounds(10, 217, 107, 23);
		panel_1.add(lblIdPhiuKhm);

		txtDetail = new JTextField();
		txtDetail.setColumns(10);
		txtDetail.setBounds(127, 184, 130, 22);
		panel_1.add(txtDetail);

		txtIdCF = new JTextField();
		gen.fillTxt(txtIdCF, "consultingfile");
		txtIdCF.setColumns(10);
		txtIdCF.setBounds(127, 218, 130, 22);
		panel_1.add(txtIdCF);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, },
				new String[] { "ID", "ID b\u00E1c s\u0129", "Ng\u00E0y kh\u00E1m", "Chi ph\u00ED kh\u00E1m",
						"Chi ti\u1EBFt", "ID phi\u1EBFu kh\u00E1m", "T\u00EAn x\u00E9t nghi\u1EC7m",
						"K\u1EBFt lu\u1EADn c\u1EE7a b\u00E1c s\u0129" }) {
			Class[] columnTypes = new Class[] { Integer.class, Integer.class, String.class, String.class, String.class,
					Integer.class, Object.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(7).setPreferredWidth(136);
		model = (DefaultTableModel) table.getModel();
		setValuesTable(model, labdll.getAllSpecialistFiles());
		scrollPane.setViewportView(table);
		panel.setLayout(null);

		JButton btnAdd = new JButton("Th\u00EAm m\u1EDBi");
		btnAdd.setBounds(10, 11, 107, 23);
		panel.add(btnAdd);

		JButton btnUpdate = new JButton("C\u1EADp nh\u1EADt");
		btnUpdate.setBounds(10, 45, 107, 23);
		panel.add(btnUpdate);

		JButton btnStatic = new JButton("Th\u1ED1ng k\u00EA");
		btnStatic.setBounds(10, 79, 107, 23);
		panel.add(btnStatic);

		JButton btnReturn = new JButton("Tr\u1EDF v\u1EC1");
		btnReturn.setBounds(10, 113, 107, 23);
		panel.add(btnReturn);
		contentPane.setLayout(gl_contentPane);
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtId.getText());
				String idAndName = cbIdDoctor.getSelectedItem().toString();
				int idDoctor = Integer.parseInt(idAndName.substring(idAndName.indexOf("-") + 1));
				int cost = Integer.parseInt(txtCost.getText());
				String result = txtResult.getText();
				String examedDay = LocalDate.now().toString();
				String laboName = txtName.getText();
				String detail = txtDetail.getText();
				int idCon = Integer.parseInt(txtIdCF.getText());
				System.out.println(id);
				LabotoryFile u = new LabotoryFile(id,idDoctor,examedDay,cost,result,laboName,detail,idCon);
				if (repcll.insertConsultingFile(u)) {
					JOptionPane.showMessageDialog(btnAdd, "Đã tạo");
					LabotoryFileInterface cons = new LabotoryFileInterface();
					cons.main(null);
					;
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(btnAdd, "Lỗi");
				}

			}
		});
	}
}
