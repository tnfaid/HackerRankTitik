package com.example.hackerRank;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        String nama, alamat;
        int usia, gaji;

        Scanner keyboard = new Scanner(System.in);

        System.out.println(" Coba Doang");
        System.out.print("Nama : ");
        nama = keyboard.nextLine();
        System.out.println("Alamat: ");
        alamat = keyboard.nextLine();
        System.out.println("Usia:");
        usia = keyboard.nextInt();
        System.out.println("Gaji");
        gaji = keyboard.nextInt();

        System.out.println("Nama = " + nama + " Alamat = " + alamat + " Usia : " + usia + " Gaji : " + gaji);


    }
}
