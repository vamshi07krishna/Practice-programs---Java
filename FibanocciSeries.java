import java.util.Scanner;
public class FibanocciSeries {
     
//Add main method here
public static void main(String args[]){

//Declare variable n and initialize value as 5
        int i,c=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate fibonacci series upto nth term");
    	n=sc.nextInt();
  		int a=0;
   		int b=1;
		
		System.out.println("Fibonacci series upto "+n+" is :-");
   		while(c<=n)
   		{
       			System.out.print(c+" ");
       			a=b;
       			b=c;
       			c=a+b;
   		}
    }
}