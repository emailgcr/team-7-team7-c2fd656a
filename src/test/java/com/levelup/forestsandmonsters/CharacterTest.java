package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CharacterTest {

    // Testing create Character object
    @Test
    public void createCharacterTest() {
        Character noNameAvatar = new Character();
        Character avatar = new Character("CGRyan");

        assertEquals("CGRyan", avatar.getName());

        assertEquals("Character", noNameAvatar.getName());

    }

    // Testing GetPosition of Character

    @Test
    public void getPositionTest() {

        System.out.println("WAITING FOR GAMEMAP");
    }

    // Testing Enter map
    @Test
    public void enterMapTest() {
        GameMap gameMap = new GameMap();
        Character charObj = new Character();

        charObj.enterMap(gameMap);

        assertNotNull("There is a game map in character", charObj.gameMap);
        System.out.println("WAITING FOR GAMEMAP");

    }
}
