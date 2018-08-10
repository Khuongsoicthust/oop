package controlloer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Precription;

public class PharamistDAO {
	String insertPrecriptionQuery="update precription set id=?,idconsulting=?,name=?,quatity=?,unit=?,note=? where id=?";
	public boolean updatePrecription(Precription u) {
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
            ps.setInt(7, u.getId());
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
