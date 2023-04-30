package DP5;

public class Main {

	public static void main(String[] args) {
		Patient patient = new Patient("John", "Stable");
		PatientContext context = new PatientContext(patient);

		Patient patient1 = new Patient("Jolly", "Stable");
		PatientContext context1 = new PatientContext(patient1);

		// Change the patient's condition
		patient.setCondition("Critical");
		context.handleState();
		patient1.setCondition("Critical");
		context1.handleState();

		// Change the patient's condition again
		patient.setCondition("Stable");
		context.handleState();
		patient1.setCondition("Stable");
		context1.handleState();
 
	}

}
