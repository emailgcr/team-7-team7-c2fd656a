Feature: Utilising GameMap
Scenario Outline: Check if a postion is valid
Given a game is started
When a postion is checked for validity
Then the postion <x>,<y> is <valid> that the position is valid

Examples:
    | x | y | valid |
    | 0 | 0 | true |
    | 9 | 9 | true |
    | 10 | 0 | false |
    | 0 | 10 | false |
    | 10 | 10 | false |