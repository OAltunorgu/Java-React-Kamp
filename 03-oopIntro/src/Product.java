
public class Product {
	// Product diye bir veri tipim var. Bunun id, name .. özellikleri mevcut.
	// encapsulation
	int id;
	String name;
	double unitPrice;
	String detail;
	double discount;

	public Product() {
		// Constructor oluþturduk. Product product1 = new Product(); her new sonrasý bu
		// alan çalýþýr!
		System.out.println("Product Constructor Çalýþtý!");
	}

	public Product(int id, String name, double unitPrice, String detail, double discount) {
		this(); // Önce Parametresiz olaný çalýþtýr sonra burayý yani parametreli Constructor
				// çalýþtýr.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * 0.10);

	}
}