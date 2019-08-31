class Point
{
float x,y,z;
Point()
{
x=0;
y=0;
z=0;
}
Point(float a,float b,float c)
{
x=a;
y=b;
z=c;
}
Point(Point ob)
{
x=ob.x;
y=ob.y;
z=ob.z;
}
float distance(Point ob)
{
float d= (float)Math.sqrt(Math.pow(x-ob.x,2)+Math.pow(y-ob.y,2)+Math.pow(z-ob.z,2));
return d;
}
}

class PointDemo
{
public static void main()
{
Point ob1 = new Point();
Point ob2 = new Point(5,6,7);
Point ob3 = new Point(ob2);
System.out.println("The distance between ob1 and ob2 ="+ob1.distance(ob2)+"units");
System.out.println("The distance between ob2 and ob3 ="+ob2.distance(ob3)+"units");
}
}