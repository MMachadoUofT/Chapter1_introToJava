/* *************** *\
*    1.7 ALIASES    *
\* *************** */

public class Aliases {
    public static void main(String[] args) {
        // Knowing whether a variable is primitive or a reference is crucial to writing functional code.

        // Take the following code, for example:
        String name = new String("Mah nama Jeff");
        String heheFunny = name;
        // Because these are REFERENCE types, the variables both hold references to the SAME object in memory.
        // That is, these variables are "aliases." This is the same as in Python.

        // Primitives, not being stored in the object space and instead being held directly by a variable, cannot
        //  be aliased. Every primitive is its own thing.
        int i = 235;
        int j = i;
        // These hold two distinct integer values.
        // This does not exist in Python, as Python does not use primitive types.

        // This is especially important with mutable reference types; if we had our own class with methods that change
        //  aspects of the instance (that is, instance methods), and two variables held the same reference to said
        //  instance, we may unwittingly change the *other* variable's values (or rather, the values pointed to by the
        //  reference held therein)

        // Remember, this only applies to mutable objects; immutables like Strings only have methods that *return*
        //  other, separate strings, so the original is unchanged. A new String is simply made in the object space.

        // Let's make copies to be sure.
        String[] words = new String[]{"Gee willikers", "Golly", "Sweet cinnamon"};
        String[] copy1 = words; // These have been aliased. Changing <copy1> will change <words>.
        String[] copy2 = new String[words.length]; // THIS is a new String array with the same length as <words>
        // We can now copy each individual value into the new one.
        for (int k = 0; k < words.length; k++) {
            copy2[k] = words[k];
        }

        // However, there is a simpler way to do this:
        String[] copy3 = new String[words.length];
        System.arraycopy(words, 0, copy3, 0, words.length);

        // This is what's known as a "shallow" copy, as while the array object references are now different, the
        // references to the internal strings aren't. This would be a "deep" copy.

        // It's also crucial to understand that, if we pass in a mutable object reference as an argument,
        //  changing said parameter will cause the original to change as well; if other reference variables hold
        //  a reference to this object, their values will be changed, too.

    }
}
