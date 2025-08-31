package com.example.config;

import java.nio.file.Path;

/** Loader that delegates to the singleton instead of creating new instances. */
public class SettingsLoader {
    public AppSettings load(Path file) {
        AppSettings s = AppSettings.getInstance();
        s.loadFromFile(file);
        return s;
    }
}
