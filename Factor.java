import java.util.Scanner;
public class Factor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = sc.nextInt();
       // System.out.println("Please enter number: ");
        //int m = sc.nextInt();
        
        for(int i= 1; i<=n; i++)
        {
            if(i%2==0)
            {
                 System.out.println("The numbers are:" +i);

            }
        }
    
               

}
}