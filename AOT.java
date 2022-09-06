import java.util.Scanner;
class AOT{
public static void main(String[]args){
double b,h,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter base  of triangle:");
b=sc.nextInt();
System.out.println("Enter hieght of triangle:");
h=sc.nextInt();
area=(b*h)/2;
System.out.println("Area of triangle is:"+area);
}
}