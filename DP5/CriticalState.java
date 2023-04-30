package DP5;

public class CriticalState implements State{
	
	@Override
	public void handleState(Patient patient) {
		if(patient.getCondition().equals("Stable")) {
			patient.setCondition("Critical");
			System.out.println(patient.getName() + "'s condition is Critical !");
		}
		
	}

}
