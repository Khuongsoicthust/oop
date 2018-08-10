package controlloer.dao;

import java.util.ArrayList;

import model.User;

public interface UserDAO {
    User getUserByUserNameAndPassword(String u, String p);
    User getUserById(int id);
    ArrayList<User> getAllUsers();
    boolean insertUser(User u);
    boolean updateUser(User u );
    boolean deleteUser(int id);
}
