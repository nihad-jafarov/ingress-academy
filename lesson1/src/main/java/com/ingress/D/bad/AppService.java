package com.ingress.D.bad;

public class AppService {
    private MySQLDatabase database;

    public AppService() {
        this.database = new MySQLDatabase();
    }

    public void start() {
        database.connect();
    }
}