package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point;

import org.springframework.util.Assert;

public class UseGameMap {
    

    @When("a postion is checked for validity")
    public void a_postion_is_checked_for_validity() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("a postion is checked for validity has been reached");
    }


    @Then("the postion {int},{int} is {word} that the position is valid")
    public void the_postion_is_that_the_position_is_valid(int x, int y, String valid) {
        // Write code here that turns the phrase above into concrete actions
        GameMap map = new GameMap();
        boolean isPointValid = map.isPositionValid(new Point(x, y));
        boolean expectedValidity = Boolean.parseBoolean(valid);
        Assert.isTrue(isPointValid == expectedValidity, String.format("The validity of the position does not match the expected value: actual=%s  expected=%s", isPointValid, expectedValidity));
        System.out.println(String.format("Point validity is as expected.  X: %s Y: %s Valid:%s", x, y, valid));
    }
}
