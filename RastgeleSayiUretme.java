package deneme1;

import java.util.Random;
import java.util.Scanner;

public class Ornek3 {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int kacsayi;

		System.out.print("Üretilecek Rastgele Sayý Adetini Giriniz = ");
		kacsayi = input.nextInt();
		int maxdeger;

		System.out.print("Rastgele Sayýlarýn Max Deðerini Giriniz = ");
		maxdeger = input.nextInt();

		Random rastgele = new Random();
	    	int a = 0;
	    	int[] sayisirasi= new int[a];
	    	for(int i = 0; i < kacsayi; i++)
	    	{
		    	a++;
		    	System.out.println(a + ". Sayı = " + rastgele.nextInt(maxdeger));
           	}
	    	System.out.println("Toplam " + a + " Adet Rastgele Sayı Üretilmiştir");
	}

}
