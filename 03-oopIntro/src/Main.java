
public class Main {

	public static void main(String[] args) {

		//Product product1 = new Product(1, "Cihaz-1", 15000, "16 GB Ram", 10); // Parametreli Constructor Çalýþtý

		Product product2 = new Product(); // Referans oluþturma, Parametresiz Constructor Çalýþtý
		product2.setId(2);
		product2.setName("Cihaz-2");
		product2.setDetail("8 GB Ram");
		product2.setUnitPrice(14000);
		System.out.println(product2.getUnitPriceAfterDiscount());

		//Okumak için Get Yazmak için Set Kullanýrýz!
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		System.out.println(category1.getName());

	}

}
