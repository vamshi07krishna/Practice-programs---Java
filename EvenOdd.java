import java.util.Scanner;
public class EvenOdd{
 
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = sc.nextInt();
        int i=0, j=1;
        //the while loop executes until the condition become false
        while(i<=n)
        {
        //prints the even number
        if(i%2==0){
        System.out.print(i +" ");
        i=i+2;
        }
        System.out.println( );
                }
        while(j<=n){
            if(j%2 !=0){
                    
                
                 System.out.print(j +" ");
          j=j+2;
                }
        }
     
 }
}




//     // WAP to print even numbers and odd numbers from 1-N using while loop.

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of the array : ");
// int end = sc.nextInt();

// //end = 10
// int i = 2;
// while(i<=end) {​​​
// if(i%2 == 0){​​​
// System.out.print(i+" ");
// }​​​
// i = i + 2;
// }​​​
// System.out.println();
// i = 1;
// while(i<=end) {​​​
// if(i%2 != 0){​​​
// System.out.print(i+" ");
// }​​​
// i = i + 2;
// }​​​
// }​​​
// }​​​
