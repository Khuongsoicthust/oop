package model;

public class Employee extends Person implements Adapter {
	private String position;
	private String firstDay;
	private int idRoom;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(String firstDay) {
		this.firstDay = firstDay;
	}

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name, String gender, String dateOfBirth, String address, String job, int noId,
			String p, String f, int idRoom) {
		super(id, name, gender, dateOfBirth, address, job, noId);
		setPosition(p);
		setFirstDay(f);
		setIdRoom(idRoom);
	}

	@Override
	public Object[] toObject() {
		return new Object[] { getId(), getName(), getGender(), getDateOfBirth(), getAddress(), getJob(), getNoId(),
				getPosition(), getFirstDay(), getIdRoom() };
	}

}
