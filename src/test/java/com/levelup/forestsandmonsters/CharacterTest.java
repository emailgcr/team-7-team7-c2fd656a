package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CharacterTest {

    

     @Test
    public void createCharacterTest() {
        Character noNameAvatar = new Character();
        Character avatar = new Character("CGRyan");

        // and name is given
        assertEquals("CGRyan", avatar.getName());

        //and no name is given
        assertEquals("Character", noNameAvatar.getName());

    }

    @Test
    public void getPositionTest(){
        // Character char1 = new Character();
        
        System.out.println("WAITING FOR GAMEMAP");
    }

    @Test
    public void enterMapTest(){
        GameMap gm = new GameMap();
        Character ch = new Character();

        ch.enterMap(gm);

        assertNotNull("There is a game map in character", ch.gm);
        System.out.println("WAITING FOR GAMEMAP");
    }
}


