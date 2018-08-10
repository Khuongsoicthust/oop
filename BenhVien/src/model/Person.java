package model;

public class Person {
    private int id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String job;
    private int noId;

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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getNoId() {
		return noId;
	}
	public void setNoId(int noId) {
		this.noId = noId;
	}
	public Person() {}
	public Person( int id, String name, String gender, String dateOfBirth, String address, String job, int noId) {
	    setId(id); setName(name); setGender(gender); setDateOfBirth(dateOfBirth); setAddress(address);
	    setJob(job); setNoId(noId);
	}
    
}

