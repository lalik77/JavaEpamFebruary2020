package com.homeworks.hackerrank;

import java.util.Arrays;

public class JavaSparseArrays {
    static int[] matchingStrings(String[] strings, String[] queries) {

        int freqlen=queries.length;
        int [] freqency = new int[freqlen];
        int counter ;
        for(int i = 0; i < queries.length ; i++ ) {

            counter=0;

            for (int j=0;j<strings.length;j++)  {

                if(queries[i].equals(strings[j]))
                {
                    counter++;
                    freqency[i] = counter;

                }
            }
        }
        return freqency;

    }


    public static void main(String[] args) {

        String[] string1 = {"aba","baba","aba","xzxb"};
        String[] querie1 = {"aba","xzxb","ab"};

        int [] freq=matchingStrings(string1, querie1);

        System.out.println(Arrays.toString(freq));
    }


}
