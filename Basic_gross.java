/*4. WAP to read basic salary and find gross salary.
gs=hra+da+bs

 if basic <=10000
hra is 62% on basic
da is 78% on basic
if basic 10000-20000
hra is 69% on basic
da is 87% on basic
if basic is above 20000
hra is 78% on basic
da is 89% on basic
*/
import java.util.Scanner;
public class Basic_gross {
    public static void main(String args[])
    {
        	// Variable declaration and initialization for x,y and z
        
        	
        float hra,da,basic_salary=0,gross_salary;
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter Basic salary:" + basic_salary);
        
        basic_salary=a.nextFloat();
        
        
        if (basic_salary<=10000)
    	{
    	     hra=(basic_salary/100)*62;
    	     
    	     System.out.println("Hra:" +hra);
        
             da=(basic_salary/100)*78;
             
             System.out.println("da:" +da);
             
             gross_salary=hra+da+basic_salary;
             
    	     System.out.println("When the gross salary is less than 10k: " +gross_salary );
        }
 	    else if(basic_salary>=10000)
 	    {
     	    hra=(basic_salary/100)*69;
     	    
     	    System.out.println("Hra:" +hra);
        
             da=(basic_salary/100)*87;
             
             System.out.println("da:" +da);
             
             gross_salary=hra+da+basic_salary;
             
    	     System.out.println("When the gross salary is in b/w 10k-20k:" +gross_salary );
        }
        else if(basic_salary>20000)
         {
     	    hra=(basic_salary/100)*78;
     	    
     	    System.out.println("Hra:" +hra);
        
            da=(basic_salary/100)*89;
             
            System.out.println("da:" +da);

             
            gross_salary=hra+da+basic_salary;
             
    	    System.out.println("When the gross salary is more than 20k: " +gross_salary );
        }
        else
        {
            System.out.println("Incorrect message");
        }
        
        
    }
    
    
}