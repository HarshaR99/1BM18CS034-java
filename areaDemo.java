import java.util.*;
abstract class Shape{
int l,b;
abstract void printArea(int l,int b);
}
class Rectangle extends Shape{
void printArea(int l,int b){
this.l=l;
this.b=b;
int area=l*b;
System.out.println("Area of Rectangle is :"+area);
}
}
class Triangle extends Shape{
void printArea(int l,int b){
this.l=l;
this.b=b;
float area=(float)0.5*l*b;
System.out.println("Area of Triangle is :"+area);
}
}
class Circle extends Shape{
void printArea(int l,int b){
this.l=l;
float area= (float)3.14*l*l;
System.out.println("Area of Circle is :"+area);
}}
class areaDemo{
public static void main(String args[]){
Shape ref =null;int ch;
Scanner sc = new Scanner(System.in);
System.out.println("Enter :\n1 to get area of Rectangle\n2 to get area of triangle\n3 to get area of Circle.");
do{
System.out.println("Enter your choice");
 ch = sc.nextInt();
switch(ch){
case 1:
ref=new Rectangle();
ref.printArea(1,2);
break;
case 2:
ref=new Triangle();
ref.printArea(1,2);
break;
case 3:
ref = new Circle();
ref.printArea(5,0);
break;
default:
System.exit(0);
}
}while(ch==1||ch==2||ch==3);
}
}
