# java-fundamentals

## Basics 
### Pluralize
A method that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // Output 
    I own 1 dog.
    I own 2 cats.
    I own 0 turtles.

### Flipping Coins
A method that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. 

                        tails
                        tails
    flipNHeads(1)   =>  tails
                        heads
                        It took 4 flips to flip 1 head in a row.

### Command Line Clock
A method uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE.The program  detect when the seconds increase and only print something out when the timestamp changes.then we will show how fast the program is processing itself between time updates.The speed in hertz, kilohertz, megahertz, or gigahertz (Hz, kHz, MHz, GHz). A hertz is defined as “one cycle per second.” A computer that executes one operation per second is a 1 Hz computer.

    11:43:57 4.774371 MHz
    11:43:58 4.747498 MHz
    11:43:59 4.796893 MHz
    11:44:00 3.900095 MHz
    11:44:01 4.513468 MHz
    11:44:02 4.462237 MHz
    11:44:03 4.536814 MHz
    11:44:04 4.791471 MHz

## Basic Library

### Rolling Dice
A method that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

    roll(4) => [3, 2, 1, 5]

### Contains Duplicates
A method that returns true or false depending on whether the array contains duplicate values.

    [3, 2, 1, 5]    => false
    [3, 2, 1, 1, 5] => true

### Calculating Averages
A method that accepts an array of integers and calculates and returns the average of all the values in the array.

    [1,2,3,4,5] => 3

### Arrays of Arrays
A method that accepts an two diminition array then calculate the average value for each array and return the array with the lowest average.

### Tallying Election
A method that accepts a List of Strings representing votes and returns one string to show what got the most votes.

### Analyzing Weather Data
A method that accepts an two diminition array as parmeter for hole month divided into week then find the min and max values Using a HashSet of type Integer then iterate from the min temp to the max temp and create a String containing any temperature not seen during the month.

## Linter
### File I/O

A method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.