package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Thread-safe Singleton implementation of AppSettings.
 * - Lazy initialization (Bill Pugh Holder idiom).
 * - Blocks reflection-based multiple instantiation.
 * - Preserves singleton on serialization (readResolve).
 */
public final class AppSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Properties props = new Properties();

    // Flag to detect reflection attack
    private static volatile boolean initialized = false;

    private AppSettings() {
        if (initialized) {
            throw new IllegalStateException("Singleton already initialized");
        }
        initialized = true;
    }

    // Holder idiom ensures lazy + thread-safe initialization
    private static class Holder {
        private static final AppSettings INSTANCE = new AppSettings();
    }

    public static AppSettings getInstance() {
        return Holder.INSTANCE;
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

    // Prevents new instances during deserialization
    private Object readResolve() {
        return getInstance();
    }
}
