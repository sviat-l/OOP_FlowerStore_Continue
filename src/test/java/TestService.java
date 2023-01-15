import com.example.Service.Order;
import com.example.delivery.DHLDelivery;
import com.example.delivery.PostDelivery;
import com.example.payment.CreditPayment;
import com.example.payment.PayPalPayment;
import com.example.store.CactusFlower;
import com.example.store.Flower;
import com.example.store.RomashkaFlower;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestService {

    @Test
    public void testBasicService() {
        Order order = new Order();
        order.setDeliveryStrategy(new DHLDelivery());
        order.setPaymentStrategy(new CreditPayment());
        order.processOrder();
    }

    @Test
    public void testBasicService2() {
        Order order = new Order();
        order.setDeliveryStrategy(new PostDelivery());
        order.setPaymentStrategy(new PayPalPayment());
        order.addItem(new Flower("Rose", 10, 100, "white"));
        order.addItem(new Flower("Tulip", 5, 100, "red"));
        order.processOrder();
    }

    @Test
    public void testBasicService3() {
        Order order = new Order();
        order.setDeliveryStrategy(new PostDelivery("Destination Ukraine", "112"));
        ;
        order.setPaymentStrategy(new PayPalPayment("Sviatoslav", "svait@gmail.com"));
        order.addItem(new Flower("Rose", 10, 100, "white"));
        order.addItem(new Flower("Tulip", 5, 100, "red"));
        order.processOrder();
    }

    @Test
    public void testOrders() {
        Order order = new Order();
        order.setDeliveryStrategy(new DHLDelivery("Destination: Lviv, 790880", "112"));
        ;
        order.setPaymentStrategy(new PayPalPayment("Oleh", "oleh@gmail.com"));
        order.addItem(new Flower("Rose", 10, 100, "white"));
        order.addItem(new RomashkaFlower("Romashka", 5, 100));
        order.addItem(new CactusFlower("Cactus", 5, 100));

        Assertions.assertFalse(order.isProcessed());
        order.processOrder();
        Assertions.assertTrue(order.isProcessed());
    }

    @Test
    public void testOrdersAll() {
        Order order = new Order();
        order.setDeliveryStrategy(new PostDelivery("Destination: Lviv, 790880", "112"));
        ;
        order.setPaymentStrategy(new CreditPayment("Oleh", "123456789"));
        order.addItem(new Flower("Rose", 10, 100, "white"));
        order.addItem(new RomashkaFlower("Romashka", 5, 100));
        order.addItem(new CactusFlower("Cactus", 5, 100));

        Assertions.assertFalse(order.isProcessed());
        String result = order.processOrder().get(0);
        Assertions.assertTrue(order.isProcessed());
        Assertions.assertEquals("Payment by Credit Card is successful", result);

        Order order2 = new Order();
        order2.setDeliveryStrategy(new PostDelivery("Destination: Lviv, 790880", "112"));
        order2.setPaymentStrategy(new PayPalPayment("Oleh", "noemail"));

        order2.addItem(new Flower("Rose", 10, 100, "white"));

        List<String> result2 = order2.processOrder();
        Assertions.assertTrue(order2.isProcessed());
        Assertions.assertEquals("Payment by PayPal is successful", result2.get(0));
        Assertions.assertEquals("Delivery by Post is successful", result2.get(1));
    }
}
