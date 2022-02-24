 import java.util.Scanner;
public class UserPrimeNumber{
 
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = sc.nextInt();
        System.out.println("Please enter number: ");
        int m = sc.nextInt();
        int temp=0;
        for(int i= n; i<=m/2; i++)
        {
            if(m%i==0)
            {
                temp++;
                System.out.println("no's are:" + temp);
            }
        }
      if(temp==1){
            System.out.println("It is prime number" +temp);
        }
        else{
            System.out.println("It is not a prime number" +temp);
        }
                
    }
}
