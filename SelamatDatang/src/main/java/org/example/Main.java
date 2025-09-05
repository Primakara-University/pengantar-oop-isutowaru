package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama Anda: ");
            String nama = input.nextLine().trim();

            if (nama.isEmpty()) {
                System.out.println("Nama tidak boleh kosong.");
                return;
            }

            System.out.println("Selamat datang, " + nama + "!");
        }
    }
}
