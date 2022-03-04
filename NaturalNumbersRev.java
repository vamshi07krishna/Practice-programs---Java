import java.util.Scanner;
public class NaturalNumbersRev{

    public static void main(String[] args) 
     	{
     		int number, i;
     		Scanner sc = new Scanner(System.in);
    		
     		System.out.print(" Please Enter the integer Value : ");
    	number = sc.nextInt();	
    		
     		i = number;
    		
     		while(i >= 1)
     		{
     			System.out.println(i +" "); 
     			i--;
     		}	
     	}
     }