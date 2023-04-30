package DP5;

public class PatientContext {
	private Patient patient;
	private State state;
	
	public PatientContext(Patient patient) {
		this.patient = patient;
		state = patient.getCondition().equals("Stable") ? new StableState() : new CriticalState();
	}

	public void handleState() {
		state.handleState(patient);
		System.out.println("ALERT ! " + patient.getName() + "'s condition is Critical !");
		
	}
	
	public void setState(State state) {
		this.state = state;
	}
}
