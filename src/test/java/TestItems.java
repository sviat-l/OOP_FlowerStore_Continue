import com.example.store.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestItems {

    Flower flower1 = new Flower("Rose", 5, 10, "Red");
    Flower flower2 = new Flower("Tulip", 3, 5, "Yellow");
    Flower flower3 = new Flower("Daisy", 2, 3, "White");
    @Test
    public void basicTests() {

        Assertions.assertEquals("Rose", flower1.getDescription());
        Assertions.assertEquals("Red", flower1.getColor());

        Assertions.assertEquals(5, flower2.getPrice());
        Assertions.assertEquals(3, flower2.getSepalLength());

        Assertions.assertEquals("Daisy", flower3.getDescription());
        Assertions.assertEquals(3, flower3.getPrice());

        flower1.setPrice(15);
        Assertions.assertEquals(15, flower1.getPrice());
        flower2.setColor("Red");
        Assertions.assertEquals("Red", flower2.getColor());
        flower3.setSepalLength(4);
        Assertions.assertEquals(4, flower3.getSepalLength());
    }

    @Test
    public void testFlower() {
        Flower flower = new Flower("Rose", 5, 10, "Red");
        CactusFlower cactusFlower = new CactusFlower("Cactus", 3, 5);
        RomashkaFlower romashkaFlower = new RomashkaFlower("Romashka", 2, 3);

        Assertions.assertEquals("Cactus", cactusFlower.getDescription());
        Assertions.assertEquals(3, cactusFlower.getSepalLength());
        Assertions.assertEquals(5, cactusFlower.getPrice());
        Assertions.assertEquals(cactusFlower.price(), cactusFlower.getPrice());
        Assertions.assertEquals("green", cactusFlower.getColor());

        Assertions.assertEquals("Romashka", romashkaFlower.getDescription());
        Assertions.assertEquals(2, romashkaFlower.getSepalLength());
        Assertions.assertEquals(3, romashkaFlower.getPrice());
        Assertions.assertEquals(romashkaFlower.price(), romashkaFlower.getPrice());
        Assertions.assertEquals("white", romashkaFlower.getColor());

        flower.setPrice(15);
        Assertions.assertEquals(15, flower.getPrice());

        cactusFlower.setColor("Red");
        Assertions.assertEquals("Red", cactusFlower.getColor());

        romashkaFlower.setSepalLength(4);
        Assertions.assertEquals(4, romashkaFlower.getSepalLength());
    }

    @Test
    public void testBucket(){
        FlowerBucket bucket = new FlowerBucket("bucket");
        bucket.addFlower(flower1);
        bucket.addFlower(flower2);
        bucket.addFlower(flower3);

        Assertions.assertEquals(3, bucket.allFlowers().size());
        Assertions.assertEquals(18, bucket.price());
        Assertions.assertTrue(bucket.searchFlower(flower1));
        Assertions.assertFalse(bucket.searchFlower(new Flower("Rose", 5, 10, "Red")));

        Assertions.assertEquals("bucket", bucket.getDescription());
        Assertions.assertEquals(bucket.allFlowers(), List.of(flower1, flower2, flower3));

        flower1.setPrice(111);
        Assertions.assertEquals(119, bucket.price());
    }
}
