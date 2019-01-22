package com.company;

public class Car {


    private int carYear;
    private String carMake;
    private String carModel;
    private double carMileage;

    public Car(int carYear, String carMake, String carModel, double carMileage) {
        this.carYear = carYear;
        this.carMake = carMake;
        this.carModel = carModel;
        this.carMileage = carMileage;
    }

    public Car() {
    }

    public void setCarYear(int carYear){

        this.carYear = carYear;

    }

    public int getCarYear(){

        return this.carYear;
    }

    public void setCarMake(String carMake){

        this.carMake = carMake;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(double carMileage) {
        this.carMileage = carMileage;
    }

    @Override
    public String toString() {
        return "The cars year is " + carYear +
                ", that make is '" + carMake +
                ", the model is '" + carModel +
                ", the mileage is " + carMileage +
                '}';
    }
}
