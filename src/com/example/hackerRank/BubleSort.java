package com.example.hackerRank;

import java.io.*;
import java.util.ArrayList;

public class BubleSort
{

    public static void sort( String[] list, int count )
    // A very simple, stupid Bubble Sort
    // list[] contains the Strings to be sorted
    // count tells how many Strings are in the array
    {
        for (int pass = 0; pass < count; pass = pass+1)
        {
            for (int p = 0; p < count-1; p = p + 1)
            {
                if (list[p].compareTo(list[p+1])>0)
                {
                    String temp = list[p];
                    list[p] = list[p+1];
                    list[p+1] = temp;
                }
            }
        }
    }


    public static String BubleSort()
    {
        String[] list = new String[1000];
        int count = 0;
        String line1;
        String line2;
        ArrayList<String> Prodi = new ArrayList<>();

        try
        {
            // Baca File
            BufferedReader mahasiswa = new BufferedReader(new FileReader("/home/titik/Downloads/mahasiswa.txt"));
            BufferedReader jurusan = new BufferedReader(new FileReader("/home/titik/Downloads/jurusan.txt"));

            while (mahasiswa.ready())
            {
                String item = mahasiswa.readLine();
                list[count] = item;
                count = count + 1;
            }

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
            while((line2 = mahasiswa.readLine()) != null){

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

            System.out.println(hasil2);

            sort(list,count);
            mahasiswa.close();

            // output sorting
            for (int x = 0; x < count; x = x+1)
            {
                list[x] = list[x].replaceAll(",","\t");
                System.out.println(list[x]);
            }

            System.out.close();
        }
        catch (IOException ex)
        {
            System.out.println(ex.toString());
        }
        return null;
    }

    public static void merged()
    {
        try {
            String line1;
            String line2;
            ArrayList<String> Prodi = new ArrayList<>();


            BufferedReader jurusan = new BufferedReader(new FileReader("/home/titik/Downloads/jurusan.txt"));
            BufferedReader mahasiswa = new BufferedReader(new FileReader("/home/titik/Downloads/mahasiswa.txt"));

            System.out.println("hai dari mahasiswa " + mahasiswa);
//            String mahasiswa = new BubleSort("/home/titik/Downloads/mahasiswa.txt");
//            new BubleSort("/home/titik/Downloads/mahasiswa.txt");

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
            while((line2 = mahasiswa.readLine()) != null){

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


            for( int i = 0; i <3 ; i++ )
            {
                for( int j = 0; j < 4; j++ )
                {
                    System.out.print(hasil2[i][j] + "\t");
                    String temp1 = hasil2[i][j];
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
//        BubleSort();

        System.out.println("ini merged");
        merged();
    }
}
