
public class ProductManager {
	// ProductService
	public void addToCart() {
		System.out.println("Parametresiz ProductManager Sepete Ekleme Kodu ?a??r?ld?!");
	}

	public void addToCart(Product product) {
		System.out.println(product.getName() + " Parametreli ProductManager Sepete Ekleme Kodu ?a??r?ld?! " + product.getUnitPriceAfterDiscount());
	}

}
