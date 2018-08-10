package model;

public class Medicine implements Adapter {
	private int id;
	private String name;
	private String original;
	private String remainQuantity;
	private String unit;
	private String cost;

	public Medicine(int id, String name, String original, String remainQ, String unit, String cost) {
		setId(id);
		setName(name);
		setOriginal(original);
		setRemainQuantity(remainQ);
		setUnit(unit);
		setCost(cost);
	}

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

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRemainQuantity() {
		return remainQuantity;
	}

	public void setRemainQuantity(String remainQuantity) {
		this.remainQuantity = remainQuantity;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public Object[] toObject() {
		return new Object[] { getId(), getName(), getOriginal(), getRemainQuantity(), getUnit(), getCost() };
	}
}
