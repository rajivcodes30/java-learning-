import java.util.Scanner;
 
public class ATM {
  public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);

     int balance =5000;
      
     System.out.println("==== ATM MENU ====");
     System.out.println("1. Check Balance");
     System.out.println("2. Withdraw Money");
     System.out.println("3. Deposit Money");
     System.out.println("4. Exit");
      
     System.out.println("Enter your choice: ");
     int choice = sc.nextInt();

        switch(choice){
          case 1:
            System.out.println("Your balance is: " + balance);
            break;
          case 2:
            System.out.println("Enter amount to withdraw: ");
            int withdrawAmount = sc.nextInt();
            if (withdrawAmount <= balance){
                balance -= withdrawAmount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
            break;
          case 3:
            System.out.println("Enter amount to deposit: ");
            int depositAmount = sc.nextInt();
            balance += depositAmount;
            System.out.println("Deposit successful. New balance: " + balance);
            break;
          case 4:
            System.out.println("Thank you for using the ATM. Goodbye!");
            break;
          default:
            System.out.println("Invalid choice. Please try again.");
        }

  }
}
