import java.util.Scanner;

public class Datavalue {
     
//Add main method
 public static void main(String args[])
    {
       String d=null;

//Use the scanner class to provide input at execution time
	Scanner s = new Scanner(System.in);
	System.out.println("Enter int value:" );
    int a = s.nextInt();
    
    System.out.println("Enter float value:" );
    float b = s.nextFloat();
    
    System.out.println("Enter double value:" );
    double c = s.nextDouble();
    
    System.out.println("Enter string value:" );
    d = s.next();
    
    System.out.println("Int value is:" +a);
    System.out.println("float value is:" +b);
    System.out.println("double value is:" +c);
    System.out.println("String value is:" +d);
    }
    
    
    
}
    