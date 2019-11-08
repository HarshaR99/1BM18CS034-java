import java.util.*;
import CIE.*;
import SEE.*;
class StudentPkgDemo{
Student st;Internals it;External ex;int f_marks[] = new int[5];
void input(){
int marks[]=new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name:");
String name = sc.next();
System.out.println("Enter usn:");
String usn = sc.next();
System.out.println("Enter semester:");
String sem = sc.next();
 st = new Student(usn,name,sem);
System.out.println("Enter marks in CIE:");
for(int i=0;i<5;i++){
System.out.println("Mark in subject "+(i+1)+": ");
marks[i]=sc.nextInt();
f_marks[i]=marks[i];
}
it = new Internals(marks);
System.out.println("Enter marks in SEE");
for(int i=0;i<5;i++){
System.out.println("Mark in subject "+(i+1)+": ");
marks[i]=sc.nextInt();
f_marks[i]+=marks[i];
}
ex = new External(marks);
}
void output(){
System.out.println("Name :"+st.name);
System.out.println("USN :"+st.usn);
System.out.println("Semester :"+st.sem);
for(int i=0;i<5;i++)
System.out.println("Finals Marks in sbuject "+(i+1)+":"+f_marks[i]);
}
public static void main(String ags[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students:");
int n = sc.nextInt();
StudentPkgDemo obj[] = new StudentPkgDemo[n];
for(int i=0;i<n;i++){
System.out.println("Enter the details of student "+(i+1)+":");
obj[i]=new StudentPkgDemo();
obj[i].input();
}
for(int i=0;i<n;i++)
obj[i].output();
}
}