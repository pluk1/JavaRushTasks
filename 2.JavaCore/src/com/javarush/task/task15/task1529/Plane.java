package com.javarush.task.task15.task1529;

public class Plane implements Flyable{
    int seats;

    @Override
    public void fly() {

    }

    public Plane(int seats) {
        this.seats = seats;
    }
}
