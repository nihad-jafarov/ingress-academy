package com.ingress.singleton.classexample;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static final ConfigManager instance = new ConfigManager();

    private Map<String, String> config;

    private ConfigManager() {
        loadConfiguration();
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    private void loadConfiguration() {
        config = new HashMap<>();
        config.put("app.name", "MyApp");
        config.put("app.version", "1.0.0");
        config.put("db.url", "jdbc:mysql://localhost:3306/mydb");
        System.out.println("Configuration loaded.");
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public void setConfig(String key, String value) {
        config.put(key, value);
    }
}
