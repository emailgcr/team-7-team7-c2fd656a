package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point; 

public class PositionSteps {
    Point coordinates; 

    @Given("Current coordinates {Point}")
    public void givenTheCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

     @Then("Current Coordinates {Point}")
    public void checkCurrentCoordinates(Point coordinates) {
        assertNotNull(this.coordinates, "Expected coordinates not null");
        assertEquals(coordinates, this.coordinates);
    }
}
