package Pertemuan4;

import java.util.Scanner;

public class KomisiSalesman {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan total penjualan barang (Rp): ");
            double penjualan = input.nextDouble();
            
            double uangJasa = 0;
            double persentaseKomisi = 0;
            
            if (penjualan <= 2000000) {
                uangJasa = 100000;
                persentaseKomisi = 0.10;
            } else if (penjualan <= 5000000) {
                uangJasa = 200000;
                persentaseKomisi = 0.15;
            } else {
                uangJasa = 300000;
                persentaseKomisi = 0.20;
            }
            
            double uangKomisi = persentaseKomisi * penjualan;
            double totalPendapatan = uangJasa + uangKomisi;
            
            System.out.println("\n--- RINCIAN PENDAPATAN SALESMAN ---");
            System.out.println("Total Penjualan  : Rp " + penjualan);
            System.out.println("Uang Jasa        : Rp " + uangJasa);
            System.out.println("Uang Komisi      : Rp " + uangKomisi);
            System.out.println("Total Pendapatan : Rp " + totalPendapatan);
        }
    }
}