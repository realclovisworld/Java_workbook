package question_6;

import java.util.Scanner;

public class FundTransfer{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    try{
        //input:Senders account balance
        System.out.print("Enter senders account balance:");
        double accountBalance = scanner.nextDouble();

        //Input: Transfer amount
        System.out.println("Enter transfer amount:");
        double transferAmount = scanner.nextDouble();

        //Perform the trsnsfer
        double updateBalance = transferFunds(accountBalance,transferAmount);

        //if no exceptions are thrown,display the updated balance
        System.out.println("Transfer successful! Update balance: $" + updateBalance);

    }
    catch(IllegalArgumentException e){
        System.out.println("Error: " + e.getMessage());

    }
    catch(ArithmeticException e){
        System.out.println("Error:" + e.getMessage());

    }
    catch(SecurityException e){
        System.out.println("Error:" + e.getMessage());

    }
    finally{
        System.out.println("Transaction process completed.");
    }
    scanner.close();

    }

public static double transferFunds(double accountBalance, double transferAmount){
    //Check if the transfer is positive 
    if(transferAmount<=0){
        throw new IllegalArgumentException("Transfer amount must be greater than zero.");

    }
    //check if the transfer amount exceeds the account balance
    if(transferAmount>accountBalance)
    {
        throw new ArithmeticException("Insuficient balance for the transfer.");

    }
    //check if the transfer amount exceeds $10,000
    if (transferAmount>10000) {
        throw new SecurityException("Transfer amount exceeds the maximum limit of $10,000.");

        
    }
    //Deduct the transfer amount from the account balance
    return accountBalance - transferAmount;
    }
    
}

/**
* Method to handle fund transfer logic.
*
* @param accountBalance The sender's current account balance.
* @param transferAmount The amount to transfer.
* @return The updated account balance after a successful transfer.
* @throws IllegalArgumentException if the transfer amount is not positive.
* @throws ArithmeticException if the account balance is insufficient.
* @throws SecurityException if the transfer amount exceeds the limit.

Question 6
A software company has developed an application that manages user accounts. 
The application has a feature to transfer funds between accounts. However, 
the system must handle several situations, including invalid input, insufficient balance, 
and maximum transfer limits.


pseudocode****
Start program

Prompt user to enter sender's account balance

Read account balance

Prompt user to enter transfer amount

Read transfer amount

Try to perform fund transfer: a. Call transferFunds(accountBalance, transferAmount) b. If no exception, print "Transfer successful! Updated balance: $" + updated balance

Catch exceptions: a. If IllegalArgumentException, print error message b. If ArithmeticException, print error message c. If SecurityException, print error message

Finally, print "Transaction process completed."

Close scanner

Function: transferFunds(accountBalance, transferAmount) a. If transferAmount <= 0, throw IllegalArgumentException ("Transfer amount must be greater than zero.") b. If transferAmount > accountBalance, throw ArithmeticException ("Insufficient balance for the transfer.") c. If transferAmount > 10,000, throw SecurityException ("Transfer amount exceeds the maximum limit of $10,000.") d. Return accountBalance - transferAmount
*/

