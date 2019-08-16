import java.util.*;
class Sorth
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n;
   System.out.println("Enter the number of array elements");
   n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter the elements");
   for(int i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   {
     for(int j=i;j<n-i-1;j++)
      {
        if(a[j]>a[j+1])
         {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
         }
      }
   }
   System.out.println("the sorted array is");
   for(int i=0;i<n;i++)
   System.out.println(a[i]);
  }
}