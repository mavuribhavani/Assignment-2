abstract class PaymentMethod {
    abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        double fee = amount * 0.02; 
        System.out.println("Processing Credit Card Payment of ₹" + amount);
        System.out.println("Transaction Fee: ₹" + fee);
        System.out.println("Total Deducted: ₹" + (amount + fee));
    }
}

class PayPal extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of ₹" + amount);
        System.out.println("No additional transaction fee.");
    }
}

public class OnlinePayment {
    static void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount); 
        System.out.println("\n");
    }

    public static void main(String[] args) {
        PaymentMethod card = new CreditCard();
        PaymentMethod paypal = new PayPal();

        processTransaction(card, 8000);   
        processTransaction(paypal, 3000); 
    }
}



