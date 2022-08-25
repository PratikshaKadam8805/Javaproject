package simplebankingapplication;

import java.util.Scanner;

public class Bank {

	private int customerId;
	private int accno;
	private String name;
	private String acc_type;
	private double acc_balance;
	private String address;
	
	Scanner sc=new Scanner(System.in);
	public Bank()
	{
		
	}
	public Bank(int customerId, int accno, String name, String acc_type, double acc_balance, String address,
			Scanner sc) {
		super();
		this.customerId = customerId;
		this.accno = accno;
		this.name = name;
		this.acc_type = acc_type;
		this.acc_balance = acc_balance;
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private int amount;
	public void createAccount()
	{
		System.out.println("\nEnter Account Holder's  Details: ");
		System.out.println("Enter Account Holder's ID:= ");
		customerId = sc.nextInt();
		
		System.out.println("Enter the Account Number:= ");
		accno = sc.nextInt();
		
		System.out.println("Enter Account Holder Name:= ");
		name = sc.next();
		
		System.out.println("Enter Account Type:= ");
		acc_type = sc.next();
		
		System.out.println("Enter Account Holder Address:= ");
		address = sc.next();
		
		long amount;
		System.out.println("Enter opening Account Balance:= ");
		 amount= sc.nextLong();
		if(amount<=2000)
        {
           System.out.println("Your first amount of deposit should be greater than 2000:");
 
           System.out.println("Enter again amount which is greater than 2000");
           int amt=sc.nextInt();
           amount = amt+amount;
           System.out.println(""+amount);
           if(amount>=2000) {
        	   System.out.println("This is the good Amount:");
           }
        }  
        else
        {
        acc_balance =acc_balance + amount;  
        System.out.println("your current balance in account is:" +acc_balance);
        }
    } 
	public  void showAccount()
	{
		//System.out.println("Enter Account Number:= ");
		System.out.println("Name of account holder: " +name);  
		System.out.println("Customer ID: " +customerId);
        System.out.println("Account Number: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " +acc_balance);
	}
	public boolean searchAccount(int ac_no)
    {  
        if (accno==(accno)) 
        {  
            showAccount();  
            return (true);  
        }  
        return (false);
    }
	public void withdraw()
	{
		showAccount();

		System.out.println("Enter Amount you want to Withdraw:");
		int withdrawal = sc.nextInt();
		if(acc_balance >= withdrawal)
		{
			//System.out.println(name+"withdraw "+withdrawal);
			acc_balance = acc_balance - withdrawal;
			System.out.println(acc_balance);
			System.out.println("Amount withdraw Successfully...");
		}
		else {
			System.out.println(name+" You can not withdraw "+withdrawal);
			System.out.println(" Your balance is: "+acc_balance);
			
		}
	}
	public void deposit()
	{
		//showAccount();
		long deposit = 0;
    	System.out.println("Enter the amount you want to deposit:");
    	deposit = sc.nextLong();
    	acc_balance = acc_balance + deposit;   
    	System.out.println("Amount Deposited Successfully...");
    	System.out.println("Your current Balance : " + acc_balance);
	}
	public double checkbalance()
	{
		return acc_balance;
		
	}
	public boolean search() {
		return false;
	}
	@Override
	public String toString() {
		return "Bank [customerId=" + customerId + ", accno=" + accno + ", name=" + name + ", acc_type=" + acc_type
				+ ", acc_balance=" + acc_balance + ", address=" + address + "]";
	}	
}