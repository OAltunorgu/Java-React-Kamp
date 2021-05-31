
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		studentManager.add(1, "Oðulcan", "Altunörgü", "ogulcan.altunorgu@gmail.com", "JAVA + REACT");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(2, "Engin", "Demirog", "engindemirog@gmail.com", "PMP");
		
		UserManager userManager = new UserManager();
		userManager.getAllUsers();
	}

}
