package DP5;

public class StableState implements State{

	@Override
	public void handleState(Patient patient) {
		if(patient.getCondition().equals("Critical")) {
			patient.setCondition("Stable");
			System.out.println(patient.getName() + "'s condition is stable now !");
		}
		
	}

}
