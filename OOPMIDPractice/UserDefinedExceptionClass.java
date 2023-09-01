package OOPMIDPractice;
import java.lang.Exception;
class MyException extends Exception{
    MyException(String message)
    {
        super(message);
    }
}
public class UserDefinedExceptionClass {
    public static void main(String[] args) {
        int number1=1,number2=10000;
        float quotient;
        try{
            quotient=(float)number1/(float)number2;
            if(quotient<0.001)
            {
                throw new  MyException("The result is too small");
            }
        }
        catch(MyException exceptionObject)
        {
            System.out.println("Caught user defined exception ");
            System.out.println(exceptionObject.getMessage());
        }
        finally
        {
            System.out.println("The programme successsfully terminated");
        }
    }
}

