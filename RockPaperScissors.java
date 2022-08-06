/*
 Write a class RockPaperScissors that has:

-an enum definition with possible constants ROCK, PAPER, or SCISSORS;
this definition should be a nested class and defined as public in the class.
-a single instance field called value that holds an enum of one of ROCK, PAPER,
 or SCISSORS.
-a no-argument constructor: the constructor sets the value field to ROCK for the
first object, PAPER for the next, SCISSORS for the next, ROCK for the next, etc.
(Hint: use class data to remember where we are in the sequence.)
-a getter method called getValue (returns the value of the field)

*/

public class RockPaperScissors {

    // enum definition
    public enum Play {
        ROCK,
        PAPER,
        SCISSORS
    }

    private Play value; // Single-instance field. Not sure if this is correct.

    // Constructor
    public RockPaperScissors(Play aValue)
    {
        value = aValue;
        // How to set value fields for first, second, and third objects?

    }

    // Getter method
    public Play getValue()
    {
        return value;
    }



}
