
package javaapplication1;

import java.util.Scanner;

public class Odev_yildiz_sekli_metotlu {

    static void sekilciz(int a)
    {
     for(int i = 0;i<a;i++)
     {
 	  System.out.print("*");
     	  System.out.println();
     	  for(int j=0;j<=i;j++)
     {
     System.out.print(" ");}
    }
   
    public static void main(String[] args) {
     Scanner oku = new Scanner(System.in);
     int satirsayisi;
     System.out.println("Satır Sayısı: ");
     satirsayisi = oku.nextInt();
     sekilciz(satirsayisi);
    }
    
}
