package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class CharacterTest {

     @Test
    public void initializationCreatesResults() {
        Character testObj = new Character();
        Character avatar = new Character("CGRyan");
        assertEquals(avatar.getName(),"CharName");
    }
}


