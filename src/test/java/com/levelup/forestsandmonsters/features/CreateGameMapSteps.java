package com.levelup.forestsandmonsters.features;

import org.springframework.util.Assert;

import com.levelup.forestsandmonsters.GameMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateGameMapSteps {

    @Given("a game is started")
    public void a_game_is_started() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("A Game has started.");
    }

    @When("the game map is created")
    public void the_game_map_is_created() {
        // Write code here that turns the phrase above into concrete actions
        GameMap map = new GameMap();
        System.out.println("A GameMap has been created.");
    }

    @Then("the game map is not empty")
    public void the_game_map_is_not_empty() {
        // Write code here that turns the phrase above into concrete actions
        GameMap map = new GameMap();
        Assert.notNull(map, "GameMap is null.  Something is wrong!!!!");
        System.out.println("A GameMap is not null.");
    }
 

    @Then("the game map has 100 positions")
    public void the_game_map_has_positions() {
        // Write code here that turns the phrase above into concrete actions
        GameMap map = new GameMap();
        int positionCount = map.getPositionCount();
        Assert.isTrue(positionCount == 100, "PositionCount getter failed");
        int rowCount = map.getPositions().length;
        int columnCount = map.getPositions()[0].length;
        int totalCellCount = rowCount * columnCount;
        Assert.isTrue(totalCellCount == 100, "Positions array is not 100.  Something is wrong!!!!");
        System.out.println("A GameMap has 100 positions.");
    }
}
