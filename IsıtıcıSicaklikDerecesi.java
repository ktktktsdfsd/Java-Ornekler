
package javaapplication1;


public class İsitici_On_dakika_90_derecede_mi {


    public static void main(String[] args) {
       int sicaklik = 0, sure = 0, isitici = 0, dakika = 0;
       isitici = 1;
       System.out.println("Kettle Açıldı");
       if(sicaklik <= 89)
       {
       	isitici = 1;
       	for(int a = sicaklik ; a <= 90 ; a++)
           	sicaklik++;
       	System.out.println("Kettle Açıldı");
       }
       else
           sure = dakika;
       System.out.println("Sıvıyı Aktar");
       if(sicaklik < 90)
       {
           isitici = 1;
           for(int a = sicaklik ; a <= 90 ; a++)
           	sicaklik++;
           System.out.println("Kettle Açıldı");
       }
       else if(sure >= 10 && sicaklik >= 90)
       {
           isitici = 0;
           System.out.println("Kettle Kapatıldı");
       }
       if(sure <= 10)
       {
           for(int b = sure ; b < 10 ; b++)
           {
               sure++;
               System.out.println(sure + ". dakika");
           } 
       }
      if(sure >= 10 && sicaklik >= 90)
       {
           isitici = 0;
           System.out.println("Kettle Kapatıldı");
       }
    }
    
}
