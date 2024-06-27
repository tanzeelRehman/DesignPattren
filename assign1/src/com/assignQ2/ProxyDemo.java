package com.assignQ2;

import java.util.Scanner;

public class ProxyDemo {
  public static void main(String[] args) {
    InternetI connInternet = new ProxyInternet();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Website to connect to : ");
    connInternet.connectTo(scanner.next());
  }
}
