import java.util.Scanner;
class rectangle{
public static void main(String[]args){
int l,b,h,perimeter;
Scanner sc = new Scanner(System.in);
System.out.println("Enter length,breadth and height respectively:");
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();
perimeter=2*(l+b)*h;
System.out.println("perimeter is:"+perimeter);
}
}