//
import java.util.Scanner;
class Example4{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter amount");
// 500 200 100
int amount=s.nextInt();
int a=0,b=0,c=0; //2000
if(amount%100==0){
if(amount>=500){
a=amount/500;
amount=amount-(a*500);
System.out.println("500 ruppes notes are :"+a);
}
if(amount>=200){
b=amount/200;
amount=amount-(b*200);
System.out.println("200 ruppes notes are :"+b);
}
if(amount>=100){
c=amount/100;
System.out.println("100 ruppes notes are :"+c);
}
}
else{
System.out.println("Please enter multiples of 100 only");
}

}
}