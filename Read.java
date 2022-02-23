import java.util.Scanner;

public class Read {
    
    public static void main(String args[]) 
    
    {
        int units=0;
        
        
        double bill, one_unit=34.50, gst, final_bill;
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter the units:" + units);
        
        units = a.nextInt();
        
        bill = units*one_unit;
        
        System.out.println("The bill is:" + bill);
        
        gst=(bill*18)/100;
        
        System.out.println("Enter gst for the bill:" + gst);
        
        final_bill= bill+gst;
        
        
        System.out.println("The total bill is: " + final_bill);
    }
    
}
