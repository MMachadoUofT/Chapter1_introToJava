/* ****************** *\
*    1.9 PARAMETERS    *
\* ****************** */

public class Parameters {
    // Alright, we kind of already know parameters.
    public static void messAbout(int n, String s) {
        // Contents of the method omitted.
    }

    public static void main (String[] args) {
        int count = 13;
        String word = new String("nonsense");
        messAbout(count, word);
    }
    // <n> and <s> are "parameters." <count> and <word> are passed in as "arguments."
    // When we call a method, a new stack frame is pushed onto the stack, the paramaters are defined, and the value
    //  contained within each argument is assigned to its parameter (be it a primitive or a reference)
    // After a method returns, explicitly or implicitly, the stack frame is popped, and all local variables disappear

    // If we pass a primitive, changing the parameter's value of that primitive won't really do anything. Local and all,
    //  remember? If we return a result, however, then maybe we've got something.
    // It's *kinda* like in Python, except there's no creation of an object. Just a reassignment and then a
    //  disappearance.

    // Now, when we pass a REFERENCE, we create an alias. If the object that is referred to is mutable, then we can
    //  run into some issues of mutation.

    // So yeah. That's it.
}
