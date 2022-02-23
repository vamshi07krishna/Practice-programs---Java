import java.util.Scanner;
public class Big {
    public static void main(String args[])
    {
        	// Variable declaration and initialization for x,y and z
        	int x=0,y=0,z=0;
        	Scanner s = new Scanner(System.in);
        	
        	System.out.println("Enter the value of x:" +x);
        	System.out.println("Enter the value of y:" +y);
    		System.out.println("Enter the value of z:" +z);
        	x = s.nextInt();
        	y = s.nextInt();
        	z = s.nextInt();
        	
        	//To get the highest marks in 3 subjects we are using if else condition
        	if (x>y)
        	{
        	    if(x>z)
        	    System.out.println(" The highest is x :" +x);
        	    else
        	    System.out.println(" The highest is z :" +z);
        	}
        	else
        	{
        	    if (y>z)
        	    System.out.println(" The highest is y :" +y);
        	    else
        	    System.out.println(" The highest is z :" +z);
        	
        	    
        	}
        
        
    }

}

