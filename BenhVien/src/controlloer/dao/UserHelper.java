package controlloer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

import model.User;

public class UserHelper implements UserDAO {
	private final String GET_BY_ID = "select * from user where idemployee=?";
	private final String GET_BY_UP ="select * from user where username=? and password=?";
	private final String GET_ALL = "select * from user";
	private final String INSERT_QUERY = "insert into user values(?,?,?,?)";
	private final String UPDATE_QUERY = "update user set idemployee=?,username=?,password=?,isadmin=?  where idemployee=?";
	private final String DELETE_QUERY ="delete from user where idemployee=?";

	private User extractUserFromDataSet(ResultSet rs) throws SQLException {
		User user = new User();
		user.setIdEmployee(rs.getInt("idemployee"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setAdmin(rs.getBoolean("isadmin"));
		return user;
	}
	private void exchangeData(PreparedStatement p, User u) throws SQLException{
		p.setInt(1, u.getIdEmployee());
		p.setString(2, u.getUsername());
		p.setString(3, u.getPassword());
		p.setBoolean(4, u.isAdmin());
	}

	@Override
	public User getUserByUserNameAndPassword(String u, String p) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(GET_BY_UP);

			ps.setString(1, u);
			ps.setString(2, p);
//			System.out.println(ps.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User k = extractUserFromDataSet(rs);
				c.getClose();
				return k;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return null;
	}

	@Override
	public User getUserById(int id) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(GET_BY_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User k = extractUserFromDataSet(rs);
				c.getClose();
				return k;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}

	@Override
	public ArrayList<User> getAllUsers() {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(GET_ALL);
			ArrayList<User> users = new ArrayList<>();
			while(rs.next()) {
				User u = extractUserFromDataSet(rs);
				users.add(u);

			}
			c.getClose();
			return users;
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		c.getClose();
		return null;
	}

	@Override
	public boolean insertUser(User u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
			exchangeData(ps, u);
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

	@Override
	public boolean updateUser(User u) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
			exchangeData(ps, u);
			ps.setInt(5, u.getIdEmployee());
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

	@Override
	public boolean deleteUser(int id) {
		ConnectionFactory c = ConnectionFactory.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
			ps.setInt(1, id);
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

}
