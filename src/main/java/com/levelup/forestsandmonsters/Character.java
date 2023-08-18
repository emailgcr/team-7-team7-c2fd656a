package com.levelup.forestsandmonsters;

public class Character {

  private String name;

  GameMap gameMap;

  public Character() {
    name = "Character";
  }

  public Character(String name) {
    this.name = name;
  }

  public String getName() {

    return this.name;
  }

  public void enterMap(GameMap map) {
    this.gameMap = map;
    System.out.println("Enter Map method");
  }

  public Position gePosition() {
    return null;
  }

}
