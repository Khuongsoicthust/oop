package model;

public class User {
    private int idEmployee;
    private String username;
    private String password;
    private boolean isAdmin;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public User() {
		
	}
	public User(int idEmployee, String username, String passwd, boolean isAdmin) {
		setIdEmployee(idEmployee); setUsername(username); setPassword(passwd);setAdmin(isAdmin);
	}
}
