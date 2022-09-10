/*
 Author: Marcial Machado

 Description:
 These are the "notes," or rather, annotated programs, that I will be developing while I read through the first chapter
 of the Java course notes for CSC207.

 I will be publishing these notes to GitHub as a way to also practice my GitHub skills.
*/

//
// 1.1 A FIRST LOOK AT JAVA
//

/* ************************** *\
*    1.1.1 DEFINING CLASSES    *
\* ************************** */
public class FirstLook {
    // All code *must* be a part of a class in Java

    // In Java, everything is organized in classes. Whatever we want our code to do, it must be done within classes.
    // Thus, if we want *runnable* code, we must include a main() method. We will use the example of wanting to print
    // the result of an algebraic calculation.

    /* ************************** *\
    *    1.1.2 DEFINING METHODS    *
    \* ************************** */
    public static void main(String[] args) {
        // INTELLIJ: typing 'psvm' will auto-complete to the above public main() method.

        // Unlike Python where we can just run a module (file), or just a single line, executing a file in Java executes
        // a specific *class.*

        // This is analogous to the following line and subsequent code block at the end of a Python module:
        // if __name__ == '__main__':

        /* ************************* *\
        *    1.1.3 PRINTING THINGS    *
        \* ************************* */
        System.out.println(13 * 5); // INTELLIJ: We can use 'sout' here to complete this line.
        // In Java, we must use semicolons to indicate the end of a line of code. Whitespace is purely for legibility.


    }
}
