package intro;

public class Main {

	public static void main(String[] args) {
		// camelCase = yani ilk tarafýn baþ harfi küçük diðerinin büyük
		// Don't repeat yourself
		
		String internetSubeButonu = "Ýnternet Þubesi";           // dikkat et veri tipi bildiriminde ilk harf büyük = String
		
		System.out.println(internetSubeButonu);                 // yukardaki tek bir nesne ile
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		
		
		double dolarDun = 8.15;                 // ondalýklý bilgi tutma sekli
		double dolarBugun = 8.15;
		int vade = 36;                          // tam sayý tutma sekli
		
		boolean dustuMu = false;               // true veya false deðer dönen deðerlere boolean denir
		
		if (dolarBugun<dolarDun) {                  // içeris true dönerse blok içerisi çalýþýr.
			System.out.println("Dolar düþtü");
		}
		else if (dolarBugun>dolarDun){                                     // if çalýþmadýðý anda else çalýþýr.
			System.out.println("Dolar yükseldi");
		}
		else {
			System.out.println("Dolar eþit");
		}
		
		
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftçi kredisi";
		String kredi5 = "Mbs kredisi";
		
		
		String[] krediler = {kredi1,kredi2,kredi3,kredi4,kredi5};      // array oluþrurduk içinde birden fazla String bilgi tutuan liste demek
		
		
		for(String kredi : krediler) {                    // krediler içindeki String bilgileri tek tek dön demiþ olduk 
			System.out.println(kredi);
		}
		
		
		
		for (int i = 0; i < krediler.length; i++) {         // start, 0 ile baþla => döngü ne kadar dönsün => i yi kaç kaç arttýrayým
			System.out.println(krediler[i]);
		}
		
		
		
		// Deðer Tip = Genel olarak int, float, double, boolean sayýsal tipler deðer tip olarak tutulur.
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi1 = sayi2;                // sayý1 in deðeri sayi2 nin deðeridir.
		
		sayi2 = 100;
		System.out.println(sayi1);
		
		
		// Referens Tip = array, class, interface, abstract class örnekelri referans tip olarak karþýmýza çýkar.
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1 = sayilar2;                   // sayilar1 in adresi sayilar2 nin adresini aldý.
		
		sayilar2[0] = 100;
		
		System.out.println(sayilar1[0]);
		
		
		
		
		// Stringler deðer tip olarak çalýþýyor.
		
		String sehir1 =  "Ankara";
		String sehir2 = "Ýstanbul";
		
		sehir1 = sehir2;	
		sehir2 = "Ýzmir";
		
		System.out.println(sehir1);
		
		// cevap = Ýstanbul 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
