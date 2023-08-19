package ExceptionHandling;

public class printStackTrace {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception exception)
        {
            System.err.println(exception.getMessage());
            exception.printStackTrace();
            StackTraceElement[] traceElements= exception.getStackTrace();
            System.out.println("Stack trace from getStackTrace:");
            System.out.println("Class\t\tFile\t\tTime\t\tMethod");
            for(StackTraceElement element: traceElements)
            {
                System.out.println(element.getClassName());
                System.out.println(element.getFileName());
                System.out.println(element.getLineNumber());
                System.out.println(element.getMethodName());
            }
        }
    }
    public static void method1() throws Exception
    {
        method2();
    }
    public static void method2() throws Exception
    {
        method3();
    }
    public static void method3()throws Exception

    {
        throw new Exception("Exception thrown in method 3");
    }
}
