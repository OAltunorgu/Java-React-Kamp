import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Main program�n baslang�c noktas�d�r.
		System.out.println("Hello World!");

		String anasayfaButon = "Anasayfa i�in t�klay�n�z.";
		System.out.println(anasayfaButon);

		int vade = 36;
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		boolean dustuMu = false;
		System.out.println(vade);
		System.out.println(dolarBugun);
		System.out.println(dustuMu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		} else {
			System.out.println("Dolar e�ittir resmi");
		}

		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "�ift�i Kredi";
		String kredi5 = "MsbKredi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5 + "\n");

		String[] krediler = { "H�zl� Kredi", "Mutlu emekli kredisi", "Konut Kredi", "�ift�i Kredi", "MsbKredi" };

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
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		
	}
}
