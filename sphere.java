import java.util.Scanner;
class sphere{
public static void main(String[]args){
double pie=3.14, r, volume;
Scanner sc=new Scanner(System.in);
System.out.print("Enter radius:");
r=sc.nextDouble();
volume=(pie*r*r*r)*4/3;
System.out.print("Volume of sphere is:"+volume);
}}