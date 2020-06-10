package com.example.hackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BubleSort
{

    public static String[][] sort(String[][] list, int count)
    // A very simple, stupid Bubble Sort
    // list[] contains the Strings to be sorted
    // count tells how many Strings are in the array
    {
        String temp[][] = new String[3][4];
        for (int pass = 0; pass < count; pass++)
        {
            for (int p = 0; p < count-1; p++)
            {
                if (list[p][0].compareTo(list[p+1][0])>0)
                {
                    temp[p][0] = list[p][0];
                    temp[p][1] = list[p][1];
                    temp[p][2] = list[p][2];
                    temp[p][3] = list[p][3];

                    list[p][0] = list[p+1][0];
                    list[p][1] = list[p+1][1];
                    list[p][2] = list[p+1][2];
                    list[p][3] = list[p+1][3];

                    list[p+1][0] = temp[p][0];
                    list[p+1][1] = temp[p][1];
                    list[p+1][2] = temp[p][2];
                    list[p+1][3] = temp[p][3];
                }
            }
        }
        return list;
    }

    public static void merged()
    {
        try {
            String[] list = new String[1000];
            int count = 0;
            String line1;
            String line2;
            ArrayList<String> Prodi = new ArrayList<>();


            BufferedReader jurusan = new BufferedReader(new FileReader("/home/titik/Downloads/jurusan.txt"));
            BufferedReader mahasiswa = new BufferedReader(new FileReader("/home/titik/Downloads/mahasiswa.txt"));


            while ((line1 = jurusan.readLine()) != null)
            {
                String[] arrOfStr = line1.split(",");

                for( int i = 0; i <arrOfStr.length ; i++ )
                {
                    if(i==1) Prodi.add(arrOfStr[i]);
                }
            }

            String[][] hasil2 = new String[3][4];
            int dataRowMahasiswa = 0;

            while((line2 = mahasiswa.readLine())!= null){
                String[] arrOfStr = line2.split(",");

                for( int i = 0; i <arrOfStr.length ; i++ )
                {
                    if(i==3) {
                        if(arrOfStr[i].equals("1")){
                            arrOfStr[3] = Prodi.get(0);
                        }
                        if(arrOfStr[i].equals("2")){
                            arrOfStr[3]  = Prodi.get(1);
                        }
                        if(arrOfStr[i].equals("3")){
                            arrOfStr[3]  = Prodi.get(2);
                        }
                        if(arrOfStr[i].equals("4")){
                            arrOfStr[3]  = Prodi.get(3);
                        }
                    }
                    hasil2[dataRowMahasiswa][i] = arrOfStr[i];
                }
                dataRowMahasiswa++;
            }


            hasil2 = sort(hasil2, 3);
            System.out.println("hasil");
            for( int i = 0; i <3 ; i++ )
            {
                for( int j = 0; j < 4; j++ )
                {
                    System.out.print(hasil2[i][j] + "\t");
                }
                System.out.println();
            }
            // list[] contains the Strings to be sorted
            // count tells how many Strings are in the array


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void main( String[] args )
    {
        System.out.println("\n ****************** \njadi ini test2 sorting \n");
//        System.out.println("BubleSort");
//        BubleSort();

        System.out.println("ini merged");
        merged();
    }
}
