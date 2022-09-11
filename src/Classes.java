/* *************** *\
*    1.5 CLASSES    *
\* *************** */

public class Classes {
    public static void main(String[] args) {
        // While we have yet to create classes, we now know how to instantiate them.
        // We do this by calling on the class' *constructor*.
        StringBuilder name = new StringBuilder("Why, hello.");
        // As you can see, there are more steps involved when creating an object in Java than in Python. If we had
        //  this class there, it would look like: name = StringBuilder("Why, hello.")
        // Basically, consider the keyworkd <new> to mean "We're making a *new* version of this." Otherwise, Java
        //  doesn't know how, exactly, you want to construct this class.
        // A constructor is very similar to the __init__() Python method. Difference is, we can build *multiple*
        //  constructors, and the compiler will know which one to use simply based on the arguments we pass.

        // For builtin Java classes, we can consult the Java documentation to know how to utilize said class.
        // Documentation, or APIs, specify how client code can interact with classes, methods, etc. It tells us what
        //  methods we can call, what arguments have to be sent, what values will be returned, etc.
        // APIs do *not* tell us *how* their classes are implemented, just what we can do with them.
        // It's kinda like a big list of helper methods

        // We call methods in the exact same way we'd do them in Python:
        String band = "Arcade Fire";
        int size = band.length();
        // Of course, the only difference is that len() doesn't really exist. We've gotta call 'em explicitly.

        // Sometimes, however, we have methods that don't deal with INSTANCES of a class, but the class in its entirety.
        // Consider this like a class "Toolbox," that always has the method useHammer(). You can pass in what the hammer
        // is used *on*, but not how the hammer behaves. length(), on the other hand, will return something based on the
        // very properties of the String instance it is called through.
        double x = Math.cos(48);
        // These are called class methods, or "static methods," as they use the keyword "static."
        // Strings also have static methods, such as:
        String placeholder = String.valueOf(12);

        // We access data members (attributes, instance variables) just like methods, minus the parentheses. Just
        //  like in Python.
        // Classes can also have class, or static, variables. Integers, for example, have the class variable BYTES,
        //  which reports the bytes in memory used to store the int value.
        Integer y = 156;
        System.out.println(y.BYTES);
        System.out.println(Integer.BYTES);
        // These print the exact same things. Also, look that we did not use "int," as this is a primitive type with no
        //  instance variables.

        // So, we've constructed an object, and thus have allocated memory for it. Can we de-allocate it?
        // Java does this for us; when no variable refers to an object in memory, it performs "garbage collection." Some
        //  languages, like C, have us do this explicitly.
        // Garbage collection occurs for, say, local variables after a method has been cleared from the call stack,
        //  or when class instances are no longer referenced for fields.(?)
    }
}
