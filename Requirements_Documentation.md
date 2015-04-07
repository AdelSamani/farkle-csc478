# Requirements Documentation #

## 1.	Introduction ##

### 1.1.	Scope of the Product ###
<u>Proposed Project Summary</u>

For the semester project, team 1 proposes to develop a version of the popular dice game Farkle.  Our proposed version will be a standalone application utilizing a graphic user interface. The first iteration of development will yield a one player version of the game, and two player support will be added in a second iteration with the second player being a live person using the same computer as the first player.  If time permits, a third iteration will yield a two player version that can be played against a computer opponent with probability determining the play of the computer opponent.

<u>Traditional Rules of Farkle</u>

Farkle is a game typically played with six dice and more than one player. The traditional rules dictate that each player takes turns rolling the dice in succession, with each turn producing a score. The score produced from the players current turn is added to that players previous score accumulation. The goal is to be the first player to reach 10,000 points. The scoring is generated as follows:

  1. At the beginning of the turn, the player rolls all 6 dice.
  1. Scoring for each roll is as follows: Each 1 = 100 points, each 5 = 50 points, (3) 1s = 1000 points, (3) 2s = 200 points, (3) 3s = 300 points, (3) 4s = 400 points, (3) 5s = 500 points, (3) 6s = 600 points, a straight = 1500 points, and more than three of a kind doubles the value for each additional match (e.g. (5) 3s = 300 x 2 x 2 = 1200 points).
  1. Dice resulting in a score are chosen and removed by the player (the player must pick up at least one scoring die, but does not need to pick up all scoring die), and the player decides if they want to roll with the remaining dice or pass to the next player.
  1. At least one die must be set aside after each roll.
  1. A “farkle” occurs when a roll results in no points. All points accrued during that turn are forfeit, and play is passed to the next player.
  1. If the player has scored all six dice, he or she can roll again with all six dice.
  1. Once a player has reached the winning point total, each successive player has one last chance to score enough points to surpass the leader.

<u>Proposed Changes to the Traditional Rules for this Version of the Game</u>

Traditionally, Farkle is a multiplayer game with the first player to a given point total being named the winner of the game. The primary play for our proposed version will center on a single player.  Two player options will be available in the final release, but we anticipate most players will opt for single player gameplay making it the primary focus of this application.  To differentiate single player play from multiplayer, the single player version will limit the number of turns given to the player to ten with the primary goal being to maximize the total points for each game.  In a sense, the player will be playing against himself or herself trying to beat a previous high score.

<u>Programming Language</u>

The application will be written in Java using JDK version 7.

<u>Platform and Software Requirements</u>

The application will be developed and tested on the Microsoft Windows 7 platform with the Java Runtime Environment 1.7+ installed.

### 1.2.	Definitions, Acronyms, and Abbreviations ###

JRE – Java Runtime Environment version 7 or newer

### 1.3.	References ###

To be completed at the end of the project

## 2.	General Description ##

### 2.1.	Product Perspective ###

The software is being built to allow the end user to play the popular dice game, Farkle, even if that user does not have a set of dice, or another player to play against. This software will simplify playing this game, and speed up overall gameplay. Without the need for actual dice, and with the addition of automatic scoring, this version of the game can be played multiple times in the time it takes to play one game in the traditional manner.

### 2.2.	Product Functions ###

This game will allow the end user to play Farkle in multiple modes. The user can elect to play a single player version of the game that departs from the traditional rules by limiting the number of turns that player can take to a total of ten. The goal of this single player mode is to accumulate as many points as possible within the limited number of turns, trying to beat previous high scores. The user can also elect to play a two player version of the game that follows the traditional rules of Farkle, by proclaiming the winner to be the first to 10,000 points. This two player mode can be played against another user, or against the computer.

### 2.3.	User Characteristics ###

The anticipated end user is a basic user of the Windows operating system. The user is installing and using this application to take a break from his or her normal activities.  This application will provide a few minutes of mindless enjoyment, or a means of procrastination, for the typical university student or professional employee.  The application must be easy to install with limited requirements to properly serve this anticipated user.

### 2.4.	General Constraints ###

As a standalone application, this software does not have many constraints. It is not designed for, nor does it work over, a network connection. Multiplayer mode is limited to two players, and if the user elects to play against another live user, both players must take turns at the same computer.

### 2.5.	Assumptions and Dependencies ###

This software requires that the end user has the Java Runtime Environment (JRE) version 7 or newer installed. Though it may run on other operating systems with JRE installed, it was developed and optimized for Windows 7.

