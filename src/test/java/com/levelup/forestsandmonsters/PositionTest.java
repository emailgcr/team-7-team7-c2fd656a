package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import java.awt.Point; 

public class PositionTest {
    @Test
    public void Position(){
           int x = 3; 
           int y = 4; 
           Point coordinates = new Point(x, y); 

        // and name is given
        assertEquals(3, x);

        //and no name is given
        assertEquals(4, y);
    
    }

    
}
