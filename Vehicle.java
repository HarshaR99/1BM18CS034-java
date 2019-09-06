import java.util.*;
class Vehicle
{
String model,color; int year;
public static int total_number_of_vehicles=0;
Vehicle(String model,int year, String color)
{
this.model=model;
this.year=year;
this.color=color;
total_number_of_vehicles++;
}
void output()
{
System.out.println("Details of Car:");
System.out.println("Model name: "+model);
System.out.println("Color : "+color);
System.out.println("Year : "+year);
System.out.println("Total number of car(s) : "+total_number_of_vehicles);
System.out.println("********************************************************************************************************************");
}
}

class carDemo
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of objects");
int n = s.nextInt();
Vehicle v[] = new Vehicle[n];
for(int i =0;i<n;i++)
{
System.out.println("Enter Model name: ");
String name = s.next();
System.out.println("Enter the color of vehicle : ");
String color = s.next();
System.out.println("Enter the year of launch: ");
int year = s.nextInt();
v[i]= new Vehicle(name,year,color);
v[i].output();
}
}
}