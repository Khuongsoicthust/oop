package model;

public class Precription {
	private int idConsultingFile;
	private int id;
	private String name;
	private int quantity;
	private String unit;
	private String Note;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Precription() {
	}

	public Precription(int id, String name, int quantity, String unit, String Note, int idConsultingFile) {
	setId(id);setName(name);setQuantity(quantity);setUnit(unit);setNote(Note);setIdConsultingFile(idConsultingFile);
	}

	public int getIdConsultingFile() {
		return idConsultingFile;
	}

	public void setIdConsultingFile(int idConsultingFile) {
		this.idConsultingFile = idConsultingFile;
	}

}
