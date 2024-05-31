package boi.com;
class Account
{ String name="pratiti";
int Accountno=12345;
int balance=10000;
public void display()
{
	System.out.println("\nEmpname:" +name+ "\nEmp account number:" +Accountno+"\n balance:" +balance);
	
}
}
class Fd extends Account
{
	int loan=1000;
	public void displayloan()
	{
		int availablebalance = balance-loan;
		System.out.println("my loan amount is"+availablebalance);
	}
}


public class Sinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fd emp1=new Fd();
emp1.display();
emp1.displayloan();
	}

}
