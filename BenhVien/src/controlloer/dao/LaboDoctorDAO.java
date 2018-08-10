package controlloer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.LabotoryFile;
import model.SpecialistFile;

public class LaboDoctorDAO {
	String updateLabotoryFileQuery="update labotoryfile set id=?, iddoctor=?, idconsulting=?, cost=?, examdate=?,detail=?,result=? where id=?";
	public final boolean updateLabotoryFile(LabotoryFile u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(updateLabotoryFileQuery);
			ps.setInt(1, u.getId());
			ps.setInt(2, u.getIdDoctor());
			ps.setInt(3, u.getIdConsultingFile());
			ps.setInt(4, u.getCost());
			ps.setString(5, u.getExamDate());
			ps.setString(6, u.getDetail());
			ps.setString(7, u.getResult());
            ps.setInt(8, u.getId());
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
	public ArrayList<LabotoryFile> getAllLabotory(){
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from labotoryfile");
			ArrayList<LabotoryFile> fs = new ArrayList<>();
			while (rs.next()) {
				LabotoryFile u = new LabotoryFile();
				u.setId(rs.getInt("id"));
				u.setIdDoctor(rs.getInt("iddoctor"));
				u.setExamDate(rs.getString("examdate"));
				u.setCost(rs.getInt("cost"));
				u.setDetail(rs.getString("detail"));
				u.setIdConsultingFile(rs.getInt("idconsultingfile"));
				u.setLaboName(rs.getString("namelabotory"));
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
	public LabotoryFile getLabotoryById(int id){
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from labotoryfile where id ="+id);
		
			while (rs.next()) {
				LabotoryFile u = new LabotoryFile();
				u.setId(rs.getInt("id"));
				u.setIdDoctor(rs.getInt("iddoctor"));
				u.setExamDate(rs.getString("examdate"));
				u.setCost(rs.getInt("cost"));
				u.setDetail(rs.getString("detail"));
				u.setIdConsultingFile(rs.getInt("idconsulting"));
				u.setLaboName(rs.getString("namelabotory"));
				u.setResult(rs.getString("result"));
				
				c.getClose();
				return u;

			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}

}
