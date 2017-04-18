package com.endava.entities;

public class Car {
    private String name;
    private Engine engine;
    private Wheel wheel;
    private Transmission transmission;

    public Car() {
        engine = new Car.Engine();
        wheel = new Car.Wheel();
        transmission = new Car.Transmission();
    }


    public class Engine{
        private String model;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void check(){

            class Oil{
                private String oil;

                public String getOil() {
                    return oil;
                }

                public void setOil(String oil) {
                    this.oil = oil;
                }
            }

            class Petrol{
                private String petrol;

                public String getPetrol() {
                    return petrol;
                }

                public void setPetrol(String petrol) {
                    this.petrol = petrol;
                }
            }

        }

    }

    public class Wheel{
        private String wheel;

        public String getWheel() {
            return wheel;
        }

        public void setWheel(String wheel) {
            this.wheel = wheel;
        }

        public void check(){

            class State{
                private String state;

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }
            }

            class Pressure{
                private String pressure;

                public String getPressure() {
                    return pressure;
                }

                public void setPressure(String pressure) {
                    this.pressure = pressure;
                }
            }
        }
    }

    public class Transmission{
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void check(){
            class Gear{
                private int gearNumber;

                public int getGearNumber() {
                    return gearNumber;
                }

                public void setGearNumber(int gearNumber) {
                    this.gearNumber = gearNumber;
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
