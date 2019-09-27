import java.util.*;

interface Stack{
void push(int ele);
int pop();
boolean isEmpty();
void display();
}
class StackTest implements Stack{
private int size =3,top=-1;
private int data[]=new int[size];

public void push(int ele){
if(top==size-1){
size*=2;
int temp[]=new int[size];
for(int i=0;i<=top;i++) 
temp[i]=data[i];
data=temp;
}
data[++top]=ele;
}
public int pop(){
if(isEmpty()){
System.out.println("The stack is empty.");
return -9999;
}
return data[top--];
}
public boolean isEmpty(){
if(top==-1)
return true;
else
return false;
}
public void display(){
if(!isEmpty()){
System.out.println("The elements are:");
for(int i=top;i>=0;i--)
System.out.println(data[i]);
}
else{
System.out.println("The stack is empty");
}
}
}
class StackDemo{
public static void main(String args[]){
StackTest s = new StackTest();
Scanner sc = new Scanner(System.in);
System.out.println("Enter:\n1 to push\n2 to pop\n3 to display\n4 to check if stack is empty\nany other key to exit");
int ch,ele;
do{
System.out.println("Enter your choice");
 ch =  sc.nextInt();
switch(ch){
case 1:
System.out.println("Enter the element to be pushed:");
ele=sc.nextInt();
s.push(ele);break;
case 2:
ele = s.pop();
if(ele!=-9999)
System.out.println("The popped element is "+ele);
break;
case 3:
s.display();break;
case 4:
if(s.isEmpty())
System.out.println("The stack is Empty");
else
System.out.println("The stack is not empty");
break;
default:
System.out.println("Exit");
System.exit(0);
}
}while(ch>0&&ch<5);
}}