import java.util.Random; // lets us make random numbers

public class DieRoller
{
    public static void main(String[] args)
    {
        //random num generator
        Random rand = new Random();

        int rollCount = 0;      //counts how many times we rolled
        int die1 = 0;           //value of the first die
        int die2 = 0;           //value of the second die
        int die3 = 0;           //value of the third die
        int sum = 0;            //sum of all 3 die

        //header row: %-6s means "text, 6 spaces wide, lined up on the left"
        System.out.printf("%-6s %-6s %-6s %-6s %-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("--------------------------------");

        //keep rolling until all 3 dice are the same
        do
        {
            rollCount++;        //add 1 to the roll count

            //nextInt(6) gives 0 to 5, so adding 1 makes it 1 to 6
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;

            sum = die1 + die2 + die3;


            // %-6d means "whole num, 6 spaces wide, lined up on the left"
            System.out.printf("%-6d %-6d %-6d %-6d %-6d%n", rollCount, die1, die2, die3, sum);


        }
        while (!(die1 == die2 && die2 == die3));    //stop when all 3 match

        System.out.println("You rolled a triple in " + rollCount + " rolls!");

    }
}
