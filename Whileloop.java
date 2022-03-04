
import java.util.Scanner;
public class Whileloop{
    public static void main(String args[]) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = sc.nextInt();
        while(i <= n)
        {
            System.out.println(i+" ");
            i++;
        }
    
     }
}



   