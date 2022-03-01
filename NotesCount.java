// write a java program to count total number of notes in given amount.

import java.io.*;
import java.util.Scanner;
public class NotesCount
{
     public static void main(String []args){
    int amt, r2000=0, r500=0, r200=0, r100=0, r50=0, r20=0, r10=0, r5=0, r2=0 , r1=0;
    //2000 - 1, 500 - 1, 200 - 2, 50 - , 20 - 2, 5 - 1, 2 - 2
    Scanner san = new Scanner(System.in);
    System.out.println("Enter Amount : ");
    amt = san.nextInt();
            while(amt >= 2000)
            {
                r2000 = amt / 2000 ; // r2000 - 0 -> r2000 - 2999/2000 - 1
                amt = amt % 2000; // amt - 2999 -> 2999%2000 -> 999
                System.out.print("\nTotal Number Of 2000 Rupees Notes :"+ r2000) ; // 1
                break ; // out of the loop
            }
            while(amt >= 500)
            {
                r500 = amt / 500 ; // r500 - 0 -> 999/500 - 1
                amt = amt % 500; // amt - 999 -> 999%500 -> 499
                System.out.print("\nTotal Number Of 500 Rupees Notes : "+ r500) ; // 1
                break ; //out of the loop
            }
            while (amt >= 200)
            {
                r200 = amt / 200; // r200 - 0 -> 499/200 -> 2
                amt = amt % 200; // amt - 499 -> 499%200 -> 99
                System.out.println("\nTotal Number Of 200 Rupees Notes : "+ r200);
                break ; //out of the loop
            }
            while(amt >= 100)
            {
                r100 = amt / 100 ;
                amt = amt % 100;
                System.out.print("\nTotal Number Of 100 Rupees Notes : "+ r100) ;
                break ;
            }
            while(amt >= 50)
            {
                r50 = amt / 50 ;
                amt = amt % 50;
                System.out.print("\nTotal Number Of 50 Rupees Notes : "+ r50) ;
                break ;
            }
            while(amt >= 20)
            {
                r20 = amt / 20 ;
                amt = amt % 20;
                System.out.print("\nTotal Number Of 20 Rupees Notes : "+ r20) ;
                break ;
            }
            while(amt >= 10)
            {
                r10 = amt / 10 ;
                amt = amt % 10;
                System.out.print("\nTotal Number Of 10 Rupees Notes Or Coin : "+ r10) ;
                break ;
            }
            while(amt >= 5)
            {
                r5 = amt / 5 ;
                amt = amt % 5;
                System.out.print("\nTotal Number Of 5 Rupees Notes Or Coin : "+ r5) ;
                break ;
            }
            while(amt >= 2)
            {
                r2 = amt / 2 ;
                amt = amt % 2;
                System.out.print("\nTotal Number Of 2 Rupees Notes Or Coin : "+ r2) ;
                break ;
            }
            while(amt >= 1)
            {
                r1 = amt / 1 ;
                amt = amt % 1;
                System.out.print("\nTotal Number Of 1 Rupees Note Or Coin : "+ r1) ;
                break ;
            }
    int sum = r2000 + r500 + r200 + r100 + r50 + r20 + r10 + r5 + r2 + r1;
    System.out.print("\n\nTotal Number Of Notes Require : \n\n"+ sum) ;
    }
}











// Frequency of a digits

// import java.util.Scanner;
// class Frequency
// {
// public static void main(String arr[])
// {
// int number, count, digit, temp;
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter any Number : ");
// number=sc.nextInt();
// System.out.println("Digit \t Frequency");
// for(int i = 0; i <= 9; i++)
// {
// count = 0;
// temp = number;
// while(temp > 0)
// {
// digit = temp % 10;
// if(digit == i)
// {
// count++;
// }
// temp = temp/10;
// }
// if(count > 0)
// {
// System.out.println(i+ "\t" +count);
// }
// }
// }
// }



// / store the number to originalNum
// int originalNum = num;
// // get the reverse of originalNum
// // store it in variable
// while (num != 0) {
// remainder = num % 10;
// reversedNum = reversedNum * 10 + remainder;
// num = num / 10;
// }
// // check if reversedNum and originalNum are equal
// if (originalNum == reversedNum) {
// System.out.println(originalNum + " is Palindrome.");
// }
// else {
// System.out.println(originalNum + " is not Palindrome.");
// }
// }
// }