package DP2;

import java.util.Scanner;

public class SendSMS implements Assistance{

	@Override
	public void performTask(String Task) {
		Scanner sc = new Scanner(System.in);
		System.out.println("To whom you want to send message ? ");
		String name = sc.nextLine();
		System.out.println("\nSMS sent to: " + name);
		
	}

}
