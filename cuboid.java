import java.util.Scanner;
class VOR{
public static void main(String[]args){
float l,b,h,volume;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length,breadth and height of rectangle");

l=sc.nextFloat();
b=sc.nextFloat();
h=sc.nextFloat();
volume=l*b*h;
System.out.println("Volume of rectangle is:"+volume);
}
}
