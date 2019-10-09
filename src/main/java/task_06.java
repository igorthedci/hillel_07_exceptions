import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * "6. Write a program that will enter numbers from the keyboard.
 * The code for reading numbers from the keyboard must be in the readData method.
 * The code inside the readData is wrapped in a try..catch.
 * If the user entered some text, instead of entering a number,
 * the method should catch the exception and display all previously entered numbers as a result.
 * Numbers output from a new line preserving the order of input."
 */
public class task_06 {

    public static void main(String[] args) {

        System.out.print("Program is working... Type a number: ");
        readData();
    }

    private static void readData() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> arrNumbers = new ArrayList<Integer>();  // array to save numbers
        int aNumber;

        try {
            do { // read numbers until 'non-number' exception
                aNumber = keyboard.nextInt();
                arrNumbers.add(aNumber);
                System.out.print("Type next number: ");
            } while (true);

        } catch (InputMismatchException eX) {
            System.out.println("... something is caught, program is terminating. ");
            System.out.println("Error message:\n" + eX.toString());
        }
        finally {
            Iterator iterator = arrNumbers.iterator();
            System.out.println("Saved numbers:");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println("... the end of list.");
        }
    }
}
