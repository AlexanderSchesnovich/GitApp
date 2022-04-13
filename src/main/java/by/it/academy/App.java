package by.it.academy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 5;
        int b = 6;
        System.out.println( "Hello World!" );
        extracted(a, b);
    }

    private static void extracted(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
