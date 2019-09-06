import java.util.*;
class Account
{
String name,c_no; // c_no = customer number
int balance;
void input()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the name of customer:");
name=s.next();
System.out.println("Enter the customer number:");
c_no=s.next();
System.out.println("Enter the available balance in account:");
balance=s.nextInt();
}
void display()
{
System.out.println("The name of the customer: "+name);
System.out.println("The customer number for this account: "+c_no);
System.out.println("The available balance: "+balance);
}
}
class Savings extends Account
{
float intrest_rate,time;
void input()
{
super.input();
Scanner s = new Scanner(System.in);
System.out.println("Enter the rate of intrest:");
intrest_rate=s.nextFloat();
System.out.println("Enter the duration of time:");
time=s.nextFloat();
}
float compute()
{
float si = (balance*intrest_rate*time)/100;
return si;
}
void display()
{
super.display();
System.out.println("The intrest recieved is :"+compute());
}
}
class Demo
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
Savings ob = new Savings();
ob.input();
ob.display();
}
}