package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.Character;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCharacterSteps {

    // GameController gameController;
    String characterName;
    com.levelup.forestsandmonsters.Character charObj;

    @Given("player supplies the name {string}")
    public void givenTheCharactersNameIs(String characterName) {
        this.characterName = characterName;
    }

    @When("the character is created")
    public void whenTheCharacterSetsTheirName() {

        charObj = this.characterName == "" ? new Character() : new Character(this.characterName);

    }

    @Then("the Game sets the character name to {string}")
    public void thenTheGameSetsTheCharactersName(String expectedName) {
        assertEquals(expectedName, charObj.getName());
    }

}
