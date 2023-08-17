package com.levelup.forestsandmonsters.features;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point;

public class GameStatusSteps {
    String charName;
    Point currentPosition;
    int moveCount;

@Given("Character Name {String}")
public void givenTheCharactersNameIs(String charName) {
    this.charName = charName;
}

@Given("Current Position {Point}")
public void givenTheCurrentPositionIs(Point currPosition) {
    this.currentPosition = currPosition;
}

@Given("Move Count {int}")
public void givenTheMoveCountIs(int moveCount) {
    this.moveCount = moveCount;
}

@Then("Validate Character Name {String}")
public void checkCharacterName(String charName) {
assertNotNull(this.charName, "Expected charName not null");
assertEquals(charName, this.charName);
}

@Then("Validate Current Position {Point}")
public void checkCurrentPosition(Point currentPosition) {
assertNotNull(this.currentPosition, "Expected currentPosition not null");
assertEquals(currentPosition, this.currentPosition);
}

@Then("Validate Move Count {int}")
public void checkMoveCount(int moveCount) {
assertNotNull(this.moveCount, "Expected moveCount not null");
assertEquals(moveCount, this.moveCount);
}

    
}
