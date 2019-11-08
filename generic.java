import java.util.*;
class generics<T,V>{
T t;V v;
void getob(T t,V v){
this.t=t;
this.v=v;
}
void display(){
System.out.println("Value of type T= "+t);
System.out.println("Value of type V= "+v);
}
}

class generic{
public static void main(String args[]){
generics<Integer,String> obj= new generics<Integer,String>();
obj.getob(5,"Hello");
obj.display();
}
}