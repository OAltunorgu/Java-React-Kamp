
public class Course {

	int id;
	String name;
	double unitPrice;
	String detail;

	public Course() {
		System.out.println("Course Parametresiz Constructor �al��t�!");
	}

	public Course(int id, String name, double unitPrice, String detail) {
		this();//Parametresiz Constructor �al��s�n diye :)
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

}
