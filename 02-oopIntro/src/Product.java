
public class Product {
	// Product diye bir veri tipim var. Bunun id, name .. özellikleri mevcut.

	int id;
	String name;
	double unitPrice;
	String detail;

	public Product() {
		// Constructor oluþturduk. Product product1 = new Product(); her new sonrasý bu
		// alan çalýþýr!
		System.out.println("Product Constructor Çalýþtý!");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this(); // Önce Parametresiz olaný çalýþtýr sonra burayý yani parametreli Constructor
				// çalýþtýr.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

}