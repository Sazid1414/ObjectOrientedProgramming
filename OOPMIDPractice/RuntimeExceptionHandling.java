package OOPMIDPractice;
import java.lang.Exception;

public class RuntimeExceptionHandling {
    public static void main(String[] args) {
        try{
            throwException();
        }
        catch(Exception exception)
        {
            System.err.println("Exception Handeled in main");
        }
    }
    public static void throwException()throws Exception
    {
        try{
            System.out.println("Method throwExecption");
            throw new Exception();
        }
        catch(RuntimeException runtimeException)
        {
            System.err.println("Exception handled in throwException method ");
        }
        finally
        {
            System.err.println("Finally is always Executed");
        }
    }
}
