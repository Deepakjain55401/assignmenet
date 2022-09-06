import java.util.Scanner;
class cone{
public static void main(String[]args){
double pie=3.14,r,h,volume;
Scanner sc=new Scanner(System.in);
System.out.print("Enter radius and hight of cone");
r=sc.nextDouble();
h=sc.nextDouble();
volume=pie*r*r*h;
System.out.print("volume of cone is:"+volume);
}}