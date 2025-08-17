package class_object;

public class Student {
	int age;
	String name;
	
	public void getDetails(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Student Details: ");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);

	}
}
