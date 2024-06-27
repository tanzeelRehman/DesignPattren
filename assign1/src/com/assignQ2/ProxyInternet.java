package com.assignQ2;

public class ProxyInternet implements InternetI {
  @Override
  public boolean connectTo(String host) {
    RealInternet realInternet;

    if (host.toLowerCase().contains("cuiatd")) {
      System.out.print("Connected to " + host + " through Proxy Server.");

    } else {
      realInternet = new RealInternet();
      return realInternet.connectTo(host);
    }
    return false;
  }
}
