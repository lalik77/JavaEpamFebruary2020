package com.homeworks.hackerrank;

import java.util.Scanner;

/**

 @ resolved by Mami Alex

 **/

public class JavaSubarray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] intArray=new int[n];
        //init of Array
        for (int i = 0; i <n ; i++) {
            intArray[i]=scanner.nextInt();
        }

        scanner.close();

        //   Constraints   : 1 <= inArray.length <= 100

        int count_negativeSum=0;
        //int currentSum=0;the error

        for (int i=0;i<n;i++) {

            for (int j = i; j <n ; j++) {

                int currentSum=0;

                for (int k = i; k <=j ; k++) { //  k <= j because j will not exit from bound of arrays index

                    currentSum+=intArray[k];

                }

                if (currentSum <0 ) count_negativeSum ++;

            }

        }

        System.out.println(count_negativeSum);
        System.out.println(negativeSubArrays(intArray));


    }

    // static method counting negative subArrays

    public static int negativeSubArrays (int[] arr) {

        int count=0;

        for (int i=0;i<arr.length;i++) {
            int sum=0;
            for (int j=i;j<arr.length;j++){

                sum+=arr[j];
                if(sum<0) count++;
            }
        }

        return count;



    }




}
