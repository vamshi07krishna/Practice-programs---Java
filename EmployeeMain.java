/*name,age,rollno,gender,section*/
import java.util.*;

class Employee
{
//State-variables
String Employee_name;
int Employee_id;
String Employee_dept;
int Employee_salary;
//behaviour-Methods
//return type method name(parameters)
//{
//statements
//}
//Reading object information
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee name");

Employee_name=sc.next();
System.out.println("Enter Employee department");
 Employee_dept =sc.next();
System.out.println("Enter employee Salary");
 Employee_salary=sc.nextInt();
System.out.println("enter employee id");
Employee_id=sc.nextInt();

}
void display()
{
System.out.println("name:"+Employee_name);
System.out.println("id:"+Employee_id);
System.out.println("dept:"+Employee_dept);
System.out.println("salary:"+Employee_salary);
// System.out.println("HRA:"+HRA);
// System.out.println("TA:"+TA);
}


int HRA;
void HRA(){
    HRA= Employee_salary*10/100;
    System.out.println("HRA:"+HRA);
}



int TA;
void TA(){
    TA= Employee_salary*5/100;
    System.out.println("TA:"+TA);
}



}


class EmployeeMain
{
public static void main(String args[])
{
Employee std1=new Employee();

std1.input();
std1.display();
std1.TA();
std1.HRA(); 

Employee std2=new Employee();

std2.input();
std2.display();
std2.TA();
std2.HRA(); 

    
}
}



 