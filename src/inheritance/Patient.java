package inheritance;

public class Patient extends Hospital{
	
	String patientName, diagnosis;
	int patientAge;
	
	public void setPatientDetails(String patientName, int patientAge, String diagnosis) {
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.diagnosis = diagnosis;
		
	}
	
	public void getPatientDetails() {
		System.out.println("Patient Name: "+patientName);
		System.out.println("Patient Age: "+patientAge);
		System.out.println("Diagnosis: "+diagnosis);
	}
}
