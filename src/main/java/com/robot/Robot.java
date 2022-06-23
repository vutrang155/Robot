package com.robot;

import java.util.List;

public class Robot {

    private Room room;
    private Position position;
    private Orientation orientation;

    public Robot(Room room, Position position, Orientation orientation) {
        this.room = room;
        this.position = position;
        this.orientation = orientation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position newPosition) {
        position = newPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation newOrientation) {
        orientation = newOrientation;
    }

    private void changeDirection(Direction direction) {
        int newOrientation = (orientation.getValue() + direction.getValue()) % 4;
        Orientation valueNewOrientation = Orientation.valueOf(newOrientation);
        orientation = valueNewOrientation;
    }

    private void move(Direction direction) throws CloneNotSupportedException {
        if (direction != Direction.Advance) {
            changeDirection(direction);
        } else {
            advance();
        }
    }

    public void move(List<Direction> directions) throws CloneNotSupportedException {
        for (Direction d : directions) {
            move(d);
        }
    }

    public boolean isPositionOK(Position newPosition) {
        return newPosition.getX() >= 0 && newPosition.getY() < room.getWidth()
                && newPosition.getY() >= 0 && newPosition.getY() < room.getHeight();
    }

    public void advance() throws CloneNotSupportedException {
        Position newPosition = position.clone(); 

        if (getOrientation() == Orientation.West)
            newPosition = new Position(getPosition().getX() - 1, getPosition().getY());

        if (getOrientation() == Orientation.North)
            newPosition = new Position(getPosition().getX(), getPosition().getY() + 1);
        if (getOrientation() == Orientation.East)

            newPosition = new Position(getPosition().getX() + 1, getPosition().getY());
        if (getOrientation() == Orientation.South)

            newPosition = new Position(getPosition().getX(), getPosition().getY() - 1);

        if (isPositionOK(newPosition)) {
            setPosition(newPosition);
        }
    }
}
