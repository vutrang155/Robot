package com.robot;

public class Room {
  static int width;
  static int height;

  public Room(int width, int height){
    this.width = width;
    this.height = height;
  }

  public static int getWidth() {
    return width;
  }

  public void setWidth(int w) {
    width = w;
  }

  public static int getHeighth() {
    return height;
  }

  public void setHeight(int h) {
    height = h;
  }
}
