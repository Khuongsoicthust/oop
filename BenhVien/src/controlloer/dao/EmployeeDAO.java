package controlloer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ConsultingFile;
import model.Employee;
import model.PatientFile;
import model.User;

public class EmployeeDAO {
	String getEmployeeByIdQuery ="select * from employee where id=?;";
	String getAllEmloyeeByPositionQuery = "select * from employee where position=?";
	private Employee extractEmployeeFromDataSet(ResultSet rs) throws SQLException {
		Employee p = new Employee();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setGender(rs.getString("gender"));
		p.setDateOfBirth(rs.getString("dateofbirth"));
		p.setAddress(rs.getString("address"));
		p.setJob(rs.getString("job"));
		p.setNoId(rs.getInt("noid"));
		p.setPosition(rs.getString("position"));
		p.setIdRoom(rs.getInt("idroom"));
		p.setFirstDay(rs.getString("firstday"));

		return p;
	}
	public Employee getEmployeeById(int id) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(getEmployeeByIdQuery);
			ps.setInt(1, id);
//			System.out.println(ps.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee k = extractEmployeeFromDataSet(rs);
				c.getClose();
				return k;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}
	public ArrayList<Employee> getAllEmloyeeByPosition(String posi) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(getAllEmloyeeByPositionQuery);
			ps.setString(1, posi);
//			System.out.println(ps.toString());
			ResultSet rs = ps.executeQuery();
			ArrayList<Employee> ems = new ArrayList<>();
			while (rs.next()) {
				Employee k = extractEmployeeFromDataSet(rs);
				ems.add(k);

			}
			c.getClose();
			return ems;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}
    
}
