package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point; 

public class PostitionSteps {
    Point coordinates; 

    @Given("Current coordinates {int}")
    public void givenTheCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

     @Then("Current Coordinates {int}")
    public void checkCurrentCoordinates(Point coordinates) {
        assertNotNull(this.coordinates, "Expected coordinates not null");
        assertEquals(coordinates, this.coordinates);
    }
}
