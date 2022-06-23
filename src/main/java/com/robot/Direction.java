package com.robot;

public enum Direction {
    a(0), r(1), l(2);

    private final int value;
    private Direction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Direction  valueOf(int value) {
        return Direction.values()[value];
    }
} 