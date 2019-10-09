/**
 * "5. Throw a NullPointerException from the method iCanThrowException();
 * Handle it in the main method.
 * public class Main {
 *
 * public static void main(String[] args) {
 * iCanThrowException();
 * }
 *
 * public static void iCanThrowException() {
 * }
 *
 * }"
 */
public class task_05_throw {

    public static void main(String[] args) {

        try {
            iCanThrowException();
        }
        catch (NullPointerException eX) {
            System.out.println("... something was caught:\n" + eX.toString());
        }
    }

    private static void iCanThrowException() throws NullPointerException {
        throw new NullPointerException();
    }

}
