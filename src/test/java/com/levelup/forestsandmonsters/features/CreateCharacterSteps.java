package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.Character;
import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCharacterSteps {

    // GameController gc;
    String characterName;
    com.levelup.forestsandmonsters.Character ch;

    @Given("player supplies the name {string}")
    public void givenTheCharactersNameIs(String characterName) {
        this.characterName = characterName;
    }

    @When("the character is created")
    public void whenTheCharacterSetsTheirName() {
        
        ch = this.characterName == "" ? new Character() : new Character(this.characterName);
        /* gc.createCharacter(characterName);*/
    }

    @Then("the Game sets the character name to {string}")
    public void thenTheGameSetsTheCharactersName(String expectedName) {
        assertEquals(expectedName, ch.getName());
    }

}
