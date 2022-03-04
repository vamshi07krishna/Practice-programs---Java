import java.util.Scanner;
public class PalindromeNum
{
    public  static void main(String args[])
    {
        int sum=0,temp,n,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        n=sc.nextInt();
        temp=n;    
        while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
        }    
        if(temp==sum){
            System.out.println( sum + " It is palindrome ");
        }
        else{
            System.out.println( sum + " It is not palindrome ");
        }
    }
}