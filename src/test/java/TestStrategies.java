import com.example.delivery.DHLDelivery;
import com.example.delivery.Delivery;
import com.example.delivery.PostDelivery;
import com.example.payment.CreditPayment;
import com.example.payment.PayPalPayment;
import com.example.payment.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestStrategies {
    @Test
    public void testDelivery(){
        Delivery dhlDelivery = new DHLDelivery();
        Delivery postDelivery = new PostDelivery();

        Assertions.assertEquals(dhlDelivery.getId(), "0");
        Assertions.assertEquals(dhlDelivery.getDescription(), "default DHLDelivery description");
        Assertions.assertEquals(postDelivery.getDescription(), "default PostDelivery description");
        Assertions.assertEquals(postDelivery.getId(), "0");

        dhlDelivery = new DHLDelivery("new DHLDelivery description", "1");
        postDelivery = new PostDelivery("new PostDelivery description", "1");

        Assertions.assertEquals(dhlDelivery.getId(), "1");
        Assertions.assertEquals(dhlDelivery.getDescription(), "new DHLDelivery description");
        Assertions.assertEquals(postDelivery.getDescription(), "new PostDelivery description");
        Assertions.assertEquals(postDelivery.getId(), "1");
    }

    @Test
    public void testDelivery2(){
        Delivery dhlDelivery = new DHLDelivery();
        Delivery postDelivery = new PostDelivery();

        Assertions.assertEquals(dhlDelivery.deliver(null), "Delivery by DHLDelivery is successful");
        Assertions.assertEquals(postDelivery.deliver(null), "Delivery by Post is successful");
    }

    @Test
    public void testPayment(){
        Payment creditPayment = new CreditPayment();
        Payment payPalPayment = new PayPalPayment();

        Assertions.assertEquals(creditPayment.getName(), "Name0");
        Assertions.assertEquals(creditPayment.getDescription(), "default CreditPayment description");
        Assertions.assertEquals(payPalPayment.getName(), "Name0");
        Assertions.assertEquals(payPalPayment.getDescription(), "default PayPalPayment description");

        creditPayment = new CreditPayment("oles.@gmail.com", "new CreditPayment description");
        payPalPayment = new PayPalPayment("sviatoslav.@gmail.com", "new PayPalPayment description");

        Assertions.assertEquals(creditPayment.getName(), "oles.@gmail.com");
        Assertions.assertEquals(creditPayment.getDescription(), "new CreditPayment description");
        Assertions.assertEquals(payPalPayment.getName(), "sviatoslav.@gmail.com");
        Assertions.assertEquals(payPalPayment.getDescription(), "new PayPalPayment description");

    }

    @Test
    public void testPayment2(){
        Payment creditPayment = new CreditPayment();
        Payment payPalPayment = new PayPalPayment();

        Assertions.assertEquals(creditPayment.pay(0), "Payment by Credit Card is successful");
        Assertions.assertEquals(payPalPayment.pay(0), "Payment by PayPal is successful");

    }
}
