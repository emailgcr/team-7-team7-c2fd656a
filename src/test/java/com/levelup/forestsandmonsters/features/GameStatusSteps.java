package com.levelup.forestsandmonsters.features;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.GameController.GameStatus;

public class GameStatusSteps {
    String charName;
    Point currentPosition;
    int moveCount;

    GameController gc = new GameController();
    GameStatus gs = gc.getStatus();

@Given("Character Name {string}")
public void givenTheCharactersNameIs(String charName) {
    this.gs.characterName = charName;
}

@And("Current X Position {int} and Y Position {int}")
public void givenTheCurrentPositionIs(int x, int y) {
    this.gs.currentPosition = convertXYtoPoint(x, y);
}

@And("Move Count {int}")
public void givenTheMoveCountIs(int moveCount) {
    this.gs.moveCount = moveCount;
}

@Then("Validate Character Status {string} {int} {int} {int}")
public void checkCharacterName(String charName, int x, int y, int moveCount) {
    assertEquals(charName, this.gs.characterName);
    Point currentPoint = convertXYtoPoint(x, y); 
    assertEquals(currentPoint, this.gs.currentPosition);
    assertEquals(moveCount, this.gs.moveCount);

}

public Point convertXYtoPoint(int x, int y){
    Point newPoint = new Point(x, y);
    return newPoint;
}    
}
