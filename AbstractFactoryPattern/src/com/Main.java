package com;

import com.GUIFactory.Application;
import com.GUIFactory.GUIFactory;
import com.GUIFactory.MacOSFactory;
import com.GUIFactory.WindowFactory;

public class Main {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
