package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    public void check_positions_row_count_and_column_count_are_10() {
        GameMap testObj = new GameMap();
        Position[][] positions = testObj.getPositions();
        int rowCount = positions.length;
        int colCount = positions[0].length;
        assertEquals(true, rowCount == 10 && colCount == 10);
    }

    @Test
    public void check_position_is_valid_0_0() {
        GameMap testObj = new GameMap();
        assertEquals(true, testObj.isPositionValid(new Position(0, 0)));
    }

    @Test
    public void check_position_is_valid_9_9() {
        GameMap testObj = new GameMap();
        assertEquals(true, testObj.isPositionValid(new Position(9, 9)));
    }

    @Test
    public void check_position_is_invalid_0_10() {
        GameMap testObj = new GameMap();
        assertEquals(false, testObj.isPositionValid(new Position(0, 10)));
    }

    @Test
    public void check_position_is_invalid_10_0() {
        GameMap testObj = new GameMap();
        assertEquals(false, testObj.isPositionValid(new Position(10, 0)));
    }

    @Test
    public void check_position_is_invalid_10_10() {
        GameMap testObj = new GameMap();
        assertEquals(false, testObj.isPositionValid(new Position(10, 10)));
    }
}
