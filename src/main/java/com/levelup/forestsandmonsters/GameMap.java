package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameMap {
    private static final int MAXIMUM_ROW_COUNT = 10;
    private static final int MAXIMUM_COLUMN_COUNT = 10;
    private static final int MINIMUM_ROW_ID = 0;
    private static final int MINIMUM_COLUMN_ID = 0;
    private static final int MAXIMUM_POSITION_COUNT = 100;

    private Integer numPositions;
    private Position[][] positions = new Position[MAXIMUM_ROW_COUNT][MAXIMUM_COLUMN_COUNT];
    
    public Integer getPositionCount() {
        return numPositions;
    }
    
    private void setPositionCount(Integer count) {
        numPositions = count;
    }
    
    public GameMap() {
        setPositionCount(MAXIMUM_POSITION_COUNT);

        for(int row = MINIMUM_ROW_ID; row < MAXIMUM_ROW_COUNT; row++){
            for(int column = MINIMUM_COLUMN_ID; column < MAXIMUM_COLUMN_COUNT; column++){
                Position position = new  Position(row, column);
                positions[row][column]= position; 
            }
        }
     }

     public int getTotalPositions() {
        return numPositions.intValue();
    }

     public Position[][] getPositions() {
          return positions;
     }

    public boolean isPositionValid(Point point) {
        boolean isXValid = false;
        boolean isYValid = false;

        isXValid = point.x >= MINIMUM_COLUMN_ID && point.x < MAXIMUM_COLUMN_COUNT;
        isYValid = point.y >= MINIMUM_ROW_ID && point.y < MAXIMUM_ROW_COUNT; 

        return isXValid && isYValid;
    }     
}
