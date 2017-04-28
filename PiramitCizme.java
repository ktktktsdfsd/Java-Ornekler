
package javaapplication1;

import java.util.Scanner;


public class Yildiz_piramit_yapimi {


    public static void main(String[] args) {
     int sayi;
     Scanner gir = new Scanner (System.in);
     System.out.println("Kaç Basamaklı Olsun:");
     sayi = gir.nextInt();

     for (int i = 0; i <= sayi; i++){

        for (int k =0; k < sayi - i; k++) {

     System.out.print(" ");}

      for (int j =0; j <2*i-1; j++){

     System.out.print("*");}

     System.out.println("");}
    }
    
}
