package deneme1;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rastgele = new Random();
		int cevap = rastgele.nextInt(5);
		
		int kalanhak = 3, toplamdenemehakki = 4;
		System.out.println("Toplam 3 Deneme Hakkınız Var");
		for(int denemesayisi = 1; denemesayisi < toplamdenemehakki; denemesayisi++)
		{
		   int girdiginizsayi;
		   System.out.println("0-5 Arası Sayı Bir Sayı Giriniz = ");
		   girdiginizsayi = input.nextInt();
			
		   if (girdiginizsayi != cevap)
		   {
			   kalanhak = toplamdenemehakki - denemesayisi;
			   kalanhak--;
			   if (kalanhak == 0)
			   {
				   	System.out.println("Oyun Bitti Hakkınız Kalmadı");
					System.out.println("Doğru Cevap = " + cevap);
			   }
			   else System.out.println("Tahmininiz Yanlış Tekrar Deneyiniz " + kalanhak + " Deneme Hakkınız Kaldı");
		   }
		   else
		   {
			   System.out.println(denemesayisi + ". Denemede Doğru Cevabı Buldunuz");
			   System.out.println("Tahmininiz Doğru Cevap = " + cevap);
			   denemesayisi = toplamdenemehakki;
		   }
		}
	}
   }
