
package javaapplication1;

public class Boya_ekleme_ornegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int toplammiktar=0,a=1,b=1,tiner=1;
       toplammiktar+=b;
       System.out.println("B boyası eklendi");
       if(toplammiktar==1)
       {
         for(int c = 1; c < 7 ;c++)
         {
            toplammiktar += a;
            System.out.println("A boyası eklendi");
            int miktar = toplammiktar % 25;
            if(miktar == toplammiktar % 25)
            {
                toplammiktar += tiner;
                System.out.println("Tiner eklendi");
            }
         else if(toplammiktar >= 7)
         {
            System.out.println("C boyası elde edildi");
             break; 
         }
         }
         
       }
    }
    
}
