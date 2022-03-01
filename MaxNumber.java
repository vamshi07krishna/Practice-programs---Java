// 1.write a program to find maximum between two numbers.

import java.util.Scanner;
public class MaxNumber
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=a.nextInt();
        System.out.println("Enter thes second number: ");
        int num2=a.nextInt();
        if(num1>num2){
        System.out.println("num1 is maximum:" +num1);
        }
        else{
        System.out.println("num2 is maximum:" +num2);
    }
    }
}
