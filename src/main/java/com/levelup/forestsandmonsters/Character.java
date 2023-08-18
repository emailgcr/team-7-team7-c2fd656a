package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

  private String name;

  GameMap gameMap;
  GameController gameContr = new GameController();

  public Character() {
    name = "Character";
  }

  public Character(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String charName) {
    this.name = charName;
  }

  public void enterMap(GameMap map) {
    this.gameMap = map;
    System.out.println("Enter Map method");
  }

  public Position move(DIRECTION direction){
    return gameMap.calculatePosition(getPosition(), direction);
  }

  public Position getPosition() {
    Point currPoint = gameContr.getStatus().currentPosition;
    Position currPosition = new Position(currPoint.x, currPoint.y);
    return currPosition;
  }

}
