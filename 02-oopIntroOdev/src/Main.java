
public class Main {

	public static void main(String[] args) {
		//new'lenenlerde her zaman parametresiz Course çalýþýr!
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)", 0,
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (C#)", 0,
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println("Kurslarýmýz: " + course.id + " " + course.name);
		}System.out.println("\n");

		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course1);
		courseManager.joinCourse(course1);

	}

}
