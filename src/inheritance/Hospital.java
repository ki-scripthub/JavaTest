package inheritance;

public class Hospital {

	String name, speciality;
	int gstNum;
	
	public void setHospitalDetails(String name, String speciality, int gstNum) {
		this.name = name;
		this.speciality = speciality;
		this.gstNum = gstNum;
	}
	
	public void getHospitalDetails() {
		System.out.println("Hospital Name: "+this.name);
		System.out.println("Specialised in "+this.speciality);
		System.out.println("GST Number: "+this.gstNum);
	}
}
