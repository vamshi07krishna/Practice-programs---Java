// write a java program to check whether a number is negative,positive or zero.


import java.util.Scanner;
public class NegPositiveZero
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        n=sc.nextInt();
        if(n>0)
            System.out.println(n+" is a positive number");
        else if(n<0)
            System.out.println(n+" is a negative number");
        else if(n==0)
            System.out.println(n+ " it is a zero");
        else
            System.out.println("error");
    }
}