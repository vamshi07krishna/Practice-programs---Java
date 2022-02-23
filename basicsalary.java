import java.util.Scanner;

public class basicsalary {

//main method
public static void main(String args[])
{
    //int shpng1, shpng2, shpng3;
    double salary, percentage;
    int Total_shpng;
    //Use the scanner class to provide input at execution time using scanner object
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the shpng1:" + shpng1);
   
    int shpng1 = sc.nextInt();

    System.out.println("Enter the shpng2:" + shpng2);
    int shpng2 = sc.nextInt();
    
    System.out.println("Enter the shpng3:" + shpng3);
    int shpng3 = sc.nextInt();
    
    System.out.println("Enter the salary:" +salary);
   
    salary= sc.nextFloat();
    
    Total_shpng = shpng1+shpng2+shpng3;
    
    System.out.println("Total of 3 shoppings is:" +Total_shpng);
    
     percentage = Total_shpng * 100 /salary;
    
    System.out.println("Total percentage spent on shoppings is:" +percentage);

}

}