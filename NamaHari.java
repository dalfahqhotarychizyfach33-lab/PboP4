package Pertemuan4;

import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kode hari (1-7): ");
            int kode = input.nextInt();
            
            switch (kode) {
                case 1 -> System.out.println("Hari ke-1 adalah Senin");
                case 2 -> System.out.println("Hari ke-2 adalah Selasa");
                case 3 -> System.out.println("Hari ke-3 adalah Rabu");
                case 4 -> System.out.println("Hari ke-4 adalah Kamis");
                case 5 -> System.out.println("Hari ke-5 adalah Jumat");
                case 6 -> System.out.println("Hari ke-6 adalah Sabtu");
                case 7 -> System.out.println("Hari ke-7 adalah Minggu");
                default -> System.out.println("Kode hari tidak valid! Masukkan angka 1 sampai 7.");
            }
        }
    }
}