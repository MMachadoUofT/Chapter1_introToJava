/* *************** *\
*    1.7 ALIASES    *
\* *************** */

public class ControlStructures {
    public static void main(String[] args) {
        // Whereas in Python we use indentation to mark when the beginning of statemments takes place, we use brackets
        //  in Java. Take a look at this if/else statement:
        int classSize = 124;
        int sections = 1;
        if (classSize > 100) {
            sections = 2;
            classSize = classSize / 2;
        }
        // See those brackets, baby?
        // Turns out, if you've only got one line within your "if" block, you don't need 'em.
        if (classSize > 500)
            System.out.println("Wow, that's big!");
        // Now check out these else-ifs:
        int grade = 86;
        char letterGrade;
        if (grade > 80) {
            letterGrade = 'A';
        } else if (grade > 70) {
            letterGrade = 'B';
        } else if (grade > 60) {
            letterGrade = 'C';
        } else if (grade > 50) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        // You can nest 'em, too. Not gonna show that though.

        // What about for loops? Well, they're pretty explicit:
        /*
        for (initialization; termination; increment) {
            loop body
        }
         */
        // The first part creates a variable used to count iterations, the second part states what the variable
        //  needs to be at in order for the loop to run, and the third part describes how much the variable increments
        //  each time.
        // The first part is only run *once*.
        int n = 15;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of the first " + n + "numbers is " + sum);
        // This counts <i> from 1 to n, inclusive, as our termination condition is when i<=n is *false*, i.e. i > n
        // We usually want to put the variable declraation within the initialization, as this will eliminate the
        //  variable once the for loop's done from the stack frame
        // Check it:
        int[] powers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        for (int i = 0; i < powers.length; i++) {
            System.out.println(powers[i]);
        }
        // 0 to length - 1, baby. All valid.

        // That version of a for loop is cringe, though. Check out this ENHANCED for-loop:
        int[] powahs = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        for (int powah : powahs) {
            System.out.println(powah);
        }
        // This reads like "For int <powah> in the array <powahs>," just like in Python! YAAAAAAYYYYYYY!!!!!!

        // We also have some shorthands:
        int lilGuy = 35;
        lilGuy++; // lilGuy = lilGuy + 1
        lilGuy += 5; // lilGuy = lilGuy + 5
        lilGuy -= 3; // you get the idea
        // We'll really only use these for loops and such.

        // Let's do a WHILE LOOOOOOOOOOOOOOOP!!!!!!!!!!!!!!!!!!!!!!!1!!11!!11!!!!1!
        int number = 37;
        int divisor = 7;
        while (number > divisor) {
            number = number - divisor;
        }
        System.out.println("Leftover: " + number);
        // Pretty straightforward here. Pretty much the same as python except we do some funny bracket business
        // We also have a do-while, which tests the condition AFTER the code block is run:
        /*
        do {
            whatever you want big boi
        } while (condition);
         */
        // We can also use a single-line while loop utilizing incrementation, which is particularly good for arrays
        int[] A = {2, 4, 6, 8, 10, 12};
        int i = 0;
        while (A[i++] < 7);
        // Why would we ever need to use this? wHo kNoWs
    }
}
