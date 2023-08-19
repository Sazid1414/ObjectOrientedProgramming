package ExceptionHandling;

public class stackUnwinding {
    public static void main(String[] args) {
        try
        {
            throwException();
        }
        catch(Exception exception)
        {
            System.err.println("Exception handled in main.");
        }
    }
    public static void throwException() throws Exception
    {
        try
        {
            System.out.println("Method throwException.");
        }
        catch (RuntimeException runtimeException)
        {
            System.err.println("Exception handled in method throwException.");
        }
        finally {
            System.err.println("Finally is always executed.");
        }
    }



}
