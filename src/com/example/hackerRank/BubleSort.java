package com.example.hackerRank;

import java.io.*;
import java.util.Scanner;

public class BubleSort
{
    // Main method
    public static void main (String[] args)
    {

        // Declare variables
        Scanner keyboard = new Scanner(System.in);  // Connect to keyboard
        Scanner fileIn = null;  // Declare file variable
        String fileInName = "/home/titik/Downloads/mahasiswa.txt";  // Declare file name variable
        int i = 0;
        int j = 0;
        int k = 0;
        int numberUsed = 10;
        int n;


        String[] planets = new String[11];
        int[] diameters = new int[11];
        double[] lengths = new double[11];

        try
        {
            fileIn = new Scanner(new FileInputStream(fileInName));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: file '" + fileInName + "' not found.");
            System.exit(-1);
        }


        System.out.println("This is the data read from 'Mahasiswa.txt'.");
        // Loop to read input file
        while (fileIn.hasNextLine())
        {

            planets[i] = fileIn.next();
            fileIn.nextLine();
            diameters[j] = fileIn.nextInt();
            fileIn.nextLine();
            lengths[k] = fileIn.nextDouble();

            System.out.printf("%-10s %8s %15s %n" , "Planets", "Diameter (miles)", "  Length of Day (hours)");
            System.out.printf("%-10s %8d %20.2f %n", planets[i], diameters[j], lengths[k]);
            i = i+1;
            j = j+1;
            k = k+1;


        }
        System.out.print("\nDiameter Array before bubble sort");
        printArray(diameters, numberUsed);
        bubbleSortArray(diameters, numberUsed);
        System.out.print("\nDiameter Array After bubble sort");
        printArray(diameters, numberUsed);

    }



    public static void bubbleSortArray(int[] a, int numberUsed)
    {
        int n;
        int m;
        int temp;

        for (n = 0; n <  numberUsed ; n++)
        {
            System.out.print("\n---------- i = " + n + "----------");
            System.out.printf("%18s %13s %12s %12s %12s %12s %12s %14s %12s %12s",  "0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
            System.out.println();
            for ( m = numberUsed - 1; m > n; m--)
            {
                if (a[m] < a[m - 1])
                {
                    System.out.printf("%1d and %1d switched ... %15s", n, m, " ");
                    temp = a[m];
                    a[m] = a[m - 1];
                    a[m - 1] = temp;
                    printArray(a, numberUsed);

                }
            }
        }
    }
    public static void printArray(int[] a, int numberUsed)
    {
        int i;
        for (i = 0; i < numberUsed; i++)
        {
            System.out.printf("      %3d   ", a[i]);
        }
        System.out.println();
    }
//    public static void sort()
//    {
//        int j = 0;
//        String fileName = "/home/titik/Downloads/mahasiswa.txt";
//
//        List<String> processedLines = new ArrayList<String>();
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(fileName));
//            String line;
//            StringBuilder builder;
//            while((line=br.readLine()) != null) {
//                builder = new StringBuilder(line);
//
//                //find number in double quote - assuming there is only one number with double quotes
//                int doubleQuoteIndexStart = builder.indexOf("\"");
//                int doubleQuoteIndexLast = builder.lastIndexOf("\"");
//
//                //for each line, find all indexes of comma
//                int index = builder.indexOf(",");
//
//                //previous used to when there is consecutive comma
//                int prevIndex = 0;
//
//                while (index >= 0) {
//                    if(index < doubleQuoteIndexStart || index > doubleQuoteIndexLast) {
//                        builder.setCharAt(index, '\t');
//                    }
//
//                    //get next index of comma
//                    index = builder.indexOf(",", index + 1);
//
//                    //check for consecutive commas
//                    if(index != -1 && (prevIndex +1) == index) {
//                        builder.setCharAt(index, ' ');
//                        //get next index of comma
//                        index = builder.indexOf(",", index + 1);
//                    }
//                }
//
//                //add the line to list of lines for later storage to file
//                processedLines.add(builder.toString());
//            }
//            Iterator<String> itr = processedLines.iterator();
//            int k =0 ;
//            for ( itr = processedLines.iterator(); itr.hasNext(); itr.hasNext())
//            {
//                String str = itr.toString();
//                String[] splitSt = str.split("\t");
//
//
//            }
//
//            //close the output stream
//            br.close();
//
//            //write all the lines to the file
//
//            for(int i = 0; i < processedLines.size(); i++) {
//                System.out.println(processedLines.get(i));
//            }
//
//
//        } catch(Exception ex) {
//            //handle exception
//
//        }
//    }
//
//    private  static void BubbleSort(ShowSort[] myarray)
//    {
//
//    }
//
//    public static void ubahKoma()
//    {
//        String fileName = "/home/titik/Downloads/mahasiswa.txt";
//
//        List<String> processedLines = new ArrayList<String>();
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(fileName));
//            String line;
//            StringBuilder builder;
//            while((line=br.readLine()) != null) {
//                builder = new StringBuilder(line);
//
//                //find number in double quote - assuming there is only one number with double quotes
//                int doubleQuoteIndexStart = builder.indexOf("\"");
//                int doubleQuoteIndexLast = builder.lastIndexOf("\"");
//
//                //for each line, find all indexes of comma
//                int index = builder.indexOf(",");
//
//                //previous used to when there is consecutive comma
//                int prevIndex = 0;
//
//                while (index >= 0) {
//                    if(index < doubleQuoteIndexStart || index > doubleQuoteIndexLast) {
//                        builder.setCharAt(index, '\t');
//                    }
//
//                    //get next index of comma
//                    index = builder.indexOf(",", index + 1);
//
//                    //check for consecutive commas
//                    if(index != -1 && (prevIndex +1) == index) {
//                        builder.setCharAt(index, ' ');
//                        //get next index of comma
//                        index = builder.indexOf(",", index + 1);
//                    }
//                }
//
//                //add the line to list of lines for later storage to file
//                processedLines.add(builder.toString());
//            }
//
//            //close the output stream
//            br.close();
//
//            //write all the lines to the file
//
//            for(int i = 0; i < processedLines.size(); i++) {
//                System.out.println(processedLines.get(i));
//            }
//
//
//        } catch(Exception ex) {
//            //handle exception
//
//        }
//    }
//
//
//
//    public static void main( String[] args )
//    {
//            System.out.println("Sebelum Sorting");
//            ubahKoma();
//
//
//    }
}
