//WAP to accept project marks, internal marks, external marks. find total marks.

// totalmarks:
// 1. 70% on project
// 2. 20% on external
// 3. 10% on internal

import java.util.Scanner;

public class Project {
    
    public static void main(String args[]) 
    
    {
        int pm=0,im=0,em=0, total;
        
        int tm;
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter project marks:" + pm);
        
        pm = a.nextInt();
        
        System.out.println("Enter external marks:" + em);
        
        em = a.nextInt();
        
        System.out.println("Enter internal marks:" + im);
        
        im = a.nextInt();
        
        tm= (pm*70/100) + (im*20/100) +(em*10/100);
        
        //total= (pm*70)+(im*20)+(em*10);
        
        //tm= total/100;
        
        
        System.out.println("The total marks is: " + tm);
    }
    
}
