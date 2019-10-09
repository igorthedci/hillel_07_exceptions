public class task_04_fix {
    /**
     * "4. Fix the program to make it work:
     * public static void main(String[] args) {
     * try {
     * int a = 0;
     * int b = 4 / a;
     * } catch (Exception e) {
     * e.printStackTrace();
     * } catch (ArithmeticException e) {
     * e.printStackTrace();
     * }
     * }"
     */
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e) { // special case of exception is more priority
            e.printStackTrace();
        } catch (Exception e) { // common case of exception is less priority
            e.printStackTrace();
        }
    }
}
