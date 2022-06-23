package com.robot;

public enum Direction {
    A(0), D(1), G(2);

    private final int value;
    private Direction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Direction valueOf(int value) {
        return Direction.values()[value];
    }
} 