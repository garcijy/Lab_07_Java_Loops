public class PartAB
{
    public static void main(String[] args)
    {
        //task 1: count up to 30 by 1s
        System.out.print("Task 1: ");
        for (int i = 0; i <= 30; i++)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n\n");


        //task 2: count down from 30 by 1s
        System.out.print("Task 2: ");
        for (int i = 30; i >= 0; i--)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n\n");


        //task 3: count up to 18 by 3s
        System.out.print("Task 3: ");
        for (int i = 0; i <= 18; i += 3)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n\n");


        //task 4: count down to 10 by 2s
        System.out.print("Task 4: ");
        for (int i = 10; i >= 0; i -= 2)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n\n");

        //task 5: 5 by 5 square
        System.out.println("Task 5: ");
        for (int row = 1; row <= 5; row++)      //5 rows
        {
            for (int col = 1; col <= 5; col++)  //5 stars per row
            {
                System.out.print("* ");
            }
            System.out.print("\n");       //go to next row
        }
        System.out.print("\n");

        //task 6: right triangle
        System.out.println("Task 6: ");
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");



        //task 7: upside down triangle
        System.out.println("Task 7: ");
        for (int row = 5; row >= 1; row--)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}