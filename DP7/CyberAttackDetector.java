package DP7;

public class CyberAttackDetector implements NetworkTrafficObserver{
	String attackPattern;
	 
	public CyberAttackDetector(String attackPattern) {
		this.attackPattern = attackPattern;
	}

	@Override
	public void update(String packet) {
		if(packet.contains(attackPattern)) {
			System.out.println("Detected Cyber attack Pattern: " + attackPattern);
			
			// Take appropriate actions to prevent cyber attack
		}
		
	}

}
