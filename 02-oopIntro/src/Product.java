
public class Product {
	// Product diye bir veri tipim var. Bunun id, name .. �zellikleri mevcut.

	int id;
	String name;
	double unitPrice;
	String detail;

	public Product() {
		// Constructor olu�turduk. Product product1 = new Product(); her new sonras� bu
		// alan �al���r!
		System.out.println("Product Constructor �al��t�!");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this(); // �nce Parametresiz olan� �al��t�r sonra buray� yani parametreli Constructor
				// �al��t�r.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

}