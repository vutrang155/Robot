package com.robot;

public class Position implements Cloneable {
  private int x;
  private int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return x;
  }

  public void setX(int newX) {
    x = newX;
  }

  public void setY(int newY) {
    y = newY;
  }

  @Override
  public String toString() {
    return "(" + x + "," + y +")";
  }

  @Override
  public Position clone() throws CloneNotSupportedException {
    return (Position) super.clone();
  }
}
