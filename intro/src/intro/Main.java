package intro;

public class Main {

	public static void main(String[] args) {
		// camelCase = yani ilk taraf�n ba� harfi k���k di�erinin b�y�k
		// Don't repeat yourself
		
		String internetSubeButonu = "�nternet �ubesi";           // dikkat et veri tipi bildiriminde ilk harf b�y�k = String
		
		System.out.println(internetSubeButonu);                 // yukardaki tek bir nesne ile
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		
		
		double dolarDun = 8.15;                 // ondal�kl� bilgi tutma sekli
		double dolarBugun = 8.15;
		int vade = 36;                          // tam say� tutma sekli
		
		boolean dustuMu = false;               // true veya false de�er d�nen de�erlere boolean denir
		
		if (dolarBugun<dolarDun) {                  // i�eris true d�nerse blok i�erisi �al���r.
			System.out.println("Dolar d��t�");
		}
		else if (dolarBugun>dolarDun){                                     // if �al��mad��� anda else �al���r.
			System.out.println("Dolar y�kseldi");
		}
		else {
			System.out.println("Dolar e�it");
		}
		
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "�ift�i kredisi";
		String kredi5 = "Mbs kredisi";
		
		
		String[] krediler = {kredi1,kredi2,kredi3,kredi4,kredi5};      // array olu�rurduk i�inde birden fazla String bilgi tutuan liste demek
		
		
		for(String kredi : krediler) {                    // krediler i�indeki String bilgileri tek tek d�n demi� olduk 
			System.out.println(kredi);
		}
		
		
		
		for (int i = 0; i < krediler.length; i++) {         // start, 0 ile ba�la => d�ng� ne kadar d�ns�n => i yi ka� ka� artt�ray�m
			System.out.println(krediler[i]);
		}
		
		
		
		// De�er Tip = Genel olarak int, float, double, boolean say�sal tipler de�er tip olarak tutulur.
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi1 = sayi2;                // say�1 in de�eri sayi2 nin de�eridir.
		
		sayi2 = 100;
		System.out.println(sayi1);
		
		
		// Referens Tip = array, class, interface, abstract class �rnekelri referans tip olarak kar��m�za ��kar.
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1 = sayilar2;                   // sayilar1 in adresi sayilar2 nin adresini ald�.
		
		sayilar2[0] = 100;
		
		System.out.println(sayilar1[0]);
		
		
		
		
		// Stringler de�er tip olarak �al���yor.
		
		String sehir1 =  "Ankara";
		String sehir2 = "�stanbul";
		
		sehir1 = sehir2;	
		sehir2 = "�zmir";
		
		System.out.println(sehir1);
		
		// cevap = �stanbul 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
