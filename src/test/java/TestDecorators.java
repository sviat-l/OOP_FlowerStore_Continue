import com.example.decorators.BasketDecorator;
import com.example.decorators.PaperDecorator;
import com.example.decorators.RibbonDecorator;
import com.example.store.Flower;
import com.example.store.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDecorators {
    Item exampleItem1 = new Flower("flower", 10, 20, "red");
    Item exampleItem2 = new Flower("", 1, 100, "violet");
    Item exampleItem3 = new Flower("random text", 0, 1, "black");

    @Test
    public void testBasketDecorator(){
        BasketDecorator basketDecorator = new BasketDecorator(exampleItem1);

        Assertions.assertEquals("basket decorator + flower", basketDecorator.getDescription());
        Assertions.assertEquals(24, basketDecorator.getPrice());

        BasketDecorator basketDecorator2 = new BasketDecorator(exampleItem2);

        Assertions.assertEquals("basket decorator + ", basketDecorator2.getDescription());
        Assertions.assertEquals(104, basketDecorator2.getPrice());


        BasketDecorator basketDecorator3 = new BasketDecorator(exampleItem3);

        Assertions.assertEquals("basket decorator + random text", basketDecorator3.getDescription());
        Assertions.assertEquals(5, basketDecorator3.getPrice());
    }

    @Test
    public void testPaperDecorator(){
        PaperDecorator paperDecorator = new PaperDecorator(exampleItem1);

        Assertions.assertEquals("paperDecorator + flower", paperDecorator.getDescription());
        Assertions.assertEquals(33, paperDecorator.getPrice());

        PaperDecorator paperDecorator2 = new PaperDecorator(exampleItem2);

        Assertions.assertEquals("paperDecorator + ", paperDecorator2.getDescription());
        Assertions.assertEquals(113, paperDecorator2.getPrice());

        PaperDecorator paperDecorator3 = new PaperDecorator(exampleItem3);

        Assertions.assertEquals("paperDecorator + random text", paperDecorator3.getDescription());
        Assertions.assertEquals(14, paperDecorator3.getPrice());
    }

    @Test
    public void testRibbonDecorator(){
        RibbonDecorator ribbonDecorator = new RibbonDecorator(exampleItem1);

        Assertions.assertEquals("RibbonDecorator + flower", ribbonDecorator.getDescription());
        Assertions.assertEquals(60, ribbonDecorator.getPrice());

        RibbonDecorator ribbonDecorator2 = new RibbonDecorator(exampleItem2);

        Assertions.assertEquals("RibbonDecorator + ", ribbonDecorator2.getDescription());
        Assertions.assertEquals(140, ribbonDecorator2.getPrice());

        RibbonDecorator ribbonDecorator3 = new RibbonDecorator(exampleItem3);

        Assertions.assertEquals("RibbonDecorator + random text", ribbonDecorator3.getDescription());
        Assertions.assertEquals(41, ribbonDecorator3.getPrice());
    }

}
