/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan46.tandanyakamu;
import java.util.Scanner;
/**
 *
 * @author Rheiza
 * NAMA     : Rheiza Akmal R
 * KELAS    : IF2
 * NIM      : 10119061

 */
public class PBOIF210119061Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Age age = new Age(2018);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        int tahunLahir = scanner.nextInt();
        age.setYearBirth(tahunLahir);
        
        System.out.println();
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " yahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
