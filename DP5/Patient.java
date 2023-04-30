package DP5;

public class Patient {
	private String name;
	private String condition;
	
	public Patient(String name, String condition) {
		this.name = name;
		this.condition = condition;
	}
	
	public String getName() {
		return name;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
}
