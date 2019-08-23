import java.util.*;
class employee
{
    String num,nm;
    double b,da,it,net,gross;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee Name:");
        nm=sc.next();
        System.out.println("Enter the employee Number:");
        num=sc.next();
        System.out.println("Enter the employee Basic Salary:");
        b=sc.nextDouble();
    }
    void calculate()
    {
        da=(75*b)/100;
        gross=b+da;
        it=(30*gross)/100;
        net=b+da-it;
    }
    void display()
    {
        System.out.println("Enter the employee Name:"+nm);
        System.out.println("Enter the employee Number:"+num);
        System.out.println("Enter the employee Basic Salary:"+b);
        System.out.println("Enter the employee DA:"+da);
        System.out.println("Enter the employee IT:"+it);
        System.out.println("Enter the employee Net Salary:"+net);
    }
}
class emp
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        employee ob=new employee();
        System.out.println("Enter the number of employees");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {   
            ob.read();
            ob.calculate();
            ob.display();
        }
    }
}
