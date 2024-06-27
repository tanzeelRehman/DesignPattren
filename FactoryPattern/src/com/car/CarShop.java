package com.car;

public class CarShop {
  public static CarShop carShop;
  public CarFactory carFactory;
  public int carSold;

  private CarShop() {
    carFactory = new CarFactory();
    carSold = 0;
  }

  public static CarShop getCarShop() {
    if (carShop == null) {
      carShop = new CarShop();
    }
    return carShop;
  }

  // now our functions also return car
  public Car sellCar(String carType) {
    carSold++;
    return carFactory.getCar(carType);
  }
}
