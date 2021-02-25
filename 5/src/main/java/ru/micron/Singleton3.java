package ru.micron;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton3 {

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if(instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

}