package com.robot;

import com.robot.Direction;
import com.robot.Position;
import com.robot.Orientation;
import com.robot.Direction;
import java.util.List;

public class Robot 
{

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

}
