package com.example.hackerRank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MergedTxt
{
    public void merged1()
    {
        try {
            BufferedReader br1 = null;
            BufferedReader br2 = null;

            String line1;
            String line2;
            ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

            br1 = new BufferedReader(new FileReader("/home/titik/Documents/learn/data1.txt"));
            br2 = new BufferedReader(new FileReader("/home/titik/Documents/learn/data2.txt"));

            while ((line1 = br1.readLine()) != null) {

                String[] split1 = line1.split(",");

                String line1word = split1[0].trim();
                String line1val = split1[1].trim();

                line2 = br2.readLine();

                if (line2 != null) {
                    String[] split2 = line2.trim().split(",");

                    String line2word = split2[0].trim();
                    String line2val = split2[1].trim();

                    ArrayList<String> list = new ArrayList();
                    list.add(line2word);
                    list.add(line2val);
                    arrayList.add(list);

                    if (line1word.equalsIgnoreCase(line2word)) {
                        String ok = "--" + line1word + "," + line1val + "," + line2val;
                        System.out.println(ok);
                    }


                } else {

                    String ok = line1word + "," + line1val + "," + doesexist(arrayList, line1word);
                    System.out.println(ok);
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String doesexist(ArrayList<ArrayList<String>> arrayList, String s) {

        for (int i = 0; i < arrayList.size(); i++) {
            String get = arrayList.get(i).get(0);
            if (get.trim().equalsIgnoreCase(s.trim())) {
                return arrayList.get(i).get(1);

            }
        }

        return "-1";

    }

    public void merged2()
    {
        try {
            BufferedReader mahasiswa = null;
            BufferedReader jurusan = null;

            String line1;
            String line2;
            ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

            mahasiswa = new BufferedReader(new FileReader("/home/titik/Downloads/mahasiswa.txt"));
            jurusan = new BufferedReader(new FileReader("/home/titik/Downloads/jurusan.txt"));

            while ((line1 = mahasiswa.readLine()) != null) {

                String[] split1 = line1.split(",");

                String mahasiswaNim = split1[0].trim();
                String mahasiswaNama = split1[1].trim();
                String mahasiswaKota = split1[2].trim();
                String mahasiswaJurusan = split1[3].trim();
//                System.out.println(line1);

                line2 = jurusan.readLine();

                if (line2 != null) {
                    String[] split2 = line2.trim().split(",");

                    String jurusanAngka = split2[0].trim();
                    String jurusanProdi = split2[1].trim();

                    ArrayList<String> list = new ArrayList();
                    list.add(jurusanAngka);
                    list.add(jurusanProdi);
                    arrayList.add(list);
                    //jadi masalahnya ini, ekonomi kagak mau muncul

                    if (jurusanAngka.equalsIgnoreCase(mahasiswaJurusan)) {
                        String ok = "--" + mahasiswaNim + "," + mahasiswaNama + "," + mahasiswaKota + "," + jurusanProdi;
                        System.out.println(ok);
                    }
//                    System.out.println("in iline2  " + line2);

                }
                else {

                    String ok =  mahasiswaNim + "," + mahasiswaNama + "," + mahasiswaKota  + "," + doesexist(arrayList, mahasiswaJurusan);
                    System.out.println(ok);
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void merged3()
    {
        try {
            BufferedReader mahasiswa = null;
            BufferedReader jurusan = null;

            String line1;
            String line2;
            ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

            mahasiswa = new BufferedReader(new FileReader("/home/titik/Downloads/mahasiswa.txt"));
            jurusan = new BufferedReader(new FileReader("/home/titik/Downloads/jurusan.txt"));

            while ((line1 = jurusan.readLine()) != null) {

                String[] split1 = line1.split(",");

                String jurusanAngka = split1[0].trim();
                String jurusanProdi = split1[1].trim();
//                System.out.println(line1);

                line2 = mahasiswa.readLine();

                if (line2 != null) {
                    String[] split2 = line2.trim().split(",");



                    String mahasiswaNim = split2[0].trim();
                    String mahasiswaNama = split2[1].trim();
                    String mahasiswaKota = split2[2].trim();
                    String mahasiswaJurusan = split2[3].trim();

                    ArrayList<String> list = new ArrayList();
                    list.add(mahasiswaNim);
                    list.add(mahasiswaNama);
                    list.add(mahasiswaKota);
                    list.add(mahasiswaJurusan);
                    arrayList.add(list);
                    //jadi masalahnya ini, ekonomi kagak mau muncul

                    if (jurusanAngka.equalsIgnoreCase(mahasiswaJurusan)) {
                        String ok = "--" + mahasiswaNim + "," + mahasiswaNama + "," + mahasiswaKota + "," + jurusanProdi;
                        System.out.println(ok);
                    }
//                    System.out.println("in iline2  " + line2);

                }
                System.out.println(line1);
//                else {
//
//                    String ok =  mahasiswaNim + "," + mahasiswaNama + "," + mahasiswaKota  + "," + doesexist(arrayList, mahasiswaJurusan);
//                    System.out.println(ok);
//                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main( String[] args )
    {
        MergedTxt mergedTxt = new MergedTxt();
        mergedTxt.merged1();
        System.out.println(" \n\nini merged 3");
        mergedTxt.merged3();
    }

}
