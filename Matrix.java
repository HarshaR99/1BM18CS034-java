import java.util.*;
class Matrix
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int r,c;
   System.out.println("enter the number of rows and columns");
   r=sc.nextInt();
   c=sc.nextInt();
   int a[][]=new int[r][c];
   int b[][]=new int[r][c];
   int add[][]=new int[r][c];
   int sub[][]=new int[r][c];
   System.out.println("Enter the elements for array A");
    for(int i=0;i<r;i++)
     for(int j=0;j<c;j++)
      a[i][j]=sc.nextInt();
  System.out.println("Enter the elements for array B");
     for(int i=0;i<r;i++)
     for(int j=0;j<c;j++)
      b[i][j]=sc.nextInt();
  for(int i=0;i<r;i++)
   for(int j=0;j<c;j++)
   {
    add[i][j]=a[i][j]+b[i][j];
    sub[i][j]=a[i][j]-b[i][j];
   }
   System.out.println("addition matrix");
   for(int i=0;i<r;i++)
   { 
     for(int j=0;j<c;j++)
       System.out.print(add[i][j]+"\t");
    System.out.println();
  }
   System.out.println("subraction array");
       for(int i=0;i<r;i++)
   { 
     for(int j=0;j<c;j++)
       System.out.print(sub[i][j]+"\t");
    System.out.println();
  }
}
}
      