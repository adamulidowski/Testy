package pl.testy.testtt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Zmiany");
        System.out.println( "Dodany branch");
        System.out.println( "Branch 'nowa'");
        System.out.println( "Branch 'nowa2'");
        
        Test test=new Test();
        test.setA(5);
        System.out.println(test.getA());
        
        System.out.println("master");
    }
}
