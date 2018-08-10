package model;

public class LabotoryFile extends ConsultingFile implements Adapter{
    private String laboName;
    private String detail;
    private int idConsultingFile;

	public String getLaboName() {
		return laboName;
	}

	public void setLaboName(String laboName) {
		this.laboName = laboName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	public LabotoryFile() {
		super();
	}
	public LabotoryFile(int id, int idDoctor, String examDate, int cost, String result, String laboName, String detail,int idCon) {
		super(id, idDoctor, examDate, cost, result);
		setLaboName(laboName); setDetail(detail);setIdConsultingFile(idCon);
	}
	public Object[] toObject() {
		return new Object[] {
				getId(),getIdDoctor(),getExamDate(),getCost(),getResult(),getLaboName(),getDetail(),getIdConsultingFile()
		};
	}


	public int getIdConsultingFile() {
		return idConsultingFile;
	}

	public void setIdConsultingFile(int idConsultingFile) {
		this.idConsultingFile = idConsultingFile;
	}
	
    
}
