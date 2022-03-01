//write a java program to check whether a character is upper case or lower case alphabet.
import java.util.Scanner;
public class UpperLowerChar
{
    public static void main(String args[])
    {
        char ch;
        Scanner s=new Scanner(System.in); 
        System.out.println("Enter the character  ");
        ch=s.next().charAt(0);
            if(ch>='A' && ch<='Z')
            {
                System.out.println(ch+" is an upper case letter ");
            }
            else if(ch>='a' && ch<='z')
            {
                System.out.println(ch+" is a lower case letter ");
            }
            else
            {
                System.out.println(ch+" is not a Alphabets ");
            }
    }
}