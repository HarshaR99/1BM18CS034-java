import java.util.*;
class Threadsort2
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter no of elements");
	int n=se.nextInt();
	int a[]=new int[n];
	int i;
	System.out.println("Elements are");
	for(i=0;i<n;i++)
		a[i]=se.nextInt();
	Thread1 t =new Thread1(a);
	Thread2 t1 =new Thread2(a);
}
}


class Thread1 implements Runnable
{
	int arr[],temp;
	Thread t;
	Thread1(int a[])
	{
		t=new Thread(this,"Thread1");
		t.start();
		arr=new int[a.length];
		for(int i=0;i<a.length;i++)
		arr[i]=a[i];
	}
	public void run()
	{
		int i,j;	
		
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				System.out.println("Ascending thread Caught");
			}
}
			
		}	
		System.out.println("Elements in ascending order are");
	for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);		
			
		
	}
}
class Thread2 implements Runnable
{
	int ar[],temp;
	Thread t;
	Thread2(int a[])
	{
		t=new Thread(this,"Thread2");
		t.start();
		ar=new int[a.length];
	
        ar=a;
	}
	 public void run()
	{
		int i,j;
		
			for(i=0;i<ar.length-1;i++)
		{
			for(j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]<ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
try
		{
			Thread.sleep(50);
		}
		catch(InterruptedException e)
		{
			System.out.println("Descending thread Caught");
		}					

}
			

}	
		
		System.out.println("Elements in descending order are");
	for(i=0;i<ar.length;i++)
		System.out.println(ar[i]);	
			
		
		}
	
}
