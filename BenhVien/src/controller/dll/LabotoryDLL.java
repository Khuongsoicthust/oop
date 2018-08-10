package controller.dll;

import java.util.ArrayList;

import controlloer.dao.DoctorDAO;
import controlloer.dao.LaboDoctorDAO;

import model.LabotoryFile;


public class LabotoryDLL {
    LaboDoctorDAO labDAO = new LaboDoctorDAO();
    DoctorDAO docDAP = new DoctorDAO();
    
    
    public boolean insertLabotory(LabotoryFile sf) {
    	return docDAP.insertLabotoryFile(sf);
    }
    public boolean updateLabotory(LabotoryFile sf) {
    	return labDAO.updateLabotoryFile(sf);
    }
    public ArrayList<LabotoryFile> getAllSpecialistFiles(){
    	ArrayList<LabotoryFile> arr = labDAO.getAllLabotory();
    	return arr;
    }
    public LabotoryFile getLabotoryById(int id) {
    	LabotoryFile lab = new LabotoryFile();
    	lab =labDAO.getLabotoryById(id);
    	return lab;
    }
}
