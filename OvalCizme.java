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
public class Oval_cizme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yukseklik,genislik;
        System.out.println("Yüksekliğini Giriniz:");
        yukseklik = input.nextInt();
        System.out.println("Genişliğini Giriniz:");
        genislik = input.nextInt();
        System.out.println(yukseklik+"x"+genislik+" bir oval");

        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < genislik; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 1 || i == 1 && j == 0) {
                    System.out.print(" ");
                } else if (i == 0 && j == 5 || i == 0 && j == 6 || i == 1 && j == 6) {
                    System.out.print(" ");
                } else if (i == 8 && j == 0 || i == 8 && j == 1 || i == 7 && j == 0) {
                    System.out.print(" ");
                } else if (i == 7 && j == 6 || i == 8 && j == 6 || i == 8 && j == 5) {
                    System.out.print(" ");
                } else if (i == 1 && j == 1 || i == 1 && j == 5 || i == 8 && j == 1 || i == 7 && j == 1 || i == 7 && j == 5) {
                    System.out.print("*");
                } else if (i == 0 || i == yukseklik - 1 || j == 0 || j == genislik - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
