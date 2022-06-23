package com.robot;
import java.util.List;

import com.robot.*;

public class App {

  public Robot robot;

  private void changeDirection(Direction direction) {
    int newOrientation = (robot.getOrientation().getValue() + direction.getValue()) % 4;
    Orientation valueNewOrientation = Orientation.valueOf(newOrientation);
    robot.setOrientation(valueNewOrientation);
  }

  private void move(Direction direction) {
      if(direction != Direction.a) {
          changeDirection(direction);
      } else {
          avancer();
      }
  }

  private void move(List<Direction> directions) {
    for(Direction d: directions) {
      move(d);
    }
  }

  private boolean isPositionOK(Position newPosition) {
    return (
      Room.getWidth() >= newPosition.getX() &&
      newPosition.getX() >= 0 && 
      Room.getHeighth() >= newPosition.getY() &&
      newPosition.getY() >= 0);
  }

  private void avancer() {
    Position newPosition = new Position(robot.getPosition().getX(), robot.getPosition().getY());
  
    if(robot.getOrientation() == Orientation.West)
      newPosition = new Position(robot.getPosition().getX() - 1, robot.getPosition().getY());

    if(robot.getOrientation() == Orientation.Nord)
      newPosition = new Position(robot.getPosition().getX(), robot.getPosition().getY() + 1);
    if(robot.getOrientation() == Orientation.East)

      newPosition = new Position(robot.getPosition().getX() + 1, robot.getPosition().getY());
    if(robot.getOrientation() == Orientation.South)

    newPosition = new Position(robot.getPosition().getX(), robot.getPosition().getY() - 1);
  
    if(isPositionOK(newPosition)) {
      robot.setPosition(newPosition);
    }
  
  }


  public static void main( String[] args )
  {
      Room room = new Room(10, 10);
      Position initPosition = new Position(5,5);
      Robot robot = new Robot(room, initPosition, Orientation.Nord);
      List<Direction> listMove = {, };
    
      robot.move(listMove);
  }
}
