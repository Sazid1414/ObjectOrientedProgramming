package ExceptionHandling;

public class usingException {
    public static void main(String[] args) {
        try {
            throwException();
        }
        catch (Exception exception)
        {
            System.err.println("Exception handled in main.");
        }
        doesNotThrowException();
    }
    public  static void throwException() throws Exception {
        try {
            System.out.println("Method throwException.");
        } catch (Exception exception) {
            System.err.println("Exception handled in method throwException.");
        }
        finally
        {
            System.err.println("Finally executed in throwException.");
        }
    }
    public static void doesNotThrowException()
    {
        try {
            System.out.println("Method doesnot throw exception.");
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
        finally {
            System.err.println("Finally executed in doesnot Throw Exception.");
        }
        System.out.println("End of method doesnotThrowException.");
    }


}
