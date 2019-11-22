class Thread1 implements Runnable
{
Thread t;
Thread1(){
t=new Thread(this,"lol1");
t.start();
}
public void run(){
for(int i=0;i<5;i++){
System.out.println("BMSCE");
try{
Thread.sleep(1000);
}
catch(InterruptedException e){}
}
}
}

class Thread2 implements Runnable
{
Thread t;
Thread2(){
t=new Thread(this,"lol2");
t.start();
}
public void run(){
for(int i=0;i<5;i++){
System.out.println("CSE");
try{
Thread.sleep(1000);
}
catch(InterruptedException e){}
}
}
}

class ThreadDemo{
public static void main(String args[]){
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();
}
}
