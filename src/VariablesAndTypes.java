//
//  1.2 VARIABLES AND TYPES
//

/* ************************************** *\
*    1.2.1 Flexible Python vs Strict Java  *
\* ************************************** */
public class VariablesAndTypes {
    // In Python, we are able to instantly create a variable, and instantly assign it - and reassign it - whatever value
    // we want. Type contracts are *implicit.* Java is different; we must include types as a part of the code itself.

    /* *********************** *\
    *   1.2.2 Declaring Types   *
    \* *********************** */

    // With Python, we don't really know the type of variable. Rather, variables, do not have types. Java variables do
    int integer;
    // Here, we've declared a variable called <integer>, whose type is int. Space has now been reserved in memory for
    // this variable. That is, we can declare a variable *without* assigning it a value, unlike in Python.

    /* ********************************** *\
    *   1.2.3 Declaration and Assignment   *
    \* ********************************** */
    // Included: 1.2.4, keeping track of variables.

    // That isn't to say we can't *also* do that in Java. It's as simple as:
    int i = 42;
    // In fact, all variables always have a value. When we declare, but don't initialize, they hold their *default*
    // value, such as 0 for an int, or null for an object (the equivalent to None in Python)

    // Variables have four things associated with them:
    // - The name, provided at declaration
    // - The type, provided at declaration
    // - The memory space used to hold it
    // - The value, provided at assignment
    // Only the last option is up to us to change.

}

/* ************************* *\
*   EXLCLUDED: 1.2.5 Errors   *
\* ************************* */
// Just assign variables the right types, and don't redeclare them.
