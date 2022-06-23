package com.robot;

public enum Orientation {
    West(0), North(1), East(2), South(3);

    private final int value;
    private Orientation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Orientation  valueOf(int value) {
        return Orientation.values()[value];
    }
} 