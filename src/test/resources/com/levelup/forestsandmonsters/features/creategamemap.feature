Feature:

Scenario: Create Game Map without positions
Given a game is started
When the game map is created
Then the game map is not empty

Scenario: Check if Game Map has positions
Given a game is started
When the game map is created  
Then the game map is not empty
And the game map has 100 positions
 