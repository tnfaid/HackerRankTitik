package com.example.hackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


    public BubleSort( String fileName)
    {
        String[] list = new String[1000];
        int count = 0;

        try
        {
            // Baca File
            BufferedReader info = new BufferedReader(new FileReader(fileName));

            while (info.ready())
            {
                String item = info.readLine();
                list[count] = item;
                count = count + 1;
            }
            info.close();

            sort(list,count);

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
    }

    public static void main( String[] args )
    {
        System.out.println("\n ****************** \njadi ini test2 sorting \n");
        new BubleSort("/home/titik/Downloads/mahasiswa.txt");
    }
}
