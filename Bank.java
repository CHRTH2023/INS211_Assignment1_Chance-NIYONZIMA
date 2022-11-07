package check1;
import java.util.*;
class Account{
public String accountOwner,accountNumber;
public double balance;
}
class Saving extends Account{
int period;
int rate;
double interest;
Saving(int period, int rate, double interest) {
this.period=period;
this.rate=rate;
this.interest=interest;
}
public String toString() 
{
	return period+""+rate+""+interest;
}
Scanner sc = new Scanner(System.in);
public void record()
{
	System.out.print("Enter the account number: ");
	accountNumber=sc.nextLine();
	System.out.print("Enter Account Owner :");
	accountOwner=sc.nextLine();
	System.out.print("Enter the balance: ");
	balance=sc.nextDouble();
}
public void interest()
{
	System.out.print("Dear " +accountOwner+" Enter your period in terms of years: ");
	period=sc.nextInt();
	System.out.print("Enter your rate %: ");
	rate=sc.nextInt();
	interest=(balance*rate*period)/100;
	System.out.println("Dear"+accountOwner+"Your interest is: "+interest+"in "+period+" Year(s)");
}
}
public class Bank {
		public static void main(String[] args) {
		Saving obj = new Saving(0, 0, 0);
		obj.record();
		obj.interest();
		}
		
}
