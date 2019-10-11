import java.util.*;
abstract class Account{
private String cust_name,acc_no,type;
protected double balance;
void input(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter name of customer :");
cust_name=sc.next();
System.out.println("Enter the account number :");
acc_no=sc.next();
System.out.println("Enter the type of account :");
type=sc.next();
System.out.println("Enter the balance:");
balance=sc.nextDouble();
}
void display(){
System.out.println("Name : "+cust_name);
System.out.println("Account number : "+acc_no);
System.out.println("Type of account :"+type);
}
abstract void display_balance();
abstract void deposit();
abstract void withdrawal();
abstract void min_balance();
abstract void cheque();
abstract void c_intrest();
}

class Curr_acct extends Account{
private int min_bal=500,penalty=100;
void min_balance(){
if(balance>=min_bal)
return;
else{
balance-=penalty;
System.out.println("Please maintain minumum balance.Penalty imposed.");
}}
void display_balance(){
System.out.println("The balance is :"+balance);
}
void deposit(){
System.out.println("Enter Deposit Amount:");
Scanner sc = new Scanner(System.in);
balance+=sc.nextLong();
}
void cheque(){
Scanner s = new Scanner(System.in);
System.out.print("Enter the name of Beneficiary user name : ");
String beneficiary = s.next();
System.out.print("Enter the Cheque Amount : ");
double cheque_amount = s.nextDouble();
if(cheque_amount >= balance){
System.out.println("Cheque Amount exceeds Balance!!");
}
else{
balance = balance - cheque_amount;
min_balance();
}
}
void withdrawal(){
System.out.println("Enter the amount you want to withdraw");
Scanner sc = new Scanner(System.in);
long w = sc.nextLong();
if(w<=balance){
balance-=w;
System.out.println("Withdrawal Successful");
min_balance();
}
else
System.out.println("Sorry!...Insufficient Funds");
}
void c_intrest(){}
}

class Sav_acct extends Account {
private float intrest = 5;
void c_intrest(){
balance = balance*(1+(intrest/100));
}
void cheque(){
System.out.println("Not allowed");
}
void display_balance(){
System.out.println("The balance is :"+balance);
}
void deposit(){
System.out.println("Enter Deposit Amount:");
Scanner sc = new Scanner(System.in);
balance+=sc.nextLong();
}
void min_balance(){}
void withdrawal(){
System.out.println("Enter the amount you want to withdraw");
Scanner sc = new Scanner(System.in);
long w = sc.nextLong();
if(w<=balance){
balance-=w;
System.out.println("Withdrawal Successful");
}
else
System.out.println("Sorry!...Insufficient Funds");
}

}
class Bank{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Account ref;
System.out.println("Savings or Current account (0/1)?");
int ch = sc.nextInt();
if(ch==0)
ref=new Curr_acct();
else
ref=new Sav_acct();
ref.input();
ref.min_balance();
ref.c_intrest();
System.out.println("Enter \n1 to deposit\n2 to withdraw\n3 to use chequebook\n4 to view balance\n5 to exit");
while(true){
System.out.println("Enter your choice:");
int ch2 = sc.nextInt();
switch(ch2){
case 1: ref.deposit();
ref.c_intrest();
break;
case 2:ref.withdrawal();
break;
case 3:ref.cheque();
break;
case 4:ref.display_balance();
break;
default:
System.exit(0);
}
System.out.println("Do you want to stop or continue,(0/1)?:");
int ch3=sc.nextInt();
if(ch3==0)
break;
}
ref.display();
}
}
