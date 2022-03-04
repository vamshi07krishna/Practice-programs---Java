import java.util.Scanner;
public class ArmstrongNum
{
    public  static void main(String args[])
    {
        int num,temp,n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        num=sc.nextInt();
        temp=num;
        while(num!=0){
            int rem=num%10;
            n=n+(rem*rem*rem);
            num=num/10;
        }
        if(temp==n){
            System.out.println("It is armstrong");
        }
        else{
            System.out.println("It is not armstrong");
        }
    }
}