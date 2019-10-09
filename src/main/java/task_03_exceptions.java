public class task_03_exceptions {
    /**
     * "3. Finish the program to handle all the possible exceptions:
     * public class Main {
     * <p>
     * public static void main(String[] args) {
     * int a = args.length;
     * System.out.println(a);
     * <p>
     * int b = 10 / a;
     * int[] c = {1};
     * System.out.println(c[1]);
     * }
     * }
     * <p>
     * Print the cause of the exception to the console."
     */

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        } catch (Exception eX) {
            System.out.println("... catch section: something happens:\n" +
                    eX.toString());
        }
    }
}
