
public class Main {

	public static void main(String[] args) {
		//new'lenenlerde her zaman parametresiz Course �al���r!
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)", 0,
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C#)", 0,
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println("Kurslar�m�z: " + course.id + " " + course.name);
		}System.out.println("\n");

		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course1);
		courseManager.joinCourse(course1);

	}

}
