package com.rajan.model;

import java.util.Objects;

public class Car {

    private String model;
    private String company;
    private String transmission;
    private String makeYear;
    private int gNcapRatings;

    public Car(String model, String company, String transmission, String makeYear, int gNcapRatings) {
        this.model = model;
        this.company = company;
        this.transmission = transmission;
        this.makeYear = makeYear;
        this.gNcapRatings = gNcapRatings;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    public int getgNcapRatings() {
        return gNcapRatings;
    }

    public void setgNcapRatings(int gNcapRatings) {
        this.gNcapRatings = gNcapRatings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return gNcapRatings == car.gNcapRatings &&
                Objects.equals(model, car.model) &&
                Objects.equals(company, car.company) &&
                Objects.equals(transmission, car.transmission) &&
                Objects.equals(makeYear, car.makeYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, company, transmission, makeYear, gNcapRatings);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", transmission='" + transmission + '\'' +
                ", makeYear='" + makeYear + '\'' +
                ", gNcapRatings=" + gNcapRatings +
                '}';
    }
}
