
public class Main {

	public static void main(String[] args) {

		// Veritabaný yok diye ürünlerimizi kendimiz yarattýk.
		// 1. Yol
//		Product product1 = new Product(); // Referans oluþturma
//		product1.id = 1;
//		product1.name = "Cihaz-1";
//		product1.unitPrice = 15000;
//		product1.detail = "16 GB Ram";

		// 2. Yol
		Product product1 = new Product(1, "Cihaz-1", 15000, "16 GB Ram"); // Parametreli Constructor Çalýþtý

		Product product2 = new Product(); // Referans oluþturma, Parametresiz Constructor Çalýþtý
		product2.id = 2;
		product2.name = "Cihaz-2";
		product2.unitPrice = 14000;
		product2.detail = "8 GB Ram";

		Product product3 = new Product(); // Referans oluþturma , Parametresiz Constructor Çalýþtý
		product3.id = 3;
		product3.name = "Cihaz-3";
		product3.unitPrice = 13000;
		product3.detail = "4 GB Ram";

		Product[] products = { product1, product2, product3 };

		// foreach
		for (Product product : products) {
			System.out.println(product.name + " " + product.id);
		}
		System.out.println(products.length);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Elektronik Eþya";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";

		Category[] categories = { category1, category2 };

		for (Category category : categories) {
			System.out.println(category.name + " " + category.id);
		}
		System.out.println(categories.length);

		ProductManager productManager = new ProductManager(); // Bir class'ýn kaynaklarýný kullanacaðýnda new gerekir.
		productManager.addToCart();
		productManager.addToCart();
		productManager.addToCart();
		// Burada ki amaç method yazdýk. Her yerde kullanýlabilir ve deðiþikliði
		// codebase'de yani ProductManager'de deðiþtirirsin.

		productManager.addToCart(product1);

	}

}
