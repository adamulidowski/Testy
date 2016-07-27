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
        Test2 test2=new Test2();
        test2.setA(6);
        test2.setB(7);
        System.out.println(test2.getA());
        System.out.println(test2.getB());
    }
}
