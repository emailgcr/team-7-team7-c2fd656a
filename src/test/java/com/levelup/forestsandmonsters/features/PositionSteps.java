package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point; 

public class PositionSteps {
    Point coordinates; 
    int x;
    int y;

    @Given("You have X coordinate {int}")
    public void checkXCoordinates(int endX) {
        this.x = endX;
    }

    @Then("You have Y coordinate {int}")
    public void checkYCoordinates(int endY) {
        this.y = endY;
    }

    

     @Then("The user gets coordinates")
    public void checkCurrentCoordinates(){
        coordinates = new Point(x, y);

        assertNotNull(this.coordinates, "Expected coordinates not null");

        assertEquals(this.x, this.coordinates.x);
        assertEquals(this.y, this.coordinates.y);
    }
}
