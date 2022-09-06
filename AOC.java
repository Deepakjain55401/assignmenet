import java.util.Scanner;
class Circle{
public static void main(String[]args){
double r,area,pie=3.14;
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius:");
r=sc.nextDouble();
area=pie*r*r;
System.out.println("Area of circle is:"+area);


}
}