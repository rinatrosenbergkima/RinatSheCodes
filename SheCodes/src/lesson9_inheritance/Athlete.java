package lesson9_inheritance;

import java.util.Arrays;

public class Athlete {
	String athleteName;
	String[] achievements;
	
	public Athlete() {
		System.out.println("Creating Athlete");
	}
	public Athlete(String athleteName, String[] achievements) {
		super();
		this.athleteName = athleteName;
		this.achievements = achievements; 
	}
	@Override
	public String toString() {
		return "Athlete [athleteName=" + athleteName + 
				", achievements=" + Arrays.toString(achievements) + "]";
	}
	
	
}
