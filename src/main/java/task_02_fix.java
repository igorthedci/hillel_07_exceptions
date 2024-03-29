public class task_02_fix {
    /**
     * "2. Fix the method with try-catch to get the correct result of division:
     */

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;

        try {
            return a / b;
        }
        catch (ArithmeticException eX) {
            System.out.println("... catch section...");
            return 0;
        }
    }
}

