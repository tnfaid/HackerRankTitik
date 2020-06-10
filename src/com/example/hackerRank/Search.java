package com.example.hackerRank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        String filePath = "/home/titik/Downloads/mahasiswa.txt";
        Scanner strInput = new Scanner(System.in);
        String cariNim,ketikNim, newNama, newAlamat, newId_fakultas;
        System.out.print("Masukkan NIM Mahasiswa: ");
//        cariNim = strInput.nextLine();
//        ketikNim=cariNim;
        Carilah();
    }

    public static void Carilah()
    {
        Scanner strInput = new Scanner(System.in);
        System.out.println("Masukkan NIM ");
        String nim = strInput.nextLine();
        //baca file dulu
        try
        {
            BufferedReader bacaMahasiswa = new BufferedReader(new FileReader("/home/titik/Downloads/mahasiswa.txt"));
            String baris1;
            ArrayList<String> arrMahasiswa = new ArrayList<>();

            while((baris1=bacaMahasiswa.readLine()) != null)
            {
                String[] arrOfStr = baris1.split(",");
                for( int i = 0; i <arrOfStr.length ; i++ )
                {
                    arrMahasiswa.add(arrOfStr[i]);
                    ( nim.compareToIgnoreCase(arrMahasiswa.get(0)) )
                    {
                        System.out.println(arrMahasiswa+"\n");
                    }
                }
            }

        }
        catch ( Exception e )
        {

        }
        //terjemahkah perbaris
        //input apa yang dicari
        //pencocokan
        //output
    }


//    public static void searchRecord (String filePath, String editTerm, String search) throws FileNotFoundException
//    {
//        String nim = "";
//
//        {
//            Scanner strInput = new Scanner(new File(filePath));
//            strInput.useDelimiter("[,\n]");
//
//            while (strInput.hasNext())
//            {
//                searchNim = strInput.next();
//                if (searchNim.equals(editTerm))
//                {
//
//                    String input;
//                    List<String> processedLines = new ArrayList<String>();
//
//                    try {
//                        BufferedReader br = new BufferedReader(new FileReader(filePath));
//                        String line;
//                        StringBuilder builder;
//                        while((line=br.readLine()) != null) {
//                            builder = new StringBuilder(line);
//
//                            //find number in double quote - assuming there is only one number with double quotes
//                            int doubleQuoteIndexStart = builder.indexOf("\"");
//                            int doubleQuoteIndexLast = builder.lastIndexOf("\"");
//
//                            //for each line, find all indexes of comma
//                            int index = builder.indexOf(",");
//
//                            //previous used to when there is consecutive comma
//                            int prevIndex = 0;
//
//                            while (index >= 0) {
//                                if(index < doubleQuoteIndexStart || index > doubleQuoteIndexLast) {
//                                    builder.setCharAt(index, '\t');
//                                }
//
//                                //get next index of comma
//                                index = builder.indexOf(",", index + 1);
//
//                                //check for consecutive commas
//                                if(index != -1 && (prevIndex +1) == index) {
//                                    builder.setCharAt(index, ' ');
//                                    //get next index of comma
//                                    index = builder.indexOf(",", index + 1);
//                                }
//                            }
//
//                            //add the line to list of lines for later storage to file
//                            processedLines.add(builder.toString());
//                        }
//
//                        //close the output stream
//                        br.close();
//
//                        //write all the lines to the file
//                        // File outFile = new File("E:\\UBL\\StrukturData\\Mahasiswa\\mahasiswa.txt");
//                        // PrintWriter writer = new PrintWriter(outFile);
//                        for(int i = 0; i < processedLines.size(); i++) {
//                            System.out.println(processedLines.get(i));
//                        }
//                    } catch(Exception ex) {
//                        //handle exception
//
//                    }
//
//                }
//
//                else
//                {
//                    System.out.println("Data tidak ditemukan");
//                }
//            }
//            strInput.close();
//
//        }
//        {
//            System.out.println("Error");
//        }
//
//    }

}
