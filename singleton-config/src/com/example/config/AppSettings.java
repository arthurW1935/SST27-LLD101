package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class AppSettings implements Serializable {
    private static volatile AppSettings instance;
    private final Properties props = new Properties();

    private AppSettings() {
        // preventing more than one obj creation
        if  (instance != null) {
            throw new IllegalStateException("AppSettings instance is already initialized");
        }
    }

    public static AppSettings getInstance() {

        if (instance == null) {
            // restricting multiple creation calls
            synchronized (AppSettings.class) {
                if (instance == null) {
                    instance = new AppSettings();
                }
            }
        }

        return instance;
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }

    // ensuring that object still follows singleton after deserialization too
    private Object readResolve() {
        return getInstance();
    }
}
