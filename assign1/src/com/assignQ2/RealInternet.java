package com.assignQ2;

public class RealInternet implements InternetI {
  @Override
  public boolean connectTo(String host) {

    if (connected(host)) {
      System.out.println("Connected to " + host + " through Real Internet.");
      return true;
    }

    return false;
  }

  private boolean connected(String host) {
    return true;
  }
}
