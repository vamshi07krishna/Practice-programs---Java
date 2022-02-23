import java.util.Scanner;

public class Basic {
    
    public static void main(String args[]) 
    
    {
        float hra,da,basic_salary=0,gross_salary;
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter Basic salary:" + basic_salary);
        
        basic_salary=a.nextFloat();
        
        hra=(basic_salary/100)*56;
        
        da=(basic_salary/100)*90;
        
        gross_salary = hra+da+basic_salary;
        
        System.out.println("The gross salary is: " + gross_salary);
    }
    
}
