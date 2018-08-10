package controller.dll;

import controlloer.dao.EmployeeDAO;
import controlloer.dao.ReceptionistDAO;
import controlloer.dao.UserDAO;
import controlloer.dao.UserHelper;
import model.Employee;
import model.User;

public class UserDLL {
    UserDAO userInstace = new UserHelper();
    ReceptionistDAO recepInstance = new ReceptionistDAO();
    public boolean Login(String u, String p) {
    	if(userInstace.getUserByUserNameAndPassword(u, p)!=null) {
    		return true;
    	}
    	return false;
    }
    EmployeeDAO em = new EmployeeDAO();
    public int getLogin(String u, String p) {
    	User user = userInstace.getUserByUserNameAndPassword(u, p);
    	Employee emp = em.getEmployeeById(user.getIdEmployee());
    	String check = emp.getPosition();

    	int k = 0;
    	if(check.equals("y ta")) {
    		k = 1;
    	}
    	else if (check.equals("bac si da khoa")) {
			k = 2;
		}
    	else if (check.equals("quan tri he thong")) {
			k=3;
		}
    	else if(check.equals("bac si chuyen khoa")) {
    		k=4;
    	}
    	else if (check.equals("bac si xet nghiem")) {
			k=5;
		}
    	else if (check.equals("duoc si")) {
			k=6;
		}
    	return k;
    }
    
}
