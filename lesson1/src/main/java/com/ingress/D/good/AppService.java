package com.ingress.D.good;

public class AppService {
    private Database database;

    public AppService(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}