
public class Main {

	public static void main(String[] args) {
		IndividualCustomer ogulcan = new IndividualCustomer();
		ogulcan.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "56789";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();
//		1. yol single
//		customerManager.add(hepsiBurada);
//		customerManager.add(ogulcan);
//		customerManager.add(sendikaCustomer);
		
		
//		2. yol multiple
		Customer[] customers = { ogulcan, hepsiBurada, sendikaCustomer };
		customerManager.addMultiple(customers);
		
	}

}
