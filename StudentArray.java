import java.util.*;
class Table
{

public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int sum1=0,avg1,sum2=0,avg2,i,j;
System.out.println("Enter the number of students:");
int m=s.nextInt()+2;
System.out.println("Enter the number of subjects;");
int n=s.nextInt()+2;
int t[][]= new int[m][n];
for( i=0;i<(m-2);i++)
{System.out.println("Enter details for student "+(i+1)+":");
for( j=0;j<(n-2);j++)
{
System.out.println("Enter marks in subject "+(j+1)+":");
t[i][j]=s.nextInt();
sum1+=t[i][j];
}
t[i][j++]=sum1;
t[i][j]=(int)sum1/(n-2);
}
for( j=0;j<(n-2);j++)
{
for( i=0;i<(m-2);i++)
{
sum2+=t[i][j];
}
t[i++][j]=sum2;
t[i][j]=(int)sum2/(m-2);
}
System.out.println("The data is given below");

for(i=0;i<m;i++)
{
if(i<=m-3)
System.out.print((i+1)+" :\t");
else
System.out.print("\t");
for(j=0;j<n;j++)
{
if(i>(m-3) && j>(n-3))
continue;
System.out.print(t[i][j]+"\t");
}
System.out.println();
}

}
}