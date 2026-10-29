package Pertemuan4;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan tahun: ");
            int tahun = input.nextInt();
            
            boolean isKabisat = false;
            
             if (tahun % 4 == 0) {
                if (tahun % 100 == 0) {
                    if (tahun % 400 == 0) {
                        isKabisat = true;
                    }
                }else{
                    isKabisat = true;
                }
            }
             if (isKabisat) {
                System.out.println("Tahun " + tahun + " adalah TAHUN KABISAT.");
            }else{
                System.out.println("Tahun " + tahun + " BUKAN tahun kabisat.");
            }
        }
    }
}