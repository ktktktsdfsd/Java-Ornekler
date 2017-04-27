package javaapplication1;

import java.util.Scanner;

public class Ucgenin_alanini_hesaplayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double alan;
        int a, h;
        Scanner oku = new Scanner(System.in);
        System.out.print("a :");
        a = oku.nextInt();
        System.out.print("h :");
        h = oku.nextInt();
        alan = a * h / 2;
        System.out.println("Alan = " + alan);
        
    }
    
}
