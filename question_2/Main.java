package question_2;
// Abstract class 
abstract class paymentMethod{
    public abstract void processPayment (double amount);
}
//subclass for creditcard
class creditCard extends paymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing $" + amount + "...payment through Credit Card.");

    }
}
// subclass for paypal
class payPal extends paymentMethod{
    @Override
    public void processPayment (double amount) {
        System.out.println("Processing $" + amount + "...payment through payPal.");

    }
}
// Subclass for BankTransfer
class BankTransfer extends paymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing $" + amount + "...payment through Bank Transfer.");

    }
}
//Payment processor class 
class paymentProcessor {
    public void process(paymentMethod paymentMethod, double amount){
        paymentMethod.processPayment(amount);
    }
}
//main class
public class Main {
    public static void main(String[] args){
        //create payment method instances 
        paymentMethod creditcard = new creditCard();
        paymentMethod payPal = new payPal();
        paymentMethod banktransfer = new BankTransfer();

        //create a paymentprocessror
        paymentProcessor processor = new paymentProcessor();

        //process payments 
        processor.process(creditcard,100.50 );
        processor.process(payPal, 200.75);
        processor.process(banktransfer,500.00);

    }
    
}

/*Question 2
 * You are hired to design a payment processing system for an e-commerce application. 
 * The system should support multiple payment methods such as CreditCard, PayPal, 
 * and BankTransfer. Each payment method has its own way of processing a payment. 
 * The system should be flexible enough to allow the addition of new payment methods in the future
 *  without significant changes
 * 
 * Pseudo code****
 * 
 

1. Define abstract class PaymentMethod:
    - Abstract method: processPayment(amount)

2. Define CreditCard class (inherits PaymentMethod):
    - Implement processPayment(amount): print message for credit card payment

3. Define PayPal class (inherits PaymentMethod):
    - Implement processPayment(amount): print message for PayPal payment

4. Define BankTransfer class (inherits PaymentMethod):
    - Implement processPayment(amount): print message for bank transfer payment

5. Define PaymentProcessor class:
    - Method process(paymentMethod, amount):
        - Call paymentMethod.processPayment(amount)

6. In Main:
    - Create CreditCard, PayPal, and BankTransfer objects
    - Create PaymentProcessor object
    - Use processor to process payments with each payment method


 * 
 * 
 */
