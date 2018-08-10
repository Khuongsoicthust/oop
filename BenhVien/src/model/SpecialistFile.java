package model;

public class SpecialistFile extends ConsultingFile implements Adapter {
	private String speResult;
	private int idConsulting;

	public String getSpeResult() {
		return speResult;
	}

	public void setSpeResult(String speResult) {
		this.speResult = speResult;
	}

	public SpecialistFile() {
		super();
	}

	public SpecialistFile(int id, int idDoctor, int idConsulting, String examDate, int cost, String result,
			String spe) {
		super(id, idDoctor, examDate, cost, result);
		setSpeResult(spe);
		setIdConsulting(idConsulting);
	}

	public Object[] toObject() {
		return new Object[] { getId(), getIdDoctor(), getExamDate(), getCost(), getResult(), getSpeResult(),
				getIdConsulting(), };
	}

	public int getIdConsulting() {
		return idConsulting;
	}

	public void setIdConsulting(int idConsulting) {
		this.idConsulting = idConsulting;
	}

}
