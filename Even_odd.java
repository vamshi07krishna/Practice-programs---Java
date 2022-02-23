import java.util.Scanner;
public class Even_odd {
    public static void main(String args[])
    {
        	// Variable declaration and initialization for x,y and z
        	int number=0;
        	
        	Scanner s = new Scanner(System.in);
        	
        	System.out.println("Enter the week number:" +number);
        	
        	number = s.nextInt();
        	
        	//To get the highest marks in 3 subjects we are using if else condition
        	if (number%2==0 )
        	{
        	    System.out.println(" It is even" );
        	}
        	else
        	{
        	    System.out.println("It is odd" );
        	}
    }
}