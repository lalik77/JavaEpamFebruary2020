package com.oca_ocp.ocp_ch20_java_concurrency;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
//Q25
public class Car {
    private String model;
    private int year;

    public Car (String name , int year) {

        this.model = name; this.year=year;
    }

    public int getYear() {return year;};
    @Override
    public String toString() { return  model;}

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mustang",1967));
        cars.add(new Car("Thunderbird",1967));
        cars.add(new Car("Escort",1975));

        ConcurrentMap< Integer,List<Car> > map = cars
                .stream()
                .collect(Collectors.groupingByConcurrent(Car::getYear));
        System.out.println(map);
    }
}
