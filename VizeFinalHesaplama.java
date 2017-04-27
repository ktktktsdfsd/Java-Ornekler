package deneme1;

import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {
		 int vizenotu, finalnotu;
	        Scanner oku = new Scanner(System.in);
	        System.out.println("Vize notunu giriniz :");
	        vizenotu = oku.nextInt();
	        System.out.println("Final notunu giriniz :");
	        finalnotu = oku.nextInt();
	        double ortalama = (vizenotu*0.4)+(finalnotu*0.6);
	        System.out.println(ortalama);
	        if(finalnotu < 50)
	        {
	        System.out.println("Kaldýnýz");
	        System.out.println("Bütünleme Sýnavý Yoktur");
	        }
	        else if(ortalama >= 60)
	        	System.out.println("Geçtiniz");

	}

}
