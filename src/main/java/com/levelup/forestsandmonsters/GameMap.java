package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameMap {
    private Integer numPositions;
    private Position[][] positions = new Position[10][10];   

    
    public Integer getPositionCount() {
        return numPositions;
    }

    
    private void setPositionCount(Integer count) {
        numPositions = count;
    }
    
    public GameMap() {
        setPositionCount(100);

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                Position pd = new  Position(i, j);
                positions[i][j]= pd; 
            }
        }
     }

     public int getTotalPositions() {
        return numPositions.intValue();
    }

     public Position[][] getPositions(){
     
          return positions;
     }

    public boolean isPositionValid(Point point) {
        boolean isXValid = false;
        boolean isYValid = false;

        isXValid = point.x >= 0 && point.x <= 9;
        isYValid = point.y >= 0 && point.y <= 9; 

        return isXValid && isYValid;
    }
     
}
