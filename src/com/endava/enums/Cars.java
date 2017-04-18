package com.endava.enums;

import com.endava.service.Text;

public enum Cars {
    AUDI("Audi"),
    PORSCHE("Porsche"),
    BMW("BMW"),
    FORD("Ford"),
    BENTLEY("Bentley"),
    JAGUAR("Jaguar"),
    MERCEDES("Mercedes-Benz"),
    FERRARI("Ferrari"),
    LAMBORGHINI("Lamborghini");

    String car;
    Cars(String name) {
        car = name;
    }

    public static void getNext(int i){
        calculator(++i);
    }

    public static void getPrevious(int i){
        calculator(--i);
    }

    public static void calculator(int i){
        if (i > Cars.values().length){
            Text.WRONG_LENGTH.getText();
        } else if(i < Cars.values().length) {
            Text.FIRST_POSITION.getText();
        } else {
            for (Cars car : Cars.values()) {
                if (car.ordinal() == i) System.out.println(car.name());
            }
        }
    }

    public static void getAll(){
        for (Cars car : Cars.values()) {
            System.out.println("Position " + car.ordinal() + " Name : " + car.name());
        }
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
