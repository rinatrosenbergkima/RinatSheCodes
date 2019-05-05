package lesson7_objects_classes_toString;

public class Lion {
	int height;
	private int weight;
	private String color;

	//This is an empty constructor:
	public Lion(){
		
	}
	
	//This is the constructor:
	public Lion(int height, int weight, String color){
		this.height = height;
		this.weight = weight;
		this.color = color;
	}
	public void roar() {
		System.out.println("RRRRRoaRRRRRR");
	}
	
	public String hunt() {
		return "Rabit";
	}
	
	public void printColor() {
		System.out.println(this.color); //it works also without using this
	}
	
	@Override
	public String toString() {
		return "Lion [height=" + height + ", weight=" + weight + ", color=" + color	+ "]";
	}

}
