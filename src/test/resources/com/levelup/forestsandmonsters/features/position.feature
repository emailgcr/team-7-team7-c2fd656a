Feature: Position
    
   I want the position coordinates. 

    Scenario Outline: Current Coordinates
        Given Current coordinates {Point} 
        Then Current coordinates {Point}
        Examples:
        | X | Y | Point |

        | 0 | 0 | 0,0 |
        | 0 | 1 | 0,1 |
        | 0 | 2 | 0,2 |
        | 0 | 3 | 0,3 |
        | 0 | 4 | 0,4 |
        | 1 | 0 | 1,0 |
        | 1 | 1 | 1,1 |
        | 1 | 2 | 1,2 |
        | 1 | 3 | 1,3 |
        | 1 | 4 | 1,4 |
        

