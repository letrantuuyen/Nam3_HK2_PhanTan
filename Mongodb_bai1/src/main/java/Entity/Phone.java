package Entity;

public class Phone {
	
	private String number;
	private String type;
	public Phone(String number, String type) {
		super();
		this.number = number;
		this.type = type;
	}
	public Phone() {
		super();
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Phone [number=" + number + ", type=" + type + "]";
	}
	

}
