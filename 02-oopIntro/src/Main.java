
public class Main {

	public static void main(String[] args) {

		// Veritaban� yok diye �r�nlerimizi kendimiz yaratt�k.
		// 1. Yol
//		Product product1 = new Product(); // Referans olu�turma
//		product1.id = 1;
//		product1.name = "Cihaz-1";
//		product1.unitPrice = 15000;
//		product1.detail = "16 GB Ram";

		// 2. Yol
		Product product1 = new Product(1, "Cihaz-1", 15000, "16 GB Ram"); // Parametreli Constructor �al��t�

		Product product2 = new Product(); // Referans olu�turma, Parametresiz Constructor �al��t�
		product2.id = 2;
		product2.name = "Cihaz-2";
		product2.unitPrice = 14000;
		product2.detail = "8 GB Ram";

		Product product3 = new Product(); // Referans olu�turma , Parametresiz Constructor �al��t�
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
		category1.name = "Elektronik E�ya";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bah�e";

		Category[] categories = { category1, category2 };

		for (Category category : categories) {
			System.out.println(category.name + " " + category.id);
		}
		System.out.println(categories.length);

		ProductManager productManager = new ProductManager(); // Bir class'�n kaynaklar�n� kullanaca��nda new gerekir.
		productManager.addToCart();
		productManager.addToCart();
		productManager.addToCart();
		// Burada ki ama� method yazd�k. Her yerde kullan�labilir ve de�i�ikli�i
		// codebase'de yani ProductManager'de de�i�tirirsin.

		productManager.addToCart(product1);

	}

}
