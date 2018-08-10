package controlloer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.ConsultingFile;
import model.PatientFile;
import model.Person;
import model.User;

public class ReceptionistDAO {
	public String insertPatientFileQuery = "insert into patientfile values(?,?,?,?,?,?,?,?)";
	public String getPatientFileByIdQuery = "select * from patientfile where id=?";
	public String getAllPatientFilesQuery = "select * from patientfile";
	public String getAllConsultingFilesQuery = "select * from consultingfile";
    public String updatePatientFileQuery= "update patientfile set id=?,name=?,gender=?,dateofbirth=?,address=?,job=?,noid=?,idconsultingfile=? where id=?";
    public String insertConsultingFileQuery = "insert into consultingfile values(?,?,?,?,?)";
    public String getConsultingFileByIdQuery="select * from consultingfile where id=?";
    public String getAllConsultingFilesByDateQuery= "select * from consultingfile where examdate= ";
	public void exchangeData(PreparedStatement p, PatientFile u) throws SQLException {
		p.setInt(1, u.getId());
		p.setString(2, u.getName());
		p.setString(3, u.getGender());
		p.setString(4, u.getDateOfBirth());
		p.setString(5, u.getAddress());
		p.setString(6, u.getJob());
		p.setInt(7, u.getNoId());
		p.setInt(8, u.getIdConsultingFile());

	}

	private PatientFile extractPatientFileFromDataSet(ResultSet rs) throws SQLException {
		PatientFile p = new PatientFile();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setGender(rs.getString("gender"));
		p.setDateOfBirth(rs.getString("dateofbirth"));
		p.setAddress(rs.getString("address"));
		p.setJob(rs.getString("job"));
		p.setNoId(rs.getInt("noid"));
		p.setIdConsultingFile(rs.getInt("idconsultingfile"));

		return p;
	}

	// note: handler stringer - insertPatientFile => insertConsultingFile
	public final boolean insertPatientFile(PatientFile u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(insertPatientFileQuery);
			exchangeData(ps, u);

			int i = ps.executeUpdate();
			if (i == 1) {
				c.getClose();
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return false;
	}

	public PatientFile getPatientFile(int id) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(getPatientFileByIdQuery);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				PatientFile k = extractPatientFileFromDataSet(rs);
				c.getClose();
				return k;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}

	public ArrayList<PatientFile> getAllPatientFiles() {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(getAllPatientFilesQuery);
			ArrayList<PatientFile> fs = new ArrayList<>();
			while (rs.next()) {
				PatientFile u = extractPatientFileFromDataSet(rs);
				fs.add(u);

			}
			c.getClose();
			return fs;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}
	public ArrayList<ConsultingFile> getConsultingFiles() {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(getAllConsultingFilesQuery);
			ArrayList<ConsultingFile> fs = new ArrayList<>();
			while (rs.next()) {
				ConsultingFile u = new ConsultingFile();
				u.setId(rs.getInt("id"));;
				u.setIdDoctor(rs.getInt("iddoctor"));
				u.setExamDate(rs.getString("examdate"));
				u.setCost(rs.getInt("cost"));
				u.setResult(rs.getString("result"));
				fs.add(u);

			}
			c.getClose();
			return fs;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}

	public final boolean updatePatientFile(PatientFile u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(updatePatientFileQuery);
			exchangeData(ps, u);
			ps.setInt(9, u.getId());
			System.out.println(ps.toString());
			int i = ps.executeUpdate();
			if(i==1) {
				c.getClose();
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return false;
	}
	public final boolean insertConsultingFile(ConsultingFile u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(insertConsultingFileQuery);
			ps.setInt(1, u.getId());
			ps.setInt(2, u.getIdDoctor());
			ps.setString(3, u.getExamDate());
			ps.setInt(4, u.getCost());
			ps.setString(5, u.getResult());
			int i = ps.executeUpdate();
			if (i == 1) {
				c.getClose();
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return false;
	}
	public ConsultingFile getConsultingFileById(int id) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(getConsultingFileByIdQuery);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ConsultingFile file = new ConsultingFile();
				file.setId(rs.getInt("id"));
				file.setIdDoctor(rs.getInt("idDoctor"));
				file.setExamDate(rs.getString("examdate"));
				file.setCost(rs.getInt("cost"));
				file.setResult(rs.getString("result"));
				
				c.getClose();
				return file;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}
	public ArrayList<ConsultingFile> getAllConsultingFilesByDate(String sDate) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(getAllConsultingFilesByDateQuery+"'"+sDate+"'");
			System.out.println(getAllConsultingFilesByDateQuery+sDate);
			ArrayList<ConsultingFile> fs = new ArrayList<>();
			while (rs.next()) {
				ConsultingFile file = new ConsultingFile();
				file.setId(rs.getInt("id"));
				file.setIdDoctor(rs.getInt("idDoctor"));
				file.setExamDate(rs.getString("examdate"));
				file.setCost(rs.getInt("cost"));
				file.setResult(rs.getString("result"));
				fs.add(file);

			}
			c.getClose();
			return fs;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}
	public int getNumberOfRecordsByNameTable(String nameTable) {
		int count=0;
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select count(*) from "+nameTable);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				 count = rs.getInt(1);
				
				c.getClose();
				return count;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return count;
	}
	


	


}
