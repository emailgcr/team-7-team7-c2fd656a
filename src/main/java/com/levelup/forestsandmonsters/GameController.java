package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = new Point(0, 0);
        // TODO: Write a failing unit test that will force you to set this to the right number
        public int moveCount = -100;

        public String toString(String name, Point currPos, int moveCount){
            return name +" is on poisition " + currPos.x + "," + currPos.y + " and has a move count of " + moveCount;
        }
    }

    GameStatus status;
    Character gCharacter;
    GameMap gMap;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this with Character.java method
    public void createCharacter(String name) {
        gCharacter = new Character(name);
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
        Position newPos = gCharacter.move(directionToMove);
        Point newPoint = new Point(newPos.coordinates.x, newPos.coordinates.y);
        setCharacterPosition(newPoint);
        setCurrentMoveCount(status.moveCount);
        status.toString();
    }

    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
        status.currentPosition = coordinates;
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
        status.moveCount ++;
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return gMap.getTotalPositions();
    }

}
