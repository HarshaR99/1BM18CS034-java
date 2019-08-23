import java.util.*;
class ttime
{
int h,m,s;
ttime()
{
h=0;
m=0;
s=0;
}
ttime(int a,int b,int c)
{
h=a;
m=b;
s=c;
}
void display()
{
System.out.println("The time is- "+h+":"+m+":"+s);
}
void advance(int a,int b,int c)
{
h+=a;
m+=b;
s+=c;
if(s>=60)
{m+= s/60;
 s%=60;
}
if(m>=60)
{h+=m/60;
m%=60;
}
if(h>23)
{h%=34;
}
}
void reset(int a,int b,int c)
{h=a;
m=b;
s=c;
}
}
class time
{
public static void main(String[] args)
{ ttime t1=new ttime();
  int g=1,a,b,c,ch;
 Scanner sc= new Scanner(System.in);
 while(g==1)
{
System.out.println("Enter");
System.out.println("1:Advance");
System.out.println("2:Reset");
System.out.println("3:Display");
System.out.println("4:Exit");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter time to be advanced in the format hh mm ss");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
t1.advance(a,b,c);
break;
case 2:
System.out.println("Enter the reset time in the format hh mm ss");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
t1.reset(a,b,c);
break;
case 3:
t1.display();
break;
default:
g++;
}
}
}
}



