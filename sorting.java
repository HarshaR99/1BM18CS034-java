import java.util.*;
class sorting
{
int a[],l;
void create(int n)
{
a = new int[n];
l=n;
}
boolean order(int arr[])
{
for(int i=0;i<l-1;i++)
{
if(arr[i]>arr[i+1])
return false;
}
return true;
}
void move(int n)      
{
 int temp = a[n],i;
 for( i=n;i<l-1;i++)
 a[i]=a[i+1];
 a[i]=temp;
}
int steps()
{
l=a.length;
int count=0;
if(order(a))
return 0;
for(int i=0;i<l-1;i++)
{for(int j=0;j<l-1;j++)
{if(a[j]>a[j+1])
{
move(j);count++;
}
if(order(a))
return count;
}
}
System.out.println("Unexpected Error");
return -9999;
}
}
class sortDemo
{
public static void main(String ag[])
{
Scanner sc = new Scanner(System.in);
sort s = new sort();
System.out.println("Enter the number of elements of array:");
int n=sc.nextInt();
s.create(n);
System.out.println("Enter the "+n+" elements:");
for(int i=0;i<n;i++)
s.a[i]=sc.nextInt();
int least = s.steps();
System.out.println("The least number of moves required are: "+least);
}
}
