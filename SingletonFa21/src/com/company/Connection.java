package com.company;

public class Connection {

    private static Connection connectionInstance;
    private int count = 0;

    private Connection() {
    }

    public static Connection getInstance() {
        if (connectionInstance == null) {
            connectionInstance = new Connection();
        }
        return connectionInstance;
    }

    public void incrementCount() {
        System.out.println("Present Count is : " + count);
        count++;
        System.out.println("After Increment Count is : " + count);
    }
}
