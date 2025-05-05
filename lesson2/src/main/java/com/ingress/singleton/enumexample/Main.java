package com.ingress.singleton.enumexample;

public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.INSTANCE;

        String appName = config.getConfig("app.name");
        String dbUrl = config.getConfig("db.url");

        System.out.println("App Name: " + appName);
        System.out.println("DB URL: " + dbUrl);

        config.setConfig("app.name", "YourApp");
        System.out.println("Updated App Name: " + config.getConfig("app.name"));
    }
}
