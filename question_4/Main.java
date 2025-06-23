package question_4;
//Payments interface
interface Payment{
    void processPayment(double amount);
}

//Credit Card Payment class
class CreditCardPayment implements Payment{
    private String cardNumber;
    private String cvv;

    //constructor
    public CreditCardPayment(String cardNumber,String cvv){
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    //Getter methods (encapsulated access to  sensitive data)
    public String getCardNumber(){
        return cardNumber;
    }
    public String getCvv(){
        return cvv;
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of $" + amount);
        }
}
//Debit Card Payment class
class DebitCardPayment implements Payment{
    private String cardNumber;
    private String pin;

    //constructor
    public DebitCardPayment(String cardNumber,String pin){
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
    //Getter methods(encapsulated access to sensitive data)
    public String getCardNumber(){
        return cardNumber;
    }
    public String getPin(){
        return pin;
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Processing debit card payments of $" + amount );

    }
}
//Dgitial wallet payments class
class DigitalWalletPayment implements Payment{
    private String walletId;
    private String password;

    //constructor
    public DigitalWalletPayment(String walletId,String password){
        this.walletId = walletId;
        this.password = password;
    }
    // Getter methods (encapsulated access to sensitive data)
    public String getWalletId(){
        return walletId;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Processing digital wallet payment of $" + amount);

    }
}
//Payment processor class
class PaymentProcessor{
    public void process(Payment payment,double amount){
        payment.processPayment(amount);
    }
}
//Main class
public class Main{
    public static void main(String[] args){
        //create payment methods
        Payment creditCard = new CreditCardPayment("1234567890123456","123");
        Payment debitCard = new DebitCardPayment("9876543210987654","4567");
        Payment digitalWallet = new DigitalWalletPayment("wallet123","pasword");

        //create payment processor
        PaymentProcessor processor = new PaymentProcessor();

        //process payments
        processor.process(creditCard, 100.50);
        processor.process(debitCard, 200.75);
        processor.process(digitalWallet, 300.00);
    }
}

/*Questions 4
A tech company wants to build a Payment Processing System that supports multiple payment methods 
such as Credit Card, Debit Card, and Digital Wallet. To ensure flexibility and security, 
the company has the following requirements:
 * 
 * 
 * Pseudocode***

1. Define Payment interface:
    - Method: processPayment(amount)

2. Define CreditCardPayment class (implements Payment):
    - Attributes: cardNumber, cvv
    - Constructor to set cardNumber and cvv
    - Getter methods for cardNumber and cvv
    - Implement processPayment(amount): print credit card payment message

3. Define DebitCardPayment class (implements Payment):
    - Attributes: cardNumber, pin
    - Constructor to set cardNumber and pin
    - Getter methods for cardNumber and pin
    - Implement processPayment(amount): print debit card payment message

4. Define DigitalWalletPayment class (implements Payment):
    - Attributes: walletId, password
    - Constructor to set walletId and password
    - Getter methods for walletId and password
    - Implement processPayment(amount): print digital wallet payment message

5. Define PaymentProcessor class:
    - Method process(payment, amount):
        - Call payment.processPayment(amount)

6. In Main:
    - Create CreditCardPayment, DebitCardPayment, and DigitalWalletPayment objects
    - Create PaymentProcessor object
    - Use processor to process payments with each payment method

 */