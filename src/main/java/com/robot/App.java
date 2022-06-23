package com.robot;

public class App {
  public static void main(String[] args) {
    Room room = new Room(10, 10);
    Position initPosition = new Position(5, 5);
    Orientation initOrientation = Orientation.North;
    Robot robot = new Robot(room, initPosition, initOrientation);
    String instructions = "DADADADAA";
    try {
      robot.move(StringDirectionsParser.toDirections(instructions));

      System.out.println("Position : " + robot.getPosition());
      System.out.println("Orientation : " + robot.getOrientation());
    } catch (Exception e) {
      System.out.println("Error : " + e.getMessage());
    }
  }
}
