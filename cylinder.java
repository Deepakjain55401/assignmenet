import java.util.Scanner;
class cylinder{
public static void main(String[] args){
double h,area,l,pie=3.14,r;
Scanner sc =new Scanner(System.in);
System.out.println("Enter radius,height of cylinder repectively:");
r=sc.nextDouble();
h=sc.nextDouble();
area=(2*pie*r*h);
System.out.println("Surface area of cylinder is:"+area);
}

}