package lesson9_inheritance;

public class Judoka extends Athlete{
	int weight;
	public Judoka() {
		System.out.println("Creating Judoka");
	}
	
	public Judoka(String athleteName, String[] achievements, int weight) {
		//this.athleteName = athleteName;
		//this.achievements = achievements;
		super(athleteName, achievements);
		this.weight = weight;
	}

}
