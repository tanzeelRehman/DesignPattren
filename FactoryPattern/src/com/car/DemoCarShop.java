package com.car;

public class DemoCarShop {
  public static void main(String[] args) {
    CarShop carShop = CarShop.getCarShop();
    System.out.println("Total Cars Sold : " + carShop.carSold);
    Car sportCar = carShop.sellCar(CarType.SportsCar.name());
    Car flyingCar = carShop.sellCar(CarType.FamilyCar.name());
    Car transportCar = carShop.sellCar(CarType.TransportCar.name());
    sportCar.start();
    flyingCar.start();
    transportCar.start();
    System.out.println("Total Cars Sold : " + carShop.carSold);

  }
}
