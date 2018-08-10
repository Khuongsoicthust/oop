package model;

public class ConsultingFile implements Adapter {
	private int id;
	private int idDoctor;
	private String examDate;
	private int cost;
	private String result;

	public int getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public ConsultingFile() {
	}

	public ConsultingFile(int id, int idDoctor, String examDate, int cost, String result) {
		setId(id);
		setIdDoctor(idDoctor);

		setExamDate(examDate);
		setCost(cost);
		setResult(result);
	}

	public Object[] toObject() {
		return new Object[] { getId(), getIdDoctor(), getExamDate(), getCost() ,getResult()};
	}

}