## 3.	Specific Requirements ##

### <u>1.0.0	Graphic User Interface</u> ###

1.1.0	Upon opening the application, the user is greeted with a screen that has two options, 1 player mode or 2 player mode. Note: for the initial increment that incorporates one player, this screen should just have a single button asking if the player would like to start a new game.

1.2.0	If the user selects two player mode, the user is asked if player 2 is a live player or a computer player.

1.3.0	<u>Items common to the user interface for both modes</u>

  * 1.3.1.	The center of the screen shall display the six dice used during gameplay. These dice shall display nothing until the user presses the roll button for the first time.
  * 1.3.2.	The current accumulated turn point total shall be displayed.
  * 1.3.3.	Rules for the scoring combinations shall be displayed on the right side of the screen.
  * 1.3.4.	A “Roll” button shall be displayed.
  * 1.3.5.	A “Bank” button shall be displayed (and shall initially be disabled).
  * 1.3.6.	After each roll, dice that are selected, scored, and locked shall be highlighted, and the selected point total shall be displayed above the dice.
  * 1.3.7.	If any roll results in 0 points, the word “Farkle!!!” is displayed above the dice until the next player rolls (in 2 player mode) or the first roll of the next turn is taken (in 1 player mode).

1.4.0	<u>1 player graphic user interface</u>

  * 1.4.1.	The title of the window shall display: “Farkle – Single Player Mode”.
  * 1.4.2.	The overall point total shall be displayed.
  * 1.4.3.	The left side of the screen shall have an area to display the point total for each of the ten turns taken in single player mode.
  * 1.4.4.	The current turn shall be indicated by highlighting that turn on the left side of the screen.
  * 1.4.5.	The current highest achieved score shall be displayed. This score shall initially be set to 5000 points.

1.5.0	<u>2 player mode user interface.</u>

  * 1.5.1.	The title of the window shall display, “Farkle – Two Player Mode”.
  * 1.5.2.	The left side of the screen shall have an area to display the overall accumulated point total for each player.
  * 1.5.3.	The player whose turn it is shall be indicated by highlighting that player and his current point total on the left side of the screen.
  * 1.5.4.	The first player to meet the minimum total point threshold required to win the game (equal to 10,000 points) shall be highlighted in a different color to indicate each subsequent player has one more turn to try and beat that player’s score.

1.6.0	At the conclusion of the game, the user shall be greeted with three options: “Play again?”, “Main Menu”, and “Quit”.

### <u>2.0.0	Game Modes</u> ###

2.1.0	When 1 player mode is selected, the 1 player mode graphic user interface is displayed with blank dice, the bank button disabled, and turn number one highlighted. The user will have ten turns to try and get as many points as possible.

  * 2.1.1.	Each turn is taken according to the requirements of section 4.0.0.
  * 2.1.2.	The game ends at the conclusion of the tenth turn, and the player’s score is compared to the current high score.
  * 2.1.3.	 If the player’s score is greater than the current high score, a congratulatory message is displayed, and the player’s score replaces the previous high score.
  * 2.1.4.	The player is given three options: “Play again?”, “Main Menu”, and “Quit”.
  * 2.1.5.	If “Play again?” is selected, the game starts over in 1 player mode.
  * 2.1.6.	If “Main Menu” is selected, the user is taken to the mode selection screen.
  * 2.1.7.	If “Quit” is selected, the application immediately closes.

2.2.0	When 2 player mode against a live person is selected, the 2 player mode user interface is displayed with blank dice, the bank button disabled, and player one highlighted indicating it is his turn.

  * 2.2.1.	Each turn is taken according to the requirements of section 4.0.0. The current player for each turn is highlighted during that player’s turn.
  * 2.2.2.	The first player to surpass 10,000 total points at the end of a given turn is highlighted in a different color.
  * 2.2.3.	The other player has one more turn to try and surpass the point total of the first player to surpass 10,000 points.
  * 2.2.4.	A congratulatory message to the winner is displayed, and three options are given: “Play again?”, “Main Menu”, and “Quit”.
  * 2.2.5.	If “Play again?” is selected, the game starts over in 2 player mode against a live person.
  * 2.2.6.	If “Main Menu” is selected, the user is taken to the mode selection screen.
  * 2.2.7.	If “Quit” is selected, the application immediately closes.

