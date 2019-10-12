import java.util.*;
class Student
{
	String name,usn,sem;
	int i;
	void getdata()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Name,Usn,Sem:");
		name = s.nextLine();
		usn = s.nextLine();
		sem = s.nextLine();
	}
	void display()
	{
		System.out.println("\nName:"+name+"\nUSN:"+usn+"\nSEM:"+sem);
	}
}
class Test extends Student
{
	float cie_marks[]=new float[10];
	float credit[]=new float[10];
	int n;
	void getdata()
	{
		
		super.getdata();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of subject:");
		n = s.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+"st Subject marks in CIE:");
			cie_marks[i]=s.nextFloat();
			System.out.println("Enter "+(i+1)+"st Subject credit:");
			credit[i]=s.nextFloat();
		}
	}
	void display()
	{
		super.display();
		for(i=0;i<n;i++)
		{
			System.out.println((i+1)+"st Subject marks:"+cie_marks[i]);
			System.out.println((i+1)+"st Subject credit:"+credit[i]);
		}
	}
}
class Exam extends Test
{
	float see_marks[]=new float[10];
	void getdata()
	{
		super.getdata();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter SEE marks of "+n+" Subjects");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+"st Subject marks:");
			see_marks[i]=s.nextFloat();
		}
	}
	void display()
	{
		super.display();
		for(i=0;i<n;i++)
		{
			System.out.println((i+1)+"st Subject marks:"+see_marks[i]);
		}
	}
}
class Result extends Exam
{
	float sgpa,total=0,tcredits=0;
	int points;
	void output()
	{
		for(i=0;i<n;i++)
		{
		tcredits+=credit[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.println("FOR Subject"+(i+1));
			if((((cie_marks[i]+see_marks[i])/2)>=90)&&(((cie_marks[i]+see_marks[i])/2)<=100))
		       {
				points=10;				
				System.out.println("Grade in Sub is S");
		       }
			else if((((cie_marks[i]+see_marks[i])/2)>=75)&&(((cie_marks[i]+see_marks[i])/2)<=89))
		       {
				points=9;				
				System.out.println("Grade in Sub is A");
		       }
			else if((((cie_marks[i]+see_marks[i])/2)>=60)&&(((cie_marks[i]+see_marks[i])/2)<=74))
			{
				points=8;
				System.out.println("Grade in Sub is B");
			}
			else if((((cie_marks[i]+see_marks[i])/2)>=40)&&(((cie_marks[i]+see_marks[i])/2)<=59))
			{
				points=7;
				System.out.println("Grade in Sub is C");
			}
			else
		       {
				points=0;
				System.out.println("Grade in Sub is F");
		       }
			total+=credit[i]*points;
		   	
		}
		sgpa=total/tcredits;
		System.out.println("Final SGPA:"+sgpa);
	}
}
class ResultDemo
{
	public static void main(String args[])
	{
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=in.nextInt();
		Result r[]=new Result[n];		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the details of student "+(i+1));
			r[i]=new Result();
			r[i].getdata();
			r[i].display();
			r[i].output();
		}
	}
}