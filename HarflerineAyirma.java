
package javaapplication1;

import java.util.Scanner;

public class Kelime_ayirma {
static String islem(String sozcuk)
{
    int sayac = 0;
    for(int a = 0; a <= 999 ; a++)
    {
        sayac++;
        char c = sozcuk.charAt(a);
        if(c == ' ')
            break;
    }
    String deger = ""+sayac;
    return (deger);
}
    public static void main(String[] args) {
       String kelime;
       Scanner oku = new Scanner(System.in);
       System.out.println("Kelime Giriniz");
       kelime = oku.nextLine();
       String harfsayisi = islem(kelime);
       int kacsayivar = Integer.parseInt(harfsayisi);
       for(int p = kacsayivar;p <=0 ; p--)
       {
           char harfler = kelime.charAt(p);
           System.out.println(harfler);
       }
    }

    
}
