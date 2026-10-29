
package Pertemuan4;

import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== MENU PERHITUNGAN LUAS BANGUN DATAR ===");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Luas Segitiga");
            System.out.println("3. Luas Lingkaran");
            System.out.println("4. Luas Trapesium");
            System.out.println("5. Luas Layang-layang");
            System.out.print("Pilih nomor menu (1-5): ");
            int pilihan = input.nextInt();
            
            double luas = 0;
            
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();
                    luas = sisi * sisi;
                    System.out.println("Luas Persegi = " + luas);
                    // Gunakan titik dua dan break
                }
                case 2 -> {
                    System.out.print("Masukkan alas: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiSegitiga = input.nextDouble();
                    luas = 0.5 * alas * tinggiSegitiga;
                    System.out.println("Luas Segitiga = " + luas);
                }
                
                case 3 -> {
                    System.out.print("Masukkan jari-jari (r): ");
                    double r = input.nextDouble();
                    luas = Math.PI * r * r;
                    System.out.println("Luas Lingkaran = " + luas);
                }
                
                case 4 -> {
                    System.out.print("Masukkan sisi sejajar a: ");
                    double a = input.nextDouble();
                    System.out.print("Masukkan sisi sejajar b: ");
                    double b = input.nextDouble();
                    System.out.print("Masukkan tinggi trapesium: ");
                    double tinggiTrapesium = input.nextDouble();
                    luas = 0.5 * (a + b) * tinggiTrapesium;
                    System.out.println("Luas Trapesium = " + luas);
                }
                
                case 5 -> {
                    System.out.print("Masukkan diagonal 1 (d1): ");
                    double d1 = input.nextDouble();
                    System.out.print("Masukkan diagonal 2 (d2): ");
                    double d2 = input.nextDouble();
                    luas = 0.5 * d1 * d2;
                    System.out.println("Luas Layang-layang = " + luas);
                }
                
                default -> System.out.println("Pilihan menu tidak valid!");
            }
        }
    }
}