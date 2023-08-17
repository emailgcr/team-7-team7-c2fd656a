package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    public Position getPositionTest(){
        Character char1 = new Character();
        
        return char1.gePosition();
    }
}


