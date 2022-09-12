/* ************** *\
*    1.6 ARRAYS    *
\* ************** */

public class Arrays {
    public static void main(String[] args) {
        // Arrays are like lists in Python, but better, I guess. They have fixed lengths, and the same types throughout

        // Let's declare an array:
        int[] numbers;
        // So, the type, and then the fact that it's an array. Neat. Said "int array numbers" is how we say that.

        // Arrays are reference types, not primitive types, so <numbers> just holds a *reference* to a sequence of ints.
        // Remember, we have yet to construct anything with <numbers>, we've just declared it. Kinda like:
        String house;
        house = new String("My home.");
        // See how we called the constructor *after* declaration?
        // For arrays, we essentially use the brackets we used earlier to pass in the argument of the *size* of the
        // array.
        numbers = new int[10];
        // Recall the use of "new," common in all instantiations of reference types.
        // Now, we've got an array object, with 10 spots, and each spot is currently holding an int with its default
        //  value (declared, not initialized, so they've got their defaults of 0 right now).
        // We can really assign the size of an array whatever we want, as long as it's at assignment.

        // Here's another way to construct an array, where we also initialize it, to boot:
        int[] numericals;
        numericals = new int[]{1, 2, 3, 4, 5, 6, 7};

        // We can also find the length of an array (and use it!)
        int[] anotherIntArray = new int[numbers.length];

        // We also access values in the array, just like in Python. Watch:
        numericals[2] = 69;

        // We cannot slice (List[1:3]) or negatively index (List[-2]) Arrays like we can Lists in Python.

        // So, we've got arrays, which are very restricted. However, we can also use ArrayLists, which are a little more
        // flexible. If you don't need this flexibility, arrays are very computationally efficient.

        // We can circumvent the type restriction by creating an object array, like so:
        Object[] list = new Object[5]; // An object array of length 5
        list[0] = new String("Whattup, cracka?!");
        // Now, how do we put a primitive, like an int, into this, if ints are not a subclass of Object? We use its
        //  wrapper, of course!
        list[1] = 124; // Apparently, new Integer(x) has been deprecated. Cool!
        list[2] = 123.5; // Same here. Very cool!
        list[3] = new int[12]; // Despite the bizarre syntax, an array is still an object! Super cool!
        // There's just one issue. Now, all Java knows is that the items in this array are OBJECTS, and can only
        //  be treated as such. So, if we wanted to make a String s that contained list's first item, which we know
        //  we can do, there will be an error;
        // String s = list[0];
        // We can *CAST* this to be String, which is to say, turn it from an Object into a String. Remember, at
        // initialization, we technically used the String constructor, so this does in fact refer to a String object;
        // it's just that, until we express that explicitly, Java doesn't know.
        String s = (String) list[0];
        // This will compile, but if we broke our promise (lied to the compiler), we would get a runtime error.
        // For example, this:
        String s1 = (String) list[1];
        // ...will compile. It will *not* run.

        // We can also make 2D arrays, or more!
        int[][] table;
        // So, here, we just have a variable with space for a reference...
        table = new int[50][3];
        // ...now, it has a reference, and that references a sequence of 50 spaces, each such space holding a reference
        // to *another* sequence, but of 3 spaces, each such space occupied by a default integer
        // There's no real reason to initialize all of this in one go. For example:
        int[][] table2;
        table2 = new int[20][];
        for (int i = 0; i < 50; i++) {
            table2[i] = new int[3];
        }
        // Or, we can make irregularly shaped arrays
        int[][] table3;
        table3 = new int[3][];
        table3[0] = new int[5];
        table3[1] = new int[8];
        table3[2] = new int[2];
        // This looks, visually, like:
        /*
        [ ][ ][ ]
        [ ][ ][ ]
        [ ][ ]
        [ ][ ]
        [ ][ ]
           [ ]
           [ ]
           [ ]
         */
    }
}
