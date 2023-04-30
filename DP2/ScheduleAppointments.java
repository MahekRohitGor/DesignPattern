package DP2;
import java.util.Scanner;
public class ScheduleAppointments implements Assistance{

	@Override
	public void performTask(String Task) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time at which appointment is to be scheduled: ");
		String time = sc.nextLine();
		System.out.println("\nAppointment Scheduled at: " + time);
	}

}
