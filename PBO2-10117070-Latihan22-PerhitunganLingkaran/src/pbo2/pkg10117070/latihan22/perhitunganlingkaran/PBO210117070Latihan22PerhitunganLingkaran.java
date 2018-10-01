/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan22.perhitunganlingkaran;
import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding 
 * Perhitungan .
 */
public class PBO210117070Latihan22PerhitunganLingkaran {
    public static void main(String[] args) {
        String cek;
        double jari;
        double diameter;
        double luas;
        double kel;
        
        
        Scanner dm = new Scanner(System.in);
        System.out.println("======Perhitungan Lingkaran======");
        
        do {            
            System.out.print("Masukkan Nilai diameter lingkaran : ");
            cek = dm.nextLine();
            if (!cek.matches("[0-9]*")) {
                System.out.println("Nilai diameter tidak sesuai!");
                
            }
            
        } while (!cek.matches("[0-9]*"));
        
        diameter = Double.parseDouble(cek);
        
        
        jari = (diameter/2);
        luas = Math.PI*(jari*jari);
        kel = 2*Math.PI*jari;
        
        System.out.printf("Jari - jari = %.0f cm %n ",jari);
        System.out.printf("Luas Lingkaran = %.2f cm %n",luas);
        System.out.printf("Keliling Lingkaran = %.2f cm %n",kel);
    }
    
}
