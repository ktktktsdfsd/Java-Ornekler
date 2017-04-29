package deneme1;

import java.util.Random;
import java.util.Scanner;

public class Sayý_Tahmini {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rastgele = new Random();
		int cevap = rastgele.nextInt(5);
		
		int toplamdenemehakki = 4;
		System.out.println("Toplam 3 Deneme Hakkýnýz Var");
		for(int denemesayisi = 1; denemesayisi < toplamdenemehakki; denemesayisi++)
		{
		   int girdiginizsayi;
		   System.out.println("0-5 Arasý Sayý Bir Sayý Giriniz = ");
		girdiginizsayi = input.nextInt();
		
		if(girdiginizsayi == cevap)
		{
			if (cevap == 5)
				System.out.println("Tahmininiz Doðru Cevap = "+cevap+"'ti.");
			else if(cevap == 4)
				System.out.println("Tahmininiz Doðru Cevap = "+cevap+"'tü.");
			else if(cevap==3)
				System.out.println("Tahmininiz Doðru Cevap = "+cevap+"'dü.");
			else if(cevap==2)
				System.out.println("Tahmininiz Doðru Cevap = "+cevap+"'di.");
			else if(cevap==1)
				System.out.println("Tahmininiz Doðru Cevap = "+cevap+"'di.");
			else if(cevap==0)
				System.out.println("Tahmininiz Doðru Cevap = "+cevap+"'dý.");
			
			System.out.println(denemesayisi+". Denemede Doðru Cevabý Buldunuz");
			denemesayisi=toplamdenemehakki;
			
		}
		else
		{
			int kalanhak=toplamdenemehakki-denemesayisi;
			kalanhak--;
			if (kalanhak==0)
			{
				System.out.println("Oyun Bitti Hakkýnýz Kalmadý");
				if (cevap==5)
					System.out.println("Doðru Cevap = "+cevap+"'ti.");
				else if(cevap==4)
					System.out.println("Doðru Cevap = "+cevap+"'tü.");
				else if(cevap==3)
					System.out.println("Doðru Cevap = "+cevap+"'dü.");
				else if(cevap==2)
					System.out.println("Doðru Cevap = "+cevap+"'di.");
				else if(cevap==1)
					System.out.println("Doðru Cevap = "+cevap+"'di.");
				else if(cevap==0)
					System.out.println("Doðru Cevap = "+cevap+"'dý.");
						
			}
			else
				System.out.println("Tahmininiz Yanlýþ Tekrar Deneyiniz "+kalanhak+" Deneme Hakkýnýz Kaldý");
		}
	}
		

   }
}
