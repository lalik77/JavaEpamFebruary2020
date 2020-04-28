package com.oca_ocp.oca_ch10_practice_exam;

public class Helicopter {

    final static String[] myType = new String[1];

    public int adjustPropellers (int length , String[] type) {

        length++;
        type[0] = "Long";
        return length;
    }

    public void increment(int l) {
        l++;
        l=l+8;
    }
    public void increment2(Integer l) {

        l++;
        l=l+9;
    }

    public void changeString(String s) {

        s="new string";
    }

    public void changeArrayString(String[] arr) {

        arr[0]="new value";
    }

    public void chnageDataInArrayOfInt(Integer[] arr) {

        arr[0]=35;
    }

    public static void main(String[] args) {

        final Helicopter h = new Helicopter();
        int length = 5;
        String[] type = new String[1];

        Integer[] intArray = new Integer[2];

       // length = h.adjustPropellers(length,type);
        h.adjustPropellers(length,type);
        System.out.println(length +" , " + type[0]);

        int len2 = h.adjustPropellers(length,myType);

        System.out.println(len2 + ", " + myType[0]);

        h.increment(len2);
        System.out.println(len2);
        h.increment2(len2);
        System.out.println(len2);

        h.changeString(myType[0]);
        System.out.println(myType[0]);

        h.changeArrayString(myType);
        System.out.println(myType[0]);

        h.chnageDataInArrayOfInt(intArray);
        System.out.println(intArray[0] + ", " + intArray[1]);
    }
}
