import java.util.*;
class SemiPrime
{
int half,count;
boolean isPrime(int n)
{
 int half = n/2;

 for(int i=2;i<=half;i++)
{
if(n%i==0)
return false;
}
return true;
}
boolean isSemiPrime(int n)
{
half=n/2;
int count=0;
for(int i=2;i<=half;i++)
{
if(n%i==0&&isPrime(i))
count++;
if(count>1)
return true;
}
return false;
}
boolean isSumofSemiPrime(int n)
{
count =0;
for(int i=2;i<n-1;i++)
{
for(int j=n-1;j>=2;j--)
{
if((i+j)==n&&isSemiPrime(i)&&isSemiPrime(j))
return true;
}
}
return false;
}
}
class SemiPrimeDemo
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
SemiPrime ob = new SemiPrime();
int ch=1,n;
do{
System.out.println("Enter the value :");
n=s.nextInt();
if(ob.isSumofSemiPrime(n))
System.out.println(n+" is a sum of semi prime numbers.");
else
System.out.println(n+" is not a sum of semi prime numbers.");
System.out.println("Enter 1 to continue,any other key to exit.");
ch=s.nextInt();
}while(ch==1);
System.out.println("End of program");
}
}