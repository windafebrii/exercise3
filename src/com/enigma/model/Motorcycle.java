package com.enigma.model;

public class Motorcycle extends Vehicle{

    private Integer kickStand;

    public Motorcycle(Integer wheel, Integer numberOfSeat, Integer kickStand){
        super(wheel, numberOfSeat);
        this.kickStand = kickStand;
    }
     public String getType(){
        if ((this.kickStand == 0) && (this.wheel == 3) && (this.numberOfSeat == 1)){
            return ("Motor ini disebut Motor Tosa");
        } else if ((this.kickStand == 1) && (this.wheel == 2) && (this.numberOfSeat == 2)){
            return ("Motor biasa");
        }
        return "inputan salah" ;
     }

    public String print() {
        return "Motor{" +
                "kickstand= " + this.kickStand + "," +
                " numberOfSeat= " + this.numberOfSeat + "," +
                " Jenis Motor= " + getType() +
                '}';
    }





}
