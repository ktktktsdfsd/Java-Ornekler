package deneme1;

import java.util.Random;
import java.util.Scanner;

public class Ornek3 {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int kacsayi;

		System.out.print("�retilecek Rastgele Say� Adetini Giriniz = ");
		kacsayi = input.nextInt();
		int maxdeger;

		System.out.print("Rastgele Say�lar�n Max De�erini Giriniz = ");
		maxdeger = input.nextInt();

		Random rastgele = new Random();
		int a=0;
		int[] sayisirasi= new int[a];
	    for(int i = 0; i < kacsayi; i++)
	    {
	    	a++;
	    	System.out.println(a + ". Say� = "+rastgele.nextInt(maxdeger));
	    }
	    System.out.println("Toplam " + a + " Adet Rastgele Say� �retilmi�tir");
	}

}
