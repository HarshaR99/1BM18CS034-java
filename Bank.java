package DataBank;
import java.util.*;
public class Bank{
private String acc_no,name;
private long balance=0;
public void create(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter details to create account");
System.out.println("Enter your name:");
name=sc.next();
System.out.println("Enter the account number");
acc_no=sc.next();
System.out.println("Enter the balance");
balance=sc.nextLong();
}
public void deposit(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount to be deposited:");
balance+=sc.nextInt();
}
public void withdraw(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amout to be withdrawn");
int w = sc.nextInt();
if(w>balance)
System.out.println("Insufficient balance");
else
System.out.println("Amount is withdrawn successfully");
}
public void viewBalance(){
System.out.println("The available balance is :"+balance);
}
}
