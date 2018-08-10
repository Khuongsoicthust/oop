package controlloer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.ConsultingFile;
import model.LabotoryFile;
import model.PatientFile;
import model.Precription;
import model.SpecialistFile;

public class DoctorDAO extends ReceptionistDAO {

	String insertSpecialistFileQuery = "insert into specialistfile values(?,?,?,?,?,?,?)";
	String updateConsultingFileQuery="update consultingfile set id=?,iddoctor=?,examdate=?,cost=?,result=? where id=?";
    String insertLabotoryFileQuery="insert into labotoryfile values(?,?,?,?,?,?,?,?)";
    String insertPrecriptionQuery ="insert into precription values(?,?,?,?,?,?)";
	public final boolean insertSpecialistFile(SpecialistFile u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(insertSpecialistFileQuery);
			ps.setInt(1, u.getId());
			ps.setInt(2, u.getIdDoctor());
			ps.setString(3, u.getExamDate());
			ps.setInt(4, u.getCost());
			ps.setString(5, u.getResult());
			ps.setString(6, u.getSpeResult());
			ps.setInt(7, u.getIdConsulting());
//			System.out.println(u.getIdConsulting());
		 System.out.println(ps.toString());
			
			
			

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

	public final boolean insertLabotoryFile(LabotoryFile u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(insertLabotoryFileQuery);
			ps.setInt(1, u.getId());
			ps.setInt(2, u.getIdDoctor());
			ps.setString(3, u.getExamDate());
			ps.setInt(4, u.getCost());
			ps.setString(5, u.getDetail());
			ps.setInt(6, u.getIdConsultingFile());
			ps.setString(7, u.getLaboName());
			ps.setString(8, u.getResult());
			System.out.println(ps.toString());
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

	public final boolean updateConsultingFile(ConsultingFile u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(updateConsultingFileQuery);
			ps.setInt(1, u.getId());
			ps.setInt(2, u.getIdDoctor());
			ps.setString(3, u.getExamDate());
			ps.setInt(4, u.getCost());
		
			ps.setString(5, u.getResult());
			ps.setInt(6, u.getId());

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
	public boolean insertPrecription(Precription u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(insertPrecriptionQuery);
            ps.setInt(1, u.getId());
            ps.setInt(2, u.getIdConsultingFile());
            ps.setString(3	,u.getName());
            ps.setInt(4, u.getQuantity());
            ps.setString(5, u.getUnit());
            ps.setString(6, u.getNote());

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
}
