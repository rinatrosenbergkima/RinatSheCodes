package lesson10_polymorphism_accessModifiers_objectClass;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insect allInsects[]=new Insect[3];
		allInsects[0]= new Roach(); //the reference var type and the object type are not the same
		allInsects[1]= new Beatle();
		allInsects[2] = new Spider();
		for (int i=0; i<allInsects.length; i++) {
			//allInsects[i].getClass();//what type of class?
			//allInsects[i].getSuperClass();//what type of class?
			//allInsects[i].instanceof Spider //return a bool 
			allInsects[i].eat();
		}
		
	}

}
