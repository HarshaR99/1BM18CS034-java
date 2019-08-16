import java.util.*;
class ForEach
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of rows and columns");
     int r=sc.nextInt();
     int c=sc.nextInt();
     int a[][]=new int[r][c];
     System.out.println("Enter the elements");
     for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        a[i][j]=sc.nextInt();
 
     int max=a[0][0];
     for(int a2[]:a){
      for(int ele:a2){
        if(ele>max){
           max=ele;
          } } }
      System.out.println("the greatest element="+max);
   } 
}