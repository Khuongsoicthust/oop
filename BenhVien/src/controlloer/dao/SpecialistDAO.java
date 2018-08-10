package controlloer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.PatientFile;
import model.SpecialistFile;

public class SpecialistDAO {
	String updateSpecialistFileQuery="update specialistfile set id=?, iddoctor=?, idconsultingfile=?, cost=?, examdate=?,"
			+ " detail=?, result=? where id=?";
	public final boolean updateSpecialistFile(SpecialistFile u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			
			PreparedStatement ps = con.prepareStatement(updateSpecialistFileQuery);
			ps.setInt(1, u.getId());
			ps.setInt(2, u.getIdDoctor());
			ps.setInt(3, u.getIdConsulting());
			ps.setInt(4, u.getCost());
			ps.setString(5, u.getExamDate());
			ps.setString(6, u.getSpeResult());
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
	public ArrayList<SpecialistFile> getAllSpecialistFile(){
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from specialistfile");
			ArrayList<SpecialistFile> fs = new ArrayList<>();
			while (rs.next()) {
				SpecialistFile u = new SpecialistFile();
				u.setId(rs.getInt("id"));
				u.setIdDoctor(rs.getInt("iddoctor"));
				u.setExamDate(rs.getString("examdate"));
				u.setCost(rs.getInt("cost"));
				u.setSpeResult(rs.getString("detail"));
				u.setIdConsulting(rs.getInt("idconsultingfile"));
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
	public SpecialistFile getSpecialistFileById(int id){
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from specialistfile where id ="+id);
		
			while (rs.next()) {
				SpecialistFile u = new SpecialistFile();
				u.setId(rs.getInt("id"));
				u.setIdDoctor(rs.getInt("iddoctor"));
				u.setExamDate(rs.getString("examdate"));
				u.setCost(rs.getInt("cost"));
				u.setSpeResult(rs.getString("detail"));
				u.setIdConsulting(rs.getInt("idconsultingfile"));
				
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
