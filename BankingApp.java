package simplebankingapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingApp {
	
		public static void main(String[] args)  {
		try {
			Bank b=new Bank();
			ArrayList<Bank> bank=new ArrayList<Bank>();
			Scanner sc=new Scanner(System.in);
			int ac_no;
			 boolean found = false;
			 int balance;
			 int choice;
			 System.out.println("====================================================================");
			 System.out.println("============= Simple Banking Application ===========================");
			 System.out.println("====================================================================");
			 System.out.println("==================BANK OF MAHARASHTRA===============================");
			 System.out.println("====================================================================");
			do
			{
				System.out.println("=================================================================");
				System.out.println(" 1. Create Account "
						+ "\n 2. Deposit Amount "
						+ "\n 3. Withraw Amount"
						+ "\n 4. Check Account Balance "
						+ "\n 5. Exit.");
	        	System.out.println("=================================================================");
	        		
			System.out.println("Enter your choice:= ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				b.createAccount();
					break;
						
			case 2: 
				System.out.print("Enter Account number:= ");  
				ac_no = sc.nextInt();  
					found = b.searchAccount(ac_no);
					if(found) {
							b.deposit();
							break;
					}
					if(!found) {
						System.out.println("Search failed!Account doesn't exist..!!");
					}
					break;
					
			case 3:
				System.out.print("Enter account number:= ");  
				ac_no = sc.nextInt();  
				b.withdraw();
					break;
					
			case 4:
				System.out.println("Enter Account Number:= ");
				ac_no = sc.nextInt();
				b.showAccount();
				if(found) {
						break;
					}
				if(!found) {
					System.out.println("Search failed! Account doesn't exist...!!");	
				}
				break;
				
			default:
				System.out.println("Operations are Done Successful......");
				System.out.println("See you soon...");
				break;
			}
		}while(choice!=5);
			
			sc.close();
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}