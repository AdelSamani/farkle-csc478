# Proposed Project Summary #

For the semester project, team 1 proposes to develop a version of the popular dice game Farkle. Our proposed version will be a standalone application utilizing a graphic user interface. The first iteration of development will yield a one player version of the game, and two player support will be added in a second iteration with the second player being a live person using the same computer as the first player. If time permits, a third iteration will yield a two player version that can be played against a computer opponent with probability determining the play of the computer opponent.

# Traditional Rules of Farkle #

Farkle is a game typically played with six dice and more than one player. The traditional rules dictate that each player takes turns rolling the dice in succession, with each turn producing a score. The score produced from the players current turn is added to that players previous score accumulation. The goal is to be the first player to reach 10,000 points. The scoring is generated as follows:

  1. At the beginning of the turn, the player rolls all 6 dice.
  1. Scoring for each roll is as follows: Each 1 = 100 points, each 5 = 50 points, (3)   1s = 1000 points, (3) 2s = 200 points, (3) 3s = 300 points, (3) 4s = 400 points, (3) 5s = 500 points, and (3) 6s = 600 points, a straight = 1500 points, and more than three of a kind doubles the value for each additional match (e.g. (5) 3s = 300 x 2 x 2 = 1200 points).
  1. Dice resulting in a score are chosen and removed by the player (the player must pick up at least one scoring die, but does not need to pick up all scoring die), and the player decides if they want to roll with the remaining dice or pass to the next player.
  1. At least one die must be set aside after each roll.
  1. A “farkle” occurs when a roll results in no points. All points accrued during that turn are forfeit, and play is passed to the next player.
  1. If the player has scored all six dice, he or she can roll again with all six dice.
  1. Once a player has reached the winning point total, each successive player has one last chance to score enough points to surpass the leader.

# Proposed Changes to the Traditional Rules for this Version of the Game #

Traditionally, Farkle is a multiplayer game with the first player to a given point total being named the winner of the game. The primary play for our proposed version will center on a single player. Two player options will be available in the final release, but we anticipate most players will opt for single player gameplay making it the primary focus of this application. To differentiate single player play from multiplayer, the single player version will limit the number of turns given to the player to ten with the primary goal being to maximize the total points for each game. In a sense, the player will be playing against himself or herself trying to beat a previous high score.

# Programming Language #

The application will be written in Java using JDK version 7.

# Platform and Software Requirements #

The application will be developed and tested on the Microsoft Windows 7 platform with the Java Runtime Environment 1.7+ installed.