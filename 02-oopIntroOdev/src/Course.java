
public class Course {

	int id;
	String name;
	double unitPrice;
	String detail;

	public Course() {
		System.out.println("Course Parametresiz Constructor Çalýþtý!");
	}

	public Course(int id, String name, double unitPrice, String detail) {
		this();//Parametresiz Constructor çalýþsýn diye :)
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

}
