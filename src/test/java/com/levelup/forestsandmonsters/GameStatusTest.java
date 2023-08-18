package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Point;

import org.junit.Test;
import com.levelup.forestsandmonsters.GameStatusTest;
import com.levelup.forestsandmonsters.GameController.GameStatus;

public class GameStatusTest {
    @Test
    public void Position(){
        GameController gc = new GameController();
        GameStatus gs = gc.getStatus();
        Point point = new Point(1, 1);
        Point expectedPoint = new Point(1, 1);
        String status;

        gs.moveCount = 2;
        gs.currentPosition = point;  
        gs.characterName = "Cesar";

        assertEquals(2, gs.moveCount);
        assertEquals(expectedPoint, gs.currentPosition);
        assertEquals("Cesar", gs.characterName);

        status = gs.toString(gs.characterName, gs.currentPosition, gs.moveCount);
        System.out.println(status);
        
        assertEquals("Cesar is on poisition 1,1 and has a move count of 2", status);
    }
}
