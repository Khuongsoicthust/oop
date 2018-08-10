package controller.dll;

import controlloer.dao.DoctorDAO;
import controlloer.dao.ReceptionistDAO;
import model.ConsultingFile;

public class GeneralDoctor {
	ReceptionistDAO rep = new ReceptionistDAO();
	DoctorDAO doc = new DoctorDAO();
    public boolean updateConsultingFile(ConsultingFile cf) {
		return doc.updateConsultingFile(cf);
	}
}
