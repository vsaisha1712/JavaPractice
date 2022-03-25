package lab_program;

public class Professor extends PHDscholar implements LabInCharge {
	
	String subject = "Oops";
	int emp_id = 45;
	
	public void teaches() {
		System.out.println("Professor teaches " + subject + " having id " + emp_id);
	}

	@Override
	public void install() {
		System.out.println(labName + " lab with room no. " + roomNo + " installed some programs ");
		
	}

	@Override
	public void help() {
		System.out.println(scholarName + " helps students to completelabs");
		
	}

}
