// write a java program to input any character and check whether it is alphabet,digit or special character.

import java.util.Scanner;

public class CharSpecSymbol 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter something : ");
        char ch = s.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
        {
             System.out.println(ch + " is Alphabet");
        } 
        else if(ch >= '0' && ch <= '9') 
        {
             System.out.println(ch + " is digit");
        } 
        else 
        {
             System.out.println(ch + " is  special character");
        }
    
    }
}
