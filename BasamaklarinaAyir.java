package javaapplication1;
import java.util.Scanner;

public class Girilen_sayiyi_basamaklarina_ayirma {

    public static void main(String[] args) {
     int sayi, sayac = 0;
     Scanner gir = new Scanner (System.in);
     System.out.println("sayi : ");
     sayi = gir.nextInt(); 
     while (sayi >0)
       {
           sayac++;
      	System.out.println(sayac+".basamağı "+sayi%10);
           sayi=sayi/10;
       } 
    }
}
