import java.util.Scanner;
public class Week {
    public static void main(String args[])
    {
        	// Variable declaration and initialization for x,y and z
        	int week_number=0;
        	
        	Scanner s = new Scanner(System.in);
        	
        	System.out.println("Enter the week number:" +week_number);
        	
        	week_number = s.nextInt();
        	
        	//To get the highest marks in 3 subjects we are using if else condition
        	if (week_number==1 )
        	{
        	    System.out.println(" Monday" );
        	}
        	    else if(week_number==2)
        	    System.out.println("Tuesday" );
        	    else if(week_number==3)
        	    System.out.println("Wednesday");
        	    else if(week_number==4)
        	    System.out.println("Thursday");
        	    else if(week_number==5)
        	    System.out.println("Friday" );
        	    else if(week_number==6)
        	    System.out.println("Saturday" );
        	    else if(week_number==7)
        	    System.out.println("Sunday" );
        	    
        	else
        	{
        	   
        	    System.out.println(" Entered wrong number :" );
        	
        	}
        
        
    }

}