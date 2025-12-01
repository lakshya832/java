package com.demo.oops;

public class test {
    public static void main(String[] args){
        Car car = new Car("White");
        car.speed = 69;
        car.drive();
        System.out.println(car.color);
    }
}
