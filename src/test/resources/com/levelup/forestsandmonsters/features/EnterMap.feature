Feature: Get Character Position 
    
    I want my character to enter the map. 

    Scenario Outline: Get the Map
       Given <name> is created
        And the map is available
        Then Character enters the map 
        Examples:
        | name |
        | CGRyan |