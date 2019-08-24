import java.util.*;
class Student
{ 

 String name,usn;int[] c,mk,g;int n,tc=0;    
 int score(int m)
{
	if (m >= 90)
	return 10;
	else if (m >= 75 && m < 90)
	return 9;
	else if (m >= 60 && m < 75)
	return 8;
	else if (m >= 50 && m < 60)
	return 7;
	else if (m >= 40 && m < 50)
	return 6;
	else 
	return 0; 
}

 void input()
 {
 	Scanner s=new Scanner(System.in);
 	System.out.println("Enter the name of student :");
 	name=s.next();
 	System.out.println("Enter usn of student:");
 	usn=s.next;
 	System.out.println("Enter number of subjects:");
 	n=s.nextInt();
 	c=new int[n];
 	mk=new int[n];
 	g=new int[n];
 	for(int i=0;i<n;i++)
 	{
 		System.out.println("Enter the marks in subject "+(i+1));
 		mk[i]=s.nextInt();
        g[i]=score(mk[i]);
 		System.out.println("Enter the number of credits for subject"+(i+1));
 		c[i]=s.nextInt();
 		tc+=c[i];
 	}

 }
 float sgpa(int[] a,int[] b)
 {   
    float c=0;
    for(int i=0;i<n;i++)
    {
       c+= a[i]*b[i];
    }
    c/=tc;
    return c;

 }
 void display()
 {
 	float f=sgpa(int[] mk,int[] c);
 	System.out.println("The name of the student is :"+name);
 	System.out.println("The usn of the student is :"+usn);
 	System.out.println("The SGPA of the student is:"+f);
 }
 public static void main(String[] args) {
   
   
   Student s1 = new Student();
   s1.input();
   s1.display();




 }
}