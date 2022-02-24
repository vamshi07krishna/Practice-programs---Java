 import java.util.Scanner;
public class PrimeNumbers{
 
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = sc.nextInt();
       // System.out.println("Please enter number: ");
        //int m = sc.nextInt();
        int temp=0;
        for(int i= 1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                temp++;

            }
        }
        if(temp==1){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
               
    }
}
