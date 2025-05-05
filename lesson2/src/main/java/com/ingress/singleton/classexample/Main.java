package com.ingress.singleton.classexample;

public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();

        System.out.println("App Name: " + config.getConfig("app.name"));
        System.out.println("DB URL: " + config.getConfig("db.url"));

        config.setConfig("app.name", "YourApp");
        System.out.println("Updated App Name: " + config.getConfig("app.name"));
    }
}
