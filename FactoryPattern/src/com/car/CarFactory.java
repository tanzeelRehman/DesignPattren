package com.car;

public class CarFactory {
  public Car getCar(String carType) {
    if (carType.equalsIgnoreCase(CarType.FamilyCar.name())) {
      return new FamilyCar();
    } else if (carType.equalsIgnoreCase(CarType.SportsCar.name())) {
      return new SportsCar();
    } else if (carType.equalsIgnoreCase(CarType.TransportCar.name())) {
      return new TransportCar();
    }
    return null;
  }
}
