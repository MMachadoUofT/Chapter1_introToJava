/* **************** *\
*    1.4 STRINGS    *
\* **************** */

public class Strings {
    public static void main(String[] args) {
        // String is a class included in Java, and is a simple sequence of characters:
        String s1 = new String("Hello");
        // What we've just seen is how to insantiate a String object, or any object for that matter.
        // Furthermore, unlike in Python, double-quotes are ALWAYS strings, and single-quotes are ALWAYS characters.
        // However, for Strings, specifically, we can use this (familiar) shortcut:
        String s2 = "Bye"; // Again, this is a REFERENCE type. not a primitive type. Don't get it twisted, son.

        // Strings in Java, just as in Python, are immutable. Any operations performed on them, at most, returns a *new*
        // String.

        // Take a look at some String methods:
        String s3 = s1 + s2; // Pretty straightforward concatenation
        char ch = s1.charAt(2); // Indexing, this returns the character at index 2 (i.e. s1[2] in Python)
        s1 = s1.substring(2, 4); // Splicing for real. The same as s1 = s1[2:4] in Python.
        s1 = "     Gadzooks! Lookit all that whitespace      ";
        s1 = s1.trim(); // Same as s1 = s1.strip()
        int length = s1.length();
        int takeTheL = s1.indexOf("L");

        // We also have ANOTHER class, StringBuilder, but this one is mutable. Watch:
        StringBuilder sb = new StringBuilder("York"); // sb is "York
        sb.append(" City, baby!"); // sb is "York City, baby!"
        sb.insert(4, " New"); // sb is "York New City, baby!"
        sb.setCharAt(0, 'P'); // sb is "Pork New City, baby!"
        sb.reverse(); // sb is "!ybab ,ytiC weN kroP"
        // Importantly, we *cannot* do a simple [StringBuilder sb = "York"] statement; these are incompatible types.
        // The String cannot be converted into a StringBuilder.

        // Then we have chars, which are primitives. Note that the StringBuilder method <setCharAt()> takes this
        // primitive type as its argument.

        // Obviously, we can survive without StringBuilders, but if we see ourselves changing a String variable's value
        // a lot, it might be useful to change directions. Compare:
        String a = "Joshua";
        String b = "Giraffe";
        a = a + b;
        // ...with...
        StringBuilder c = new StringBuilder("Baby");
        StringBuilder d = new StringBuilder("Beluga");
        c.append(d);
        // Understand, creating a brand-new object and putting it into the object space is far more computationally
        // expensive than simply mutating an existing one. This especially useful in LOOPS, where the same computation
        // will be run many times.

    }
}
