import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Main programýn baslangýc noktasýdýr.
		System.out.println("Hello World!");

		String anasayfaButon = "Anasayfa için týklayýnýz.";
		System.out.println(anasayfaButon);

		int vade = 36;
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		boolean dustuMu = false;
		System.out.println(vade);
		System.out.println(dolarBugun);
		System.out.println(dustuMu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		} else {
			System.out.println("Dolar eþittir resmi");
		}

		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "Çiftçi Kredi";
		String kredi5 = "MsbKredi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5 + "\n");

		String[] krediler = { "Hýzlý Kredi", "Mutlu emekli kredisi", "Konut Kredi", "Çiftçi Kredi", "MsbKredi" };

		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println("\n");
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1+"\n");
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]+"\n");
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
		
		
	}
}
