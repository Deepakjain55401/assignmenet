import java.util.Scanner;
class circumference{
public static void main(String[]args){
double r,circumference,pie=3.14;
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius:");
r=sc.nextDouble();
circumference=2*pie*r;
System.out.println("Circumference is:" +circumference);

}}