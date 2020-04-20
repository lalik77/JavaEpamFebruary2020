package com.oca_ocp.oca_ch10_practice_exam.materials;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.time.Period;

abstract  class CarbonStructure {
    protected long count;
    public abstract Number getCount() throws IOException;
    public CarbonStructure(int count) { this.count = count ; }

}

public class Diamond extends CarbonStructure {

    public Diamond() { super(15); }
    public Long getCount() {
        return count;

    }

    public static void main(String[] cost) throws IOException {

        try{
            final CarbonStructure ring = new Diamond(); // q3
            System.out.println(ring.getCount());

        }catch(IndexOutOfBoundsException e){

            e.printStackTrace();
        }

    }
}
