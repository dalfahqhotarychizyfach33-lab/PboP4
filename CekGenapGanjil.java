package Pertemuan4;

import java.util.Scanner;

public class CekGenapGanjil {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah bilangan: ");
            int bilangan = input.nextInt();
            
            if (bilangan % 2 == 0) {
                System.out.println("Bilangan " + bilangan + " adalah bilangan GENAP.");
            } else {
                System.out.println("Bilangan " + bilangan + " adalah bilangan GANJIL.");
            }
        }
    }
}