package lesson11_interfaces;

public class Student implements Comparable{
	public  String name;
	public int id;
	public Student (int id, String name)
	{
		this.name = new String(name);//copy
		this.id = id;
	}
	@Override
	public int compareTo (Object other) {
		// TODO Auto-generated method stub
		int otherID;
		int compareAns;
		otherID = ((Student)other).id;
		if (this.id<otherID)
		{
			compareAns = -1;
		}
		if (this.id>otherID)
		{
			compareAns = 1;
		}
		compareAns = 0;
		return compareAns;
	}
	
}
