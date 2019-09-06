class car
{
String model,color; int year;
public static int total_number_of_vehicles=0;
car(String model,int year, String color)
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
System.out.println("\n");
}
}

class carDemo
{
public static void main(String args[])
{
car a = new car("Apache",2019,"Red");
a.output();
car b = new car("LCA",2019,"Blue");
b.output();
}
}
