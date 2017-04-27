
package javaapplication1;

import java.util.Scanner;


public class Kelimedeki_harfleri_tersten_yazdirma {

    public static void main(String[] args) {
      Scanner oku = new Scanner(System.in);
      System.out.println("Kelime Giriniz");
      String kelime = oku.nextLine();
      int harfsayisi = kelime.length();
      char harf;
      for(int a = harfsayisi-1; a >= 0 ; a--)
      {
          harf = kelime.charAt(a);
          System.out.println(harf);
      }
      
    }
    
}
