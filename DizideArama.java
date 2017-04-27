
package javaapplication1;

public class Dizideki_ismin_kacinci_sirada_oldugunu_bulma {

    public static void main(String[] args) {
       String s="Yok", isimler[]={"ahmet", "mehmet", "hüsamettin", "ali", "veli", "Emin", "hanife", "şeydanur"};
       int a = 0;
       do
       {
           if(isimler[a] == "Emin")
           {
               s = (a+1)+".sırada";
               break;
           }
           a++; 
       }while(a < 8);
       System.out.println(s);
    }
    
}
