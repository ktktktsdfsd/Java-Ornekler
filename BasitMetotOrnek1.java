
package javaapplication1;

import java.util.Scanner;

public class Basit_metot_ornegi2 {
static int toplama(int a, int b)
{
    int c = a + b;
    return (c);
}
    
    public static void main(String[] args) {
       int x, y, secim = 1, say = 0;
       Scanner oku=new Scanner(System.in);
       for(int c = 1; c <= 999; c++)
       {
         say++;
         x = 0;
         y = 0;
         System.out.println("1.sayıyı Giriniz");
         x = oku.nextInt();
         System.out.println("2.sayıyı Giriniz");
         y = oku.nextInt();
         System.out.println("Toplamı= "+toplama(x,y));
         System.out.println("Tekrar Toplama Yapmak İsterseniz 1, İstemiyorsanız 0 Girin");
         secim = oku.nextInt();
         if(secim == 0)
             break;
       }
       System.out.println(say+" Defa İşlem Yaptınız");
    }
    
}
