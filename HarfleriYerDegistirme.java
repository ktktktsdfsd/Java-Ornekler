
package javaapplication1;

import java.util.Scanner;

public class Metotlu_kelimedeki_harfleri_yer_degistirme {
void islem(String kelimem,int a,int b)
{
      char [] harfler = new char[kelimem.length()];
      for(int d = 0 ; d <= kelimem.length()-1 ; d++)
      {
          harfler[d] = kelimem.charAt(d);
      }
      char ilkharfim = harfler[a];
      char sonharfim = harfler[b];
      harfler[a] = sonharfim;
      harfler[b] = ilkharfim;
      for(int d = 0 ; d <= kelimem.length()-1 ; d++)
      {
         System.out.print(harfler[d]);
      }
}
    public static void main(String[] args) {
      Scanner oku = new Scanner(System.in);
      System.out.println("Kelime Giriniz");
      String kelime = oku.nextLine();
      System.out.println("Kaçıncı Sıradaki Harfi Değiştirmek İstersiniz");
      int ilkharf = oku.nextInt();
      ilkharf = ilkharf-1;
      System.out.println("Kaçıncı Sıradaki Harfle Değiştirmek İstersiniz");
      int sonharf = oku.nextInt();
      sonharf = sonharf-1;
      Metotlu_kelimedeki_harfleri_yer_degistirme F=new Metotlu_kelimedeki_harfleri_yer_degistirme();
      F.islem(kelime,ilkharf,sonharf);
    }
    
}
