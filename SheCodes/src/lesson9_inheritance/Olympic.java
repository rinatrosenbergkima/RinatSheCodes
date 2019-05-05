package lesson9_inheritance;

public class Olympic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] yardenAchievements = {"Rio Olympic, Bronze",
									"Paris Grand Slam 2015, Bronze",
									"World 2014, Silver"};
		//Judoka yarden = new Judoka();
		//yarden.athleteName = "Yarden Gerbi";
		//yarden.achievements=yardenAchievements;
		
		Judoka yarden2 = new Judoka("yarden2", yardenAchievements,55);
		//Swimmer inbal = new Swimmer();
		//RhythmicGymnasticGroup group1 = new RhythmicGymnasticGroup();
		System.out.println(yarden2);
	}

}
