

 import java.util.Scanner;
 public class Digits{
 
  public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter number: ");
         int n = sc.nextInt();
         int count=0;
          
             for(int i=1; i<=n; i++)
             {
             n=n/10;
             count= count+1;
             }
        System.out.println("No.of digits:" +count);
     
  }
 
 }

