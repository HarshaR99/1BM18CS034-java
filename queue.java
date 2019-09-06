import java.util.*;
class queue
{
int data[];
int front =0,rear=-1,n;
void create(int n)
{
this.n=n;
data = new int[n];
}
void insert(int ele)
{
if(rear == (n-1))
{
System.out.println("Queue Overflow");
return;
}
data[++rear]=ele;
}

int delete()
{
if(front>rear)
{
System.out.println("Queue Underflow");
return -9999;
}
return data[front++];
}
void display()
{
if(front>rear)
System.out.println("No elements in queue");
else
{
System.out.println("The elements in queue are");
  for(int i=front;i<=rear;i++)
  System.out.println(data[i]);
}
}
}

class queueDemo
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
queue ob = new queue();
int ch,ele;
System.out.println("Enter the size of the queue");
ob.create(s.nextInt());
System.out.println("Enter 1 to insert,2 to delete,3 to display or any other value to exit");
do{
System.out.println("Enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the element to be inserted");
ob.insert(s.nextInt());
break;
case 2:
ele = ob.delete();
if(ele != -9999)
System.out.println("The deleted element is: "+ele);
break;
case 3:
ob.display();
break;
default:
System.out.println("Error");
}
}while(ch==1||ch==2||ch==3);

}
}
