import java.util.*;
class fibonacci
{
public static void main(String args[])
{ Scanner s = new Scanner(System.in);
 System.out.println("Enter the nth number needed in fibonacci sequence");
int n = s.nextInt();
int a=1,b=1,c;
for(int i =3;i<=n;i++)
{ c = b;
  b=a+b;
  a=c;
}
System.out.println("The required number is "+b);
}
}
