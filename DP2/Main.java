package DP2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		AssistanceFactory fassistance = new AssistanceFactory();
		String command;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Command: ");
		command = sc.nextLine();
		Assistance assistance = fassistance.createAssistance(command);
		assistance.performTask(command);
		
	}
}
