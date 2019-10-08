import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class task_01_zero {
    /**
     * 1. Create method to check:
     * if number < 0 print “Number < 0”,
     * if number > 0 print “Number > 0”
     * if number = 0 throw your own exception
     */
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = -2;
        int number3 = 0;

        printNumber(number1);
        printNumber(number2);
        printNumber(number3);
    }

    private static void printNumber(int number) {
        try {
            if (number > 0)
                System.out.println("Number(" + number + ") > 0");
            else if (number < 0)
                System.out.println("Number(" + number + ") < 0");
            else
                throw new Exception("Zero is catch");
        }
        catch (Exception eX) {
            System.out.println("Catch section: " + eX.getMessage());
        }
        finally {
            System.out.println("Here is the Finally section");
        }
    }

}
