Feature: Position
    
   I want the position coordinates. 

    Scenario Outline: Current Coordinates
        Given You have X coordinate <XCoord>
        And You have Y coordinate <YCoord>
        Then The user gets coordinates
        Examples:
        | XCoord | YCoord |
        | 0 | 0 |
        | 0 | 1 |
        | 0 | 2 |
        | 0 | 3 |
        | 0 | 4 |
        | 1 | 0 |
        | 1 | 1 |
        | 1 | 2 |
        | 1 | 3 |
        | 1 | 4 |
        

