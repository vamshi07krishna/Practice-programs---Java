// write a program to find maximum between three numbers.


import java.util.Scanner;
public class MaxThreeNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number: ");
        int a=sc.nextInt();
        System.out.println("enter Second number: ");
        int b=sc.nextInt();
        System.out.println("enter Third number: ");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("The largest number is:"+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("The largest number is:"+b);
        }
        else if(c>a && c>b)
        {
            System.out.println("The largest number is:"+c);
        }
        else
        {
            System.out.println("Incorrect value");
        }
    }
}