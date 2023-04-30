package DP2;

public class AssistanceFactory {
	public Assistance createAssistance(String command) {
		switch(command) {
		case "Schedule Appointment":
			return new ScheduleAppointments();
			
		case "Send SMS":
			return new SendSMS();
			
		default:
			throw new IllegalArgumentException("Unsupported command: " + command);
		}
		
	}
}
