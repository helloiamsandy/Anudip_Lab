/*Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array [Hint: Use array and loop and try to access the element beyond the last index]
 
 */

package Demo;
public class ArrayOutOfBoundsDemo {

    public static void main(String[] args) {
        // An array with 5 elements (indices 0 through 4)
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // This loop will run from i = 0 to 5.
            // When i = 5, it will try to access numbers[5], which doesn't exist.
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // This block catches the exception and prints a user-friendly message.
            System.out.println("Error: Array index out of bounds.");
        }
    }
}

/*Output:

Element at index 0: 1
Element at index 1: 2
Element at index 2: 3
Element at index 3: 4
Element at index 4: 5
Error: Array index out of bounds.
*/