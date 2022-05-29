package com.example.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class SequentiallyDescendingAscending {
    public static void main(String[] args) {
        /*
    input = 10, 6, 8, 4, 2, 1
    expected = 10, 1, 6, 2, 8, 4
     */


        int[] arr = {10, 6, 8, 4, 2, 1};
        int temp;
        int left = 0;
        int right = arr.length-1;
        int[] outputArr = new int[arr.length];

        //sorting first
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j< arr.length;j++)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //show the result
        for(int i=0; i<arr.length; i++)
        {
            if( i==0 || i%2 == 0)
            {
                System.out.print(arr[right]+", ");
                outputArr[i] = arr[right];
                right--;
            }
            else{

                System.out.print(arr[left]+", ");
                outputArr[i] = arr[left];
                left++;
            }
        }

        System.out.println("\nArray after sort sequentially: "+Arrays.toString(outputArr));

    }

}
