package deneme1;

import java.util.Random;
import java.util.Scanner;

public class Say�_Tahmini {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rastgele = new Random();
		int cevap = rastgele.nextInt(5);
		
		int toplamdenemehakki = 4;
		System.out.println("Toplam 3 Deneme Hakk�n�z Var");
		for(int denemesayisi = 1; denemesayisi < toplamdenemehakki; denemesayisi++)
		{
		   int girdiginizsayi;
		   System.out.println("0-5 Aras� Say� Bir Say� Giriniz = ");
		girdiginizsayi = input.nextInt();
		
		if(girdiginizsayi == cevap)
		{
			if (cevap == 5)
				System.out.println("Tahmininiz Do�ru Cevap = "+cevap+"'ti.");
			else if(cevap == 4)
				System.out.println("Tahmininiz Do�ru Cevap = "+cevap+"'t�.");
			else if(cevap==3)
				System.out.println("Tahmininiz Do�ru Cevap = "+cevap+"'d�.");
			else if(cevap==2)
				System.out.println("Tahmininiz Do�ru Cevap = "+cevap+"'di.");
			else if(cevap==1)
				System.out.println("Tahmininiz Do�ru Cevap = "+cevap+"'di.");
			else if(cevap==0)
				System.out.println("Tahmininiz Do�ru Cevap = "+cevap+"'d�.");
			
			System.out.println(denemesayisi+". Denemede Do�ru Cevab� Buldunuz");
			denemesayisi=toplamdenemehakki;
			
		}
		else
		{
			int kalanhak=toplamdenemehakki-denemesayisi;
			kalanhak--;
			if (kalanhak==0)
			{
				System.out.println("Oyun Bitti Hakk�n�z Kalmad�");
				if (cevap==5)
					System.out.println("Do�ru Cevap = "+cevap+"'ti.");
				else if(cevap==4)
					System.out.println("Do�ru Cevap = "+cevap+"'t�.");
				else if(cevap==3)
					System.out.println("Do�ru Cevap = "+cevap+"'d�.");
				else if(cevap==2)
					System.out.println("Do�ru Cevap = "+cevap+"'di.");
				else if(cevap==1)
					System.out.println("Do�ru Cevap = "+cevap+"'di.");
				else if(cevap==0)
					System.out.println("Do�ru Cevap = "+cevap+"'d�.");
						
			}
			else
				System.out.println("Tahmininiz Yanl�� Tekrar Deneyiniz "+kalanhak+" Deneme Hakk�n�z Kald�");
		}
	}
		

   }
}
