# Yahtzee
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

We are going to build an application that allows us to roll 5 dice. We are going to visualize the dice by drawing them on the canvas.
In the last part of the assignment you are going to determine which combination was thrown. Look for the combinations of Yahtzee [here.](https://nl.wikipedia.org/wiki/Yahtzee)

#### Implementation
We need two classes for this assignment: a class Yahtzee and a class Dice.
Create a class Dice with a `roll()` method that returns a random number from 1-6.
Next, create a Yahtzee class that creates 5 dice.
Implement the `roll()` method that returns an integer array containing the results of the 5 rolls. 

#### Visualization
In the folder `images` you will find images of all possible faces of a dice. Create a `draw(int x, int y, int width)` method in the Dice class that is able to draw the dice on a specific location. Make use of the images in the `images` folder.

Afterwards, create a `draw()` method in the Yahtzee class that draws all dices on the screen. 

#### Determine Combination ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)
This is a very tricky exercise. Start by doing the most simple of cases and work towards the more complex ones.
Implement the `determineCombination(Dice[] dices)` method that returns a String indicating the highest possible combination.

Hints:
- Create an integer array that stores the outcomes of all dice (int[]) and sort this array.
- Use a [frequency table](https://www.mathsteacher.com.au/year8/ch17_stat/03_freq/freq.htm) and sort it by frequency.

## Relevant Links
* [Java documentation of the SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)