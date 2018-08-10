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

import controller.dll.ReceptionistDLL;
import model.Adapter;
import model.PatientFile;

import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class FileInterface extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtBirth;
	private JTextField txtAddress;
	private JTextField txtJob;
	private JTextField txtNoId;
	private JTextField txtIdCF;
	private JTextField textField_7;
	Genneral gen = new Genneral();
	ReceptionistDLL repdll = new ReceptionistDLL();

	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileInterface frame = new FileInterface();
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
	private void setValuesTable(DefaultTableModel modell, ArrayList<PatientFile> pfile) {

		for (PatientFile p : pfile) {
			modell.addRow(p.toObject());
		}
	}

	private int[] setValuesWhenUpdate(JComboBox cbGender, JTable tble) {
		int[] ids = new int[2];
		int r = tble.getSelectedRow();
		System.out.println(r);
		if (r != -1) {
			txtId.setText(model.getValueAt(r, 0).toString());
			txtName.setText(model.getValueAt(r, 1).toString());
			cbGender.setSelectedItem(model.getValueAt(r, 2).toString());
			txtBirth.setText(model.getValueAt(r, 3).toString());
			txtAddress.setText(model.getValueAt(r, 4).toString());
			txtJob.setText(model.getValueAt(r, 5).toString());
			txtNoId.setText(model.getValueAt(r, 6).toString());
			txtIdCF.setText(model.getValueAt(r, 7).toString());
			ids[0] = Integer.parseInt(txtId.getText());
			ids[1] = Integer.parseInt(txtIdCF.getText());
			return ids;
		}
		return ids;
	}

	public FileInterface() {
		setTitle("Qu\u1EA3n l\u00ED h\u1ED3 s\u01A1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		setSize(1000, 500);
		setLocation(500, 200);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setLayout(null);

		JButton btnSearch = new JButton("T\u00ECm ki\u1EBFm ");
		btnSearch.setBounds(10, 11, 91, 23);
		panel_2.add(btnSearch);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.PINK);
		
		JButton btnLoad = new JButton("Làm mới");
		btnLoad.setBounds(10, 147, 107, 23);
		panel.add(btnLoad);

		JButton btnAdd = new JButton("Th\u00EAm m\u1EDBi");

		btnAdd.setBounds(10, 11, 107, 23);
		panel.add(btnAdd);

		JButton btnUpdate = new JButton("C\u1EADp nh\u1EADt");
		btnUpdate.setBounds(10, 45, 107, 23);
		panel.add(btnUpdate);

		JButton btnSave = new JButton("Lưu");
		btnSave.setBounds(10, 79, 107, 23);
		panel.add(btnSave);

		JButton btnReturn = new JButton("Tr\u1EDF v\u1EC1");
		btnReturn.setBounds(10, 113, 107, 23);
		panel.add(btnReturn);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(
								gl_contentPane.createSequentialGroup().addGap(18)
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 201,
												GroupLayout.PREFERRED_SIZE)
										.addGap(22))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addGap(48))))
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup().addGap(32)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(panel_1,
								GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE).addGap(19)));

		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		textField_7.setBounds(111, 12, 86, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 11, 107, 23);
		panel_1.add(lblNewLabel);

		JLabel lblHTn = new JLabel("H\u1ECD t\u00EAn");
		lblHTn.setBounds(10, 45, 107, 23);
		panel_1.add(lblHTn);

		JLabel lblNmSinh = new JLabel("N\u0103m sinh");
		lblNmSinh.setBounds(10, 115, 107, 23);
		panel_1.add(lblNmSinh);

		JLabel lblGiiTnh = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblGiiTnh.setBounds(10, 81, 107, 23);
		panel_1.add(lblGiiTnh);

		JLabel label = new JLabel("Qu\u00EA qu\u00E1n");
		label.setBounds(10, 149, 107, 23);
		panel_1.add(label);

		JLabel lblNghNghip = new JLabel("Ngh\u1EC1 nghi\u1EC7p");
		lblNghNghip.setBounds(10, 183, 107, 23);
		panel_1.add(lblNghNghip);

		JLabel lblSCmnd = new JLabel("S\u1ED1 CMND");
		lblSCmnd.setBounds(10, 217, 107, 23);
		panel_1.add(lblSCmnd);

		JLabel lblIdPhiuKhm = new JLabel("ID phi\u1EBFu kh\u00E1m");
		lblIdPhiuKhm.setBounds(10, 251, 107, 23);
		panel_1.add(lblIdPhiuKhm);

		txtId = new JTextField();
		gen.fillTxt(txtId, "patientfile");
		txtId.setBounds(127, 12, 130, 22);
		panel_1.add(txtId);
		txtId.setColumns(10);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(127, 46, 130, 22);
		panel_1.add(txtName);

		JComboBox cbGender = new JComboBox();
		String[] gender = { "nam", "nữ" };
		gen.fillCb(cbGender, gender);
		cbGender.setBounds(127, 82, 130, 23);
		panel_1.add(cbGender);

		txtBirth = new JTextField();
		txtBirth.setColumns(10);
		txtBirth.setBounds(127, 116, 130, 22);
		panel_1.add(txtBirth);

		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(127, 150, 130, 22);
		panel_1.add(txtAddress);

		txtJob = new JTextField();
		txtJob.setColumns(10);
		txtJob.setBounds(127, 184, 130, 22);
		panel_1.add(txtJob);

		txtNoId = new JTextField();
		txtNoId.setColumns(10);
		txtNoId.setBounds(127, 218, 130, 22);
		panel_1.add(txtNoId);

		txtIdCF = new JTextField();
		txtIdCF.setColumns(10);
		txtIdCF.setBounds(127, 252, 130, 22);
		panel_1.add(txtIdCF);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "H\u1ECD t\u00EAn", "Gi\u1EDBi t\u00EDnh", "N\u0103m sinh", "Qu\u00EA qu\u00E1n",
						"Ngh\u1EC1 nghi\u1EC7p", "S\u1ED1 CMND", "ID phi\u1EBFu kh\u00E1m" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class, String.class,
					String.class, Integer.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		model = (DefaultTableModel) table.getModel();
		setValuesTable(model, repdll.getAllPatientFiles());
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		
		btnLoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		    FileInterface f = new FileInterface();
		    f.main(null);
		    setVisible(false);
				
			}
		});
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int id = repdll.getLastIdByTableName("patientfile") + 1;
				String name = txtName.getText();
				String gender = cbGender.getSelectedItem().toString();
				String birht = txtBirth.getText();
				String address = txtAddress.getText();
				String job = txtJob.getText();
				int noId = Integer.parseInt(txtNoId.getText());
				int idConsultingFile = repdll.getLastIdByTableName("consultingfile") + 1;
				PatientFile p = new PatientFile(id, name, gender, birht, address, job, noId, idConsultingFile);
				if (repdll.insertConsultingFile(p)) {
					JOptionPane.showMessageDialog(btnUpdate, "Đã tạo thành công, vui lòng update phiếu khám!");
					ConsultingFileInterface c = new ConsultingFileInterface();
					c.setVisible(false);
					c.main(null);
				} else {
					JOptionPane.showMessageDialog(btnAdd, "Có lỗi xảy ra");
				}
				System.out.println("khuongsdasddddddddd");

			}
		});

		btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int[] ids = setValuesWhenUpdate(cbGender, table);
				txtId.setEditable(false);
				txtIdCF.setEditable(false);

			}
		});
		btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ReceptionistInterface r = new ReceptionistInterface();
				setVisible(false);
				r.main(null);

			}
		});
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField_7.getText());
				
				PatientFile p = repdll.getPatientFile(id);
				System.out.println(p.getAddress());
				ArrayList<PatientFile> arr = new ArrayList<>();
				arr.add(p);
				model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				setValuesTable(model, arr);
				
				
				
			}
		});
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtId.getText());
				String name = txtName.getText();
				String gender = cbGender.getSelectedItem().toString();
				String birht = txtBirth.getText();
				String address = txtAddress.getText();
				String job = txtJob.getText();
				int noId = Integer.parseInt(txtNoId.getText());
				int idConsultingFile = Integer.parseInt(txtIdCF.getText());
				PatientFile p = new PatientFile(id, name, gender, birht, address, job, noId, idConsultingFile);
				if (repdll.updatePatientFile(p)) {
					JOptionPane.showMessageDialog(btnUpdate, "Đã cập nhật thành công");
					setVisible(false);
					FileInterface f = new FileInterface();
					f.main(null);

				} else {
					JOptionPane.showMessageDialog(btnUpdate, "Có lỗi xảy ra");
				}

			}
		});

	}

}
