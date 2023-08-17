package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.Character;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EnterMapSteps {

        Character ch;
        // GameMap gm;

    @Given("{string} is created")
    public void givenTheCharacterIsInitialized(String characterName) {
        ch = new Character(characterName);
    }

    @And("the map is available")
    public void mapIsInitialized(){
        // declare gm
    }

    @Then("Character enters the map")
    public void enterMap(){
        // ch.enterMap(gm);
    }    
}
