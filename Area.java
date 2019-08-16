import java.util.*;
class Rectangle
{
  int length,width;
   Scanner sc=new Scanner(System.in);
   void rect()
   { 
     System.out.println("enter the length and width");
     length=sc.nextInt();
     width=sc.nextInt();
     double area=length*width;
     System.out.println("Area="+area);
     System.out.println("Length="+length);
     System.out.println("Width="+width);
    }
}
class Area
 {
    public static void main(String args[])
  {
    Rectangle rect1=new Rectangle();
    Rectangle rect2=new Rectangle();
    rect1.rect();
    rect2.rect();
}
}
