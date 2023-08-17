package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.Character;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetPositionSteps {

    Character ch;

    @Given("{string} is present on the GameMap")
    public void givenTheCharactersNameIs(String characterName) {
        ch = new Character(characterName);
    }

    @Then("Character is found at this position ")
    public void getPosition() {
        // Position
        System.out.println("Position is 0,1");
    }

    
}
