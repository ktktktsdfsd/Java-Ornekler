
package javaapplication1;

import java.util.Scanner;

public class Cümleyi_kelime_kelime_yazdirma {

    public static void main(String[] args) {
        String s;
        int a;
        System.out.println("Cümle Giriniz:");
        Scanner oku = new Scanner(System.in);
        s = oku.nextLine();
        for(a = 0; a < s.length() ;a++)
        {
            if(s.charAt(a) == ' ')
                System.out.println("");
            else
              System.out.print(s.charAt(a));  
        }
   }
}
