package controller.dll;

import java.util.ArrayList;

import controlloer.dao.DoctorDAO;
import controlloer.dao.SpecialistDAO;
import model.SpecialistFile;

public class SpecialistDLL {
    SpecialistDAO speDAO = new SpecialistDAO();
    DoctorDAO docDAP = new DoctorDAO();
    
    
    public boolean insertSpecilistFile(SpecialistFile sf) {
    	System.out.println(sf.getIdConsulting());
    	return docDAP.insertSpecialistFile(sf);
    }
    public boolean updateSpecialistFile(SpecialistFile sf) {
    	return speDAO.updateSpecialistFile(sf);
    }
    public ArrayList<SpecialistFile> getAllSpecialistFiles(){
    	ArrayList<SpecialistFile> arr = speDAO.getAllSpecialistFile();
    	return arr;
    }
    public SpecialistFile getSpecialistFileById(int id) {
    	SpecialistFile s = new SpecialistFile();
    	s = speDAO.getSpecialistFileById(id);
    	return s;
    }
}
