import java.util.*;
class Matrix
{float m[][]= new float[2][2];
 float d;
Matrix()
{
for(float x[]:m)
{for(float y:x)
{ 
y=0;
}
}
}
Matrix(float n[][])
{
m=n.clone();
}
Matrix(Matrix ob)
{
m=ob.m.clone();
}
void input(float n[][])
{
Scanner s = new Scanner(System.in);

System.out.println("Enter the elements of the 2x2 matrix:");
for(float x[]:n)
{for(float y:x)
{ 
y=s.nextInt();
}
}

}
float determinant()
{
 d=(m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
return d;
}
void swap_inverse(Matrix ob)
{
float temp=ob.m[0][0];
ob.m[0][0]=ob.m[1][1];
ob.m[1][1]=temp;
ob.m[0][1]*=-1;
ob.m[1][0]*=-1;
}
boolean is_Singular(Matrix ob)
{
if(d==0)
return true;
else
return false;
}
void inverse(Matrix ob)
{
if(is_Singular(ob))
{
System.out.println("Inverse not posibble");
return;
}
else {
float dr=(float)1/d;
swap_inverse(ob);
for(float x[]:ob.m)
{for(float y:x)
{ 
y*=dr;;
}
}
} }
void print()
{
System.out.println("The contents of the matrix are:");
for(float x[]:m)
{for(float y:x)
{ 
System.out.println(y);
}
}
}
}

class MatrixDemo
{

public static void main(String args[])
{
Scanner s = new Scanner(System.in);
Matrix ob1 = new Matrix();
ob1.print();
System.out.println("The determinant is :"+ob1.determinant());
System.out.println("The matrix is now being inverted.");
ob1.inverse(ob1);
float n[][]=  {{1,2},{3,4}};

Matrix ob2 = new Matrix(n);
ob2.print();
System.out.println("The determinant is :"+ob2.determinant());
ob2.inverse(ob2);
System.out.println("The matrix is now inverted.");
ob2.print();

Matrix ob3 = new Matrix(ob2);
ob3.print();
System.out.println("The determinant is :"+ob3.determinant());
ob3.inverse(ob3);
System.out.println("The matrix is now inverted.");
ob3.print();

}
}