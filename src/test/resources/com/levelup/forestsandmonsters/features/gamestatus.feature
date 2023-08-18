Feature: Get Character Status 
    
    I want to get my Character's Status. 

    Scenario Outline: Get Status

        Given Character Name <name> 
        And Current X Position <x> and Y Position <y>
        And Move Count <MoveCount>
        Then Validate Character Status <ExpectedName> <XExpected> <YExpected> <ExpectedMoveCount>
        Examples: 
        | name | x | y | MoveCount | ExpectedName | XExpected | YExpected | ExpectedMoveCount |
        | Cesar | 1 | 1 | 2 | Cesar | 1 | 1 | 2 |
    