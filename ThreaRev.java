class threadDemo{
public static void main(){
new t1();
}
}

class t1 implements Runnable{
Thread t;
t1(){
t = new Thread(this,"");
t.start();
}

public void run(){
new t2();
try{
Thread.sleep(40);
}catch(Exception e){}
System.out.println("One");
}
}

class t2 implements Runnable{
Thread t;
t2(){
t = new Thread(this,"");
t.start();
}

public void run(){
new t3();
try{
Thread.sleep(20);
}catch(Exception e){}
System.out.println("Two");
}
}

class t3 implements Runnable{
Thread t;
t3(){
t = new Thread(this,"");
t.start();
}

public void run(){
System.out.println("Three");
}
}