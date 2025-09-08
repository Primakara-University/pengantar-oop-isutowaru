package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean salah = false;
        String nama;
        try (Scanner input = new Scanner(System.in)) {
            do {
            System.out.print("Masukkan nama Anda: ");
            nama = input.nextLine().trim();



                if (nama == "") {
                    System.out.println("Nama tidak boleh kosong.");
                    salah = true;
                } else {System.out.println("Selamat datang, " + nama + "!");
                    salah = false;
                }
            } while (salah == true);


        }
    }
}
