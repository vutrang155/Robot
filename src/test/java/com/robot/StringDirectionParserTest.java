package com.robot;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.robot.exception.FormatNotConsistentException;

public class StringDirectionParserTest {
    @Test
    public void testNormalCase() throws FormatNotConsistentException {
        String input = "GAGADADADADAA";
        List<Direction> expectedResult = Arrays.asList(
            Direction.G,
            Direction.A,
            Direction.G,
            Direction.A,
            Direction.D,
            Direction.A,
            Direction.D,
            Direction.A,
            Direction.D,
            Direction.A,
            Direction.D,
            Direction.A,
            Direction.A
        );
        
        assertEquals(expectedResult, StringDirectionsParser.toDirections(input));
    }

    @Test(expected = FormatNotConsistentException.class)
    public void testErrorCase() throws FormatNotConsistentException{
        StringDirectionsParser.toDirections("DADDADADErrorLALA");
    }
}
