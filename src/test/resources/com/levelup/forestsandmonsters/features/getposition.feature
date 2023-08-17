Feature: Get Character Position 
    
    I want to get my Character's Position. 

    Scenario Outline: Get Position
       Given <name> is present on the GameMap 
        And the player wants to know the position
        Then Character is found at this position 
        Examples:
        | name |
        | CGRyan |