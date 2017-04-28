/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Kutu_cizme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int yukseklik, genislik;
     
        System.out.print("Kutunun yuksekligini giriniz: ");
                yukseklik = input.nextInt();
        System.out.print("Kutunun genisligini giriniz: ");
                genislik = input.nextInt();
             
                for(int i = 0; i < yukseklik; i++)
                {
                    for(int j = 0; j < genislik; j++)
                    {
                        if(i == 0 || i == yukseklik-1 || j == 0 || j == genislik-1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                System.out.println();
                }
    }
    
}
