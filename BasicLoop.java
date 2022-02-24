
import java.util.Scanner;
public class BasicLoop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = sc.nextInt();
       // System.out.println("Please enter number: ");
        //int m = sc.nextInt();
        
        for(int i= 1; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i+ " ");

            }
                    }
    
}
}