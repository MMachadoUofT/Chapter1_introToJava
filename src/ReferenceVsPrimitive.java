/* ******************************************* *\
*    1.3 REFERENCE TYPES AND PRIMITIVE TYPES    *
\* ******************************************* */

public class ReferenceVsPrimitive {
    // Java has plenty of types
    int age = 21;
    String name = "Hugh Mungous";
    boolean funnyGuy = false;
    double gpa = 1.78;

    // There are other types like this, meant to gain precision or save memory, but these will work for now.

    // In Python, everything is an object; no variable simply holds a value, like a 1 or a True, rather they hold
    // references to said values in memory
    // Java, however, has two types: reference types, and primitive types. Strings, for example, are reference types,
    // and are "held" by a variable through a pointer, just like in Python. Primitive types, however, like ints
    // (anything that starts with a LOWERCASE) are held *directly* in the variable

    public static void main(String[] args) {
        int num = 42;
        String who = "Yo mama";
        System.out.println("How we feelin");

        // main() is held in the CALL STACK, which itself holds variables <num> and <who> (before the sout statement)
        // Then, we hold the string "Yo mama" in the OBJECT SPACE. So far, this is identical to Python memory models.
        // <num>, however, does *not* hold a pointer, like <who>. It actually holds the value 42.
        // There is also a place in memory called the STATIC SPACE. More on this, and static members of a class, later.

        // Differences between primitives and references will come up later.
    }
}
