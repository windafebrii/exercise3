package com.enigma.model;

public class Vehicle {
    protected Integer wheel;
    protected Integer numberOfSeat;

    public Vehicle(Integer wheel, Integer numberOfSeat){
        this.wheel = wheel;
        this.numberOfSeat = numberOfSeat;
    }

    public String getType() {
        if (this.wheel == 2 || this.wheel ==3){
            return ("Ini adalah Jenis Kendaraan Motor");
        } else if(this.wheel >= 4  && this.wheel % 2 == 0) {
            return ("Ini adalah Jenis Kendaraan Mobil");
        }
        return "Bukan Kendaraan Bermotor";
    }

    public String print() {
        return "Vehicle{" +
                "wheel=" + wheel +
                ", numberOfSeat=" + numberOfSeat +
                '}';
    }
}

