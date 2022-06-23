package com.robot;

import java.util.Arrays;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Room room = new Room(10, 10);
    Position initPosition = new Position(5, 5);
    Orientation initOrientation = Orientation.Nord;
    Robot robot = new Robot(room, initPosition, initOrientation);
    List<Direction> instructions = Arrays.asList(
        Direction.Right,
        Direction.Advance,
        Direction.Right,
        Direction.Advance,
        Direction.Right,
        Direction.Advance,
        Direction.Right,
        Direction.Advance,
        Direction.Advance);
    try {
      robot.move(instructions);

      System.out.println("Position : " + robot.getPosition());
      System.out.println("Orientation : " + robot.getOrientation());
    } catch (Exception e) {
      System.out.println("Error : " + e.getMessage());
    }
  }
}
