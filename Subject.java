/*

WAP to read project score, internal score, external score from student.
==> check student got pass in 3 subjects (Project+external+internal) : pass marks=50
==> if student got pass in 3 subjects then find total score
total = 70% on project +20% on external +10 % on internal
==> Print grade based on total score
90+ A grade
75--90 B
50-75 C

*/

// ==> if student got failed in subjects, print failed subject subname along with score.




import java.util.Scanner;

public class Subject {
    
    public static void main(String args[]) 
    
    {
        int pm=0,im=0,em=0, total;
        
        int tm=0;
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter project marks:" + pm);
        
        pm = a.nextInt();
        
        System.out.println("Enter external marks:" + em);
        
        em = a.nextInt();
        
        System.out.println("Enter internal marks:" + im);
        
        im = a.nextInt();
        
        
        if(pm>=50 && im>=50 && em>=50)
        {
            System.out.println("Student passed" );
            tm= (pm*70/100) + (im*20/100) +(em*10/100);
            System.out.println("total marks is:" +tm );
        }
            if(tm>=90)
            {
                System.out.println("The Student secured A- Grade:" +tm);
            }
             else if(tm>=75 && tm<=90)
            {
                System.out.println("The Student secured B - Grade:" +tm);
            }
            else if(tm>=50 && tm<=75)
            {
                System.out.println("The Student secured C - Grade:" +tm);
            }
            else{
                System.out.println("Student failed:" );
            }
            
            if(pm<50){
            System.out.println("Student falied in project:" +pm);
            }
            else if(em<50)
            {
                System.out.println("Student falied in internal:" +im);
            }
            else
            {
                System.out.println("Student falied in external:" +em);
            }
    
            
        
    }
    
}
