package com.robot;

public class Room {
  static int width;
  static int height;

  public Room(int width, int height){
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int w) {
    width = w;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int h) {
    height = h;
  }
}
