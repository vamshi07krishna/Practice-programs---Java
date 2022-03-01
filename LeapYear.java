//write a java program whether a year is leap year or not.
import java.util.Scanner;
class LeapYear
{
    public static void main(String args[])
    {
        int year;
        System.out.println("Enter a year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println(year+ "It is leap year");
        }
        else
        {
            System.out.println(year+ "It is non-leap year");
        }
    }
}