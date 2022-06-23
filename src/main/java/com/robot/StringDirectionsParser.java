package com.robot;
import java.util.ArrayList;
import java.util.List;

import com.robot.exception.FormatNotConsistentException;

public class StringDirectionsParser {
    public static List<Direction> toDirections(String instructions) throws FormatNotConsistentException {
        List<Direction> dInstructions = new ArrayList<>();
        String[] sInstructions = instructions.split("");
        for (String ins : sInstructions) {
            try {
                dInstructions.add(Direction.valueOf(ins)); 
            }
            catch (IllegalArgumentException exception) {
                throw new FormatNotConsistentException("Format not consistent");
            }
        }

        return dInstructions;
    } 
}
