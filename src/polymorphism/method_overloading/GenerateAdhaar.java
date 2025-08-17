package polymorphism.method_overloading;

public class GenerateAdhaar {
	
	String firstName, lastName;
	int age;
//	double ranNum = Math.random();

	public void addDetails(String firstName){
		this.firstName = firstName;
		System.out.println("Name: "+firstName);
		System.out.print("UID: ");
		System.out.format("%04d %04d %04d", (int)(Math.random()*1000), (int)(Math.random()*1000), (int)(Math.random()*1000));
		
	}
	
	public void addDetails(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Name: "+firstName+ " "+lastName);
		System.out.print("UID: ");
		System.out.format("%04d %04d %04d", (int)(Math.random()*1000), (int)(Math.random()*1000), (int)(Math.random()*1000));

	}

	public void addDetails(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		System.out.println("Name: "+firstName+ " "+lastName);
		System.out.println("Age: "+ age);
		System.out.print("UID: ");
		System.out.format("%04d %04d %04d", (int)(Math.random()*1000), (int)(Math.random()*1000), (int)(Math.random()*1000));

	}
}
