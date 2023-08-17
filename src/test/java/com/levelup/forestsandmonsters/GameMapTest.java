package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class GameMapTest {
     @Test
    public void initializationCreatesResults() {
        GameMap testObj = new GameMap();
        assertNotNull(testObj);
    }

}
