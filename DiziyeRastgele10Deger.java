
package javaapplication1;

public class On_elemanli_bir_diziye_rastgele_deger_atama {


    public static void main(String[] args) {
        int [] x = new int [10];
        for(int a = 0; a <= 9 ;a++)
        {
            x[a] = (int)(Math.random()*50) + 1;
            System.out.println(x[a]);
        }
        
    }
    
}