2.3.0	When 2 player mode against the computer is selected, the 2 player mode user interface is displayed with blank dice, the bank button disabled, and player one highlighted indicating it is his turn.

  * 2.3.1.	Each turn is taken according to the requirements of section 4.0.0. The current player for each turn is highlighted during that players turn.
  * 2.3.2.	Decisions made during the computer player’s turn are chosen in accordance with requirements section 5.0.0.
  * 2.3.3.	The first player to surpass 10,000 total points at the end of a given turn is highlighted in a different color.
  * 2.3.4.	The other player has one more turn to try and surpass the point total of the first player to surpass 10,000 points.
  * 2.3.5.	A “You Win!!” or “You Lose…” message is displayed depending on if the live player won or lost the game, and three options are given: “Play again?”, “Main Menu”, and “Quit”.
  * 2.3.6.	If “Play again?” is selected, the game starts over in 2 player mode against the computer.
  * 2.3.7.	If “Main Menu” is selected, the user is taken to the mode selection screen.
  * 2.3.8.	If “Quit” is selected, the application immediately closes.

### <u>3.0.0	Dice</u> ###

3.1.0	Farkle is played with six standard 6 sided dice with each side numbered from 1 through 6 (inclusive).

3.2.0	Each die that is rolled shall be assigned a random value from 1 to 6 (inclusive) at the conclusion of the roll.

### <u>4.0.0	Player’s Turn</u> ###

4.1.0	At the beginning of the turn the turn point total is set to 0, the player selects the roll button, and all 6 dice are rolled in accordance with the requirement 3.2.0.

4.2.0	The resulting roll is analyzed according to requirement 6.0.0 to determine if the player farkled. A farkle occurs if the roll results in 0 points.

4.3.0	If the player did not farkle, he must select at least one scoring die. The score for the selected dice is calculated according to requirement 5.0.0, and is updated after each die selection. Only scoring die can be selected.

4.4.0	When all of the selected dice contribute to the point total for the roll, the roll button is enabled and the roll point total is added to the running point total for the current turn.

4.5.0	If the current turn point total is greater than or equal to 300, the bank button is enabled.

4.6.0	If the player elects to roll again, the remaining dice are rolled and the process returns to requirement 4.2.0.

4.7.0	If all six dice have been selected, and they all contribute to the turns point total, the player is issued a bonus roll. All selected dice are deselected, and the process returns to requirement 4.1.0.

4.8.0	If the player selects the bank button, the current turn point total is added to the player’s game point total, and the turn is over.

4.9.0	If the player farkles on any roll during the current turn, that player loses all points accumulated during the current turn and the turn is over.

4.10.0	When the turn is over all dice are deselected, the roll button is enabled, the bank button is disabled, the current turn point total is set to 0, the current roll point total is set to 0, and play passes to the next player (two player mode) or the next turn (single player mode).

### <u>5.0.0	Computer player</u> ###

5.1.0	The computer player takes its turn in accordance with requirement 4.0.0, and the dice selection and the decision to continue rolling the dice are made in accordance with the following requirements.

5.2.0	After each roll, the computer player always selects all scoring dice.

5.3.0	If the current turn point total is less than 300, the computer always rolls again.

5.4.0	If the accumulated score for the current turn is greater than or equal to 300, the computer uses the following criteria to determine if it rolls again:

  * 5.4.1.	If there are six available dice to roll (such is the case when a bonus roll is awarded), the computer rolls again 100% of the time.
  * 5.4.2.	If there are five dice available, the computer rolls again 90% of the time.
  * 5.4.3.	If there are four dice available, the computer rolls again 50% of the time.
  * 5.4.4.	If there are three dice available, the computer rolls again 30% of the time.
  * 5.4.5.	If there are two dice available, the computer rolls again 20% of the time.
  * 5.4.6.	If there is one dice available, the computer rolls again 10% of the time.

### <u>6.0.0	Scoring</u> ###

6.1.0	Each 1 rolled is worth 100 points

6.2.0	Each 5 rolled is worth 50 points

6.3.0	Three 1’s are worth 1000 points

6.4.0	Three of a kind of any value other than 1 is worth 100 times the value of the die (e.g. three 4’s is worth 400 points).

6.5.0	Four, five, or six of a kind is scored by doubling the three of a kind value for every additional matching die (e.g. five 3’s would be scored as 300 X 2 X 2 = 1200.

6.6.0	Three doubles (e.g. 1-1-2-2-3-3) is worth 750 points.

6.7.0	A straight (e.g. 1-2-3-4-5-6), which can only be achieved when all 6 dice are rolled, is worth 1500 points.