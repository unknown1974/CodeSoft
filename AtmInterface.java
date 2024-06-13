import java.util.*;

public class AtmInterface{
	Scanner sc = new Scanner(System.in);
	public static int balance = 1000;		//Default Balance In Every Account
	public void Withdraw(){
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount You Want to Withdraw : ");
		int amount = sc.nextInt();
		if(balance < amount){
			System.out.println("\nInsuffcient Balance!!\nPlease Check Your Balance.\n");
		}
		else{
			balance -=amount;
			System.out.println("\nWithdraw Successfull\n");
		}
	}
	
	public void Deposit(){
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount you want to Deposit : ");
		int deposit = sc.nextInt();
		balance+=deposit;
		System.out.println("\nDeposit Successfull\n");
	}
	
	public void Check_Balance(){
		System.out.println("\nYour Balance is : "+balance+"\n");
	}
		
	public static void main(String  args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Of Osmania University");
		AtmInterface a = new AtmInterface();
		while(true){
			System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				a.Withdraw();
				break;
			case 2:
				a.Deposit();
				break;
			case 3:
				a.Check_Balance();
				break;
			case 4:
				System.out.println("Thank You.");
				break;
			default:
				System.out.println("Please Enter a valid Input");
			}
			if(choice == 4)
				break;
		}
	}
}
