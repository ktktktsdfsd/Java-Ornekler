
package javaapplication1;

import java.util.Scanner;

public class Yukari_ok_cizme {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int yukseklik;

        System.out.print("Okun yuksekligini giriniz (3'ten buyuk olmali): ");
        yukseklik = input.nextInt();

        if (yukseklik > 3) {
            for (int i = 3, k = 0; i > 0 && k < 3; i--, k++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < k + 1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j < k + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int a = 0; a < yukseklik - 3; a++) {
                System.out.print("    ");
                System.out.print("*\n");
            }

        } 
	   else
            System.out.println("Hata! 3'ten buyuk bir sayi girmelisiniz.");
    }
    
}
