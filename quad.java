import java.util.*;
class quad
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
double r1,r2;
System.out.println("Enter co-efficient of a: ");
double a = s.nextDouble();
System.out.println("Enter co-effcient of b: ");
double b = s.nextDouble();
System.out.println("Enter co-efficent of c: ");
double c = s.nextDouble();
double d = b*b - 4*a*c;
if(d <0)
{ System.out.println("Roots do not exist");
}
else
{
r1= (-b + Math.sqrt(d))/(2*a);
 r2 =(-b - Math.sqrt(d))/(2*a);
System.out.println("the roots are "+r1+","+r2);
}
}
}
