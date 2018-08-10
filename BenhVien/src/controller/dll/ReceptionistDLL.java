package controller.dll;

import java.util.ArrayList;

import controlloer.dao.EmployeeDAO;
import controlloer.dao.ReceptionistDAO;
import model.ConsultingFile;
import model.Employee;
import model.PatientFile;

public class ReceptionistDLL {
	ReceptionistDAO recep = new ReceptionistDAO();
	EmployeeDAO emp = new EmployeeDAO();
	public ArrayList<PatientFile> getAllPatientFiles(){
		ArrayList<PatientFile> list = recep.getAllPatientFiles();
		return list;
	}
	public boolean insertConsultingFile(ConsultingFile u) {
		return recep.insertConsultingFile(u);
	}
	public ArrayList<String> getAllDoctorIdAndName(){
		ArrayList<String> d = new ArrayList<>();
		ArrayList<Employee> list = emp.getAllEmloyeeByPosition("bac si");
		for (Employee employee : list) {
			String s = employee.getName()+"-"+employee.getId();
			d.add(s);
		}
		return d;
		
	}
	public int getLastIdByTableName(String name) {
		int i = recep.getNumberOfRecordsByNameTable(name);
		return i;
	}
	public int getConsultingFileByDate(String date){
		System.out.println(date);
		ArrayList<ConsultingFile> cf = recep.getAllConsultingFilesByDate(date);
		if(cf!=null) {
			return cf.size();
		}
		return 0;
	}
	public boolean insertConsultingFile(PatientFile u) {
		return recep.insertPatientFile(u);
	}
	public boolean updatePatientFile(PatientFile u) {
		System.out.println(u.toString());
		return recep.updatePatientFile(u);
	}
	public PatientFile getPatientFile(int id) {
		PatientFile p = recep.getPatientFile(id);
		return p;
	}
	public ConsultingFile getConsulting(int id) {
		ConsultingFile c = recep.getConsultingFileById(id);
		return c;
	}
	public ArrayList<ConsultingFile> getAllConsultingFile(){
		ArrayList<ConsultingFile> arr = recep.getConsultingFiles();
		return arr;
	}
    
}
