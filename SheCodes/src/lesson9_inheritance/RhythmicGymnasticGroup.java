package lesson9_inheritance;

public class RhythmicGymnasticGroup extends Athlete {
	String apparatus;
	public RhythmicGymnasticGroup(String athleteName, String apparatus) {
		this (athleteName, new String[] {}, apparatus);
	}
	public RhythmicGymnasticGroup(String athleteName,String[] achievements, String apparatus) {
		super (athleteName, achievements);
		this.apparatus = apparatus;
	}
}
