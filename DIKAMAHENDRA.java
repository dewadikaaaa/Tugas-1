/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.dikamahendra;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DIKAMAHENDRA {

 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("MASUKAN PANJANG SEGITIGA:");
        double alas = scanner.nextDouble();

        System.out.println("MASUKAN TINGGI SEGITIGA:");
        double tinggi = scanner.nextDouble();

        double luasAlas = hitungLuasAlasSegitiga(alas, tinggi);
        System.out.println("JADI JUMLAH JUAS SEGITIGA ADALAH: " + luasAlas);
    }

    public static double hitungLuasAlasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    
}