
public class Main {

	public static void main(String[] args) {

		//Product product1 = new Product(1, "Cihaz-1", 15000, "16 GB Ram", 10); // Parametreli Constructor �al��t�

		Product product2 = new Product(); // Referans olu�turma, Parametresiz Constructor �al��t�
		product2.setId(2);
		product2.setName("Cihaz-2");
		product2.setDetail("8 GB Ram");
		product2.setUnitPrice(14000);
		System.out.println(product2.getUnitPriceAfterDiscount());

		//Okumak i�in Get Yazmak i�in Set Kullan�r�z!
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("��ecek");
		
		System.out.println(category1.getName());

	}

}
