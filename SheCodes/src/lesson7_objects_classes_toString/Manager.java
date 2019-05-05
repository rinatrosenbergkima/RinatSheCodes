package lesson7_objects_classes_toString;

public class Manager {
	public static void main(String[] args) {
		Lion myLion;
		Lion myLion2;
		myLion = new Lion(10, 70, "Black");
		myLion2 = new Lion();
		System.out.println(myLion2);
		myLion.height = 10; //this will work only if height is not private. But we don't want that
		myLion.roar();
		String hunt = myLion.hunt();
		System.out.println(hunt);
		myLion.printColor();
		System.out.println(myLion);
	}
}
