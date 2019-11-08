import java.util.*;

class WrongAge extends Exception{
String msg;
WrongAge(String msg){
this.msg=msg;
}
public String toString(){return msg;}
}

class Father{
int age_fath;
Father()
{
Scanner sc = new Scanner(System.in);
 try{
 System.out.println("Enter age of Father:");
  age_fath=sc.nextInt();
if(age_fath<0)
throw new WrongAge("NegativeAgeExcption");
}
catch(WrongAge e){System.out.println(e);}
}
}

class Son extends Father{
int age_son;
Son()
{
super();
Scanner sc = new Scanner(System.in);
 try{
age_son=sc.nextInt();
if(age_son<0)
throw new WrongAge("NegativeAgeExcption");
}
catch(WrongAge e){System.out.println(e);}
}
void checkage() throws WrongAge{
if(age_fath<age_son)
throw new WrongAge("IllegalAgeException");
 System.out.println("Ages are legal");
}
}

class ExceptionDemo{
public static void main(String agrs[]){
Son obj = new Son();
try{
 obj.checkage();
}
 catch(WrongAge e){
 System.out.println(e);
 }
}
}

