import java.util.*;
class person
{
private String name,address,age;
void input()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the name of person:");
name=s.next();
System.out.println("Enter the age of person:");
age=s.next();
System.out.println("Enter the address of person:");
address=s.next();
}
void display()
{
System.out.println("The name of the person is "+name);
System.out.println("the age of the person is "+age);
System.out.println("The address of the person is "+address);
}
}

class student extends person
{
private String rollno,sem;
void input()
{
Scanner s = new Scanner(System.in);
super.input();
System.out.println("Enter the roll no. of student:");
rollno=s.next();
System.out.println("Enter the semester of student:");
sem=s.next();
}
void display()
{
super.display();
System.out.println("The roll no. of student is "+rollno);
System.out.println("The student is in semester "+sem);
}
}

class exam extends student
{
private int mk1,mk2;
void input()
{
Scanner s = new Scanner(System.in);
super.input();
System.out.println("Enter marks1:");
mk1=s.nextInt();
System.out.println("Enter marks2");
mk2=s.nextInt();
}
float average()
{
return (float)0.5*(mk1+mk2);
}
void display()
{
super.display();
System.out.println("The marks in subject 1 is "+mk1);
System.out.println("The marks in subject 2 is "+mk2);
System.out.println("The average marks scored is "+average());
}
}

class demo
{
static int toppr(exam ob[])
{
int l = ob.length;
int top=-1;
for(int i=0;i<l-1;i++)
{
if(ob[i].average()>ob[i+1].average())
top = i;
}
return top;
}

public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of students");
int n = s.nextInt();
exam e[] = new exam[n];
for(int i=0;i<n;i++)
{
e[i]=new exam();
System.out.println("Enter details for person no. "+(i+1));
e[i].input();
}
System.out.println("The details of topper is:");
e[toppr(e)].display();
}
}
































