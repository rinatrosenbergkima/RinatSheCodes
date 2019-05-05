package lesson10_polymorphism_accessModifiers_objectClass;

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
	public void setName(String name) {
		this.athleteName = name;
	}
	
	
}
