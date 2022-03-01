// write a java program whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;
public class Divisibleby5and11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check it is divisible by 5 and 11:");
        int num=sc.nextInt();
        if((num%5==0)&&(num%11==0))
        {
            System.out.println("Given number "+ num + " is Divisible by 5 and 11");
        } 
        else
        {
            System.out.println("Given number "+ num + " is Not Divisible by 5 and 11");
        }
    }
}