package com.rajan.lambda.exercise;

import com.rajan.model.Car;

import java.util.Arrays;
import java.util.List;

public class LambdaExerciseUnit2Java7 {
    public static void main(String [] ags) {

        List<Car> cars = Arrays.asList(new Car("Nexon", "Tata", "Manual", "2017", 5),
                new Car("Altroz", "Tata", "Manual", "2020", 5),
                new Car("XUV 500", "Mahindra", "Automatic", "2015", 5),
                new Car("XUV", "Mahindra", "Manual", "2017", 4),
                new Car("Baleno", "Suzuki", "Manual", "2014", 2),
                new Car("Vitara Breza", "Suzuki", "Manual", "2019", 3),
                new Car("Kwid", "Renault", "Manual", "2018", 1));

        //1. get all car details
        System.out.println("displaying all cars");
        getCarDetails(cars, new Vehicle() {
            @Override
            public boolean showDetailsOnCondition(Car c) {
                return true;
            }
        });
        System.out.println("\n");

        //2. get all cars from Tata
        System.out.println("displaying cars from TATA");
        getCarDetails(cars, new Vehicle() {
            @Override
            public boolean showDetailsOnCondition(Car car) {
                return car.getCompany().equalsIgnoreCase("tata");
            }
        });
        System.out.println("\n");

        //3. get all car with GNACP RATING MORE THEN 3
        System.out.println("cars having GNCAP rating more then 3 stars");
        getCarDetails(cars, new Vehicle() {
            @Override
            public boolean showDetailsOnCondition(Car car) {
                return car.getgNcapRatings() >= 3;
            }
        });

        //4. get all car before 2018
        System.out.println("displaying all cars made in 2018");
        getCarDetails(cars, new Vehicle() {
            @Override
            public boolean showDetailsOnCondition(Car car) {
                return car.getMakeYear().equalsIgnoreCase("2018");
            }
        });
        System.out.println("\n");

        //5. get all automatic transmission cars
        System.out.println("displaying automatic cars");
        getCarDetails(cars, new Vehicle() {
            @Override
            public boolean showDetailsOnCondition(Car car) {
                return car.getTransmission().equalsIgnoreCase("automatic");
            }
        });
    }
     static void getCarDetails(List<Car> cars, Vehicle vehicle) {
            for (Car car : cars){
                if(vehicle.showDetailsOnCondition(car)) {
                    System.out.println(car);
                }
        }
    }
}
