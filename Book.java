import java.util.*;
class Book
{
String name,auth;
int price,num_pages;
Book()
{
name = "Wings of Fire";
auth="Abdul Kalam";
num_pages=180;
price=100;
}
void set()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter name of the book:");
name = s.next();
System.out.println("Enter name of author:");
auth = s.next();
System.out.println("Enter the price of the book");
price = s.nextInt();
System.out.println("Enter the number of pages of the book:");
num_pages=s.nextInt();
}
void get()
{
System.out.println("The name of the book is :"+name);
System.out.println("The author of the book is :"+auth);
System.out.println("The price of the book is :"+price);
System.out.println("The number of page of the book is :" +num_pages);
}
public String toString()
{
String info;
info = "The name of the book is :"+name+"\nThe author of the book is :"+auth+"\nThe price of the book is :"+price+
"\nThe number of page of the book is :" +num_pages+"\n";
return info;
}
}

class BookDemo
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of books");
int n = s.nextInt();
Book b[] = new Book[n];
int i;
for(i=0;i<n;i++)
{
b[i] = new Book();
System.out.println("Enter details of book :"+(i+1));
b[i].set();
}
for(i=0;i<n;i++)
{
System.out.println("The details of book :"+(i+1));
System.out.println(b[i]);
}
}
}