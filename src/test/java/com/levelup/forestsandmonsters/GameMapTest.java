package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Point;

import org.junit.Test;

public class GameMapTest {
    @Test
    public void initializationCreatesResults() {
        GameMap testObj = new GameMap();
        assertNotNull(testObj);
    }

    @Test
    public void check_total_positions_is_100() {
        GameMap testObj = new GameMap();
        int testValue = testObj.getTotalPositions();
        assertEquals(100, testValue);
    }

    @Test
    public void check_positions_is_10_by_10() {
        GameMap testObj = new GameMap();
        Position[][] positions = testObj.getPositions();
        int rowCount = positions.length;
        int colCount = positions[0].length;
        assertEquals(true, rowCount == 10 && colCount == 10);
    }

    @Test
    public void check_position_is_valid_0_0() {
        GameMap testObj = new GameMap();
        assertEquals(true, testObj.isPositionValid(new Point(0, 0)));
    }

    @Test
    public void check_position_is_valid_9_9() {
        GameMap testObj = new GameMap();
        assertEquals(true, testObj.isPositionValid(new Point(9, 9)));
    }

    @Test
    public void check_position_is_valid_0_10() {
        GameMap testObj = new GameMap();
        assertEquals(false, testObj.isPositionValid(new Point(0, 10)));
    }

    @Test
    public void check_position_is_valid_10_0() {
        GameMap testObj = new GameMap();
        assertEquals(false, testObj.isPositionValid(new Point(10, 0)));
    }

    @Test
    public void check_position_is_valid_10_10() {
        GameMap testObj = new GameMap();
        assertEquals(false, testObj.isPositionValid(new Point(10, 10)));
    }
}
