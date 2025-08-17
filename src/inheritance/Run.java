package inheritance;

public class Run {
	
	public static void main(String[] args) {
		Hospital h1 = new Hospital();
//		h1.setHospitalDetails("Anand Hospitals", "Arthopedic", (int)Math.random()*139304);
//		h1.getHospitalDetails();
		
		Patient p1 = new Patient();
		p1.setHospitalDetails("Anand Hospitals", "Arthopedic", (int)(Math.random()*1324243));
		p1.setPatientDetails("Subbarao", 56, "Knee replacement");
		p1.getHospitalDetails();
		p1.getPatientDetails();
	}
	
}
