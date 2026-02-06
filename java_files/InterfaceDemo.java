interface Payment {
    void makePayment(double amount) throws Exception;
}

class CreditCardPayment implements Payment {
    public void makePayment(double amount) throws Exception {
        if (amount <= 0)
            throw new Exception("Invalid amount");
        System.out.println("Credit card payment: " + amount);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        try {
            Payment p = new CreditCardPayment();
            p.makePayment(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
