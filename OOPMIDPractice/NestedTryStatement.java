package OOPMIDPractice;
public class NestedTryStatement {
    public static void main(String[] args) {
        try{
            throwException();
        }
        catch(Exception exception)
        {
            System.out.println("exception handeled in main");
        }
        doesnotThrowException();
    }
    public static void throwException() throws Exception
    {
        try{
            System.out.println("Method TheowException");
            throw new Exception();//rethrow for further processing
        }
        catch(Exception exception)
        {
            System.err.println("Exception handled in method throwException");
            throw exception;
        }
        finally{
            System.err.println("Finally block");
        }
    }
    public static void doesnotThrowException()
    {
        try{
            System.out.println("Method doesnot ThrowException");
        }
        catch(Exception exception)
        {
            System.err.println(exception);
        }
        finally{
            System.err.println("finally of doesnot throw Exception");
        }
        System.out.println("End of doesnot throwExecption");
    }
}
