package model;

public class PatientFile extends Person implements Adapter {
	private int idConsultingFile;

	public int getIdConsultingFile() {
		return idConsultingFile;
	}

	public void setIdConsultingFile(int idConsultingFile) {
		this.idConsultingFile = idConsultingFile;
	}

	public PatientFile() {
		super();
	}

	public PatientFile(int id, String name, String gender, String dateOfBirth, String address, String job, int noId,
			int idCon) {
		super(id, name, gender, dateOfBirth, address, job, noId);
		setIdConsultingFile(idCon);
	}

	@Override
	public Object[] toObject() {
		return new Object[] { getId(), getName(), getGender(), getDateOfBirth(), getAddress(), getJob(), getNoId(),
				getIdConsultingFile() };
	}

}
