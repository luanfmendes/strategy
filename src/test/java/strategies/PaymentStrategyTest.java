package strategies;

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentStrategyTest {
    @Test
    public void testCreditCardPayment() {
        PaymentStrategy strategy = new CreditCardPayment("1234-5678-9012-3456");
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(strategy);
        assertDoesNotThrow(() -> context.executePayment(100.0));
    }

    @Test
    public void testPayPalPayment() {
        PaymentStrategy strategy = new PayPalPayment("user@example.com");
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(strategy);
        assertDoesNotThrow(() -> context.executePayment(200.0));
    }

    @Test
    public void testBankTransferPayment() {
        PaymentStrategy strategy = new BankTransferPayment("987654321");
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(strategy);
        assertDoesNotThrow(() -> context.executePayment(300.0));
    }

    @Test
    public void testPaymentStrategyNotSet() {
        PaymentContext context = new PaymentContext();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> context.executePayment(100.0));
        assertEquals("Payment strategy is not set.", exception.getMessage());
    }
}
