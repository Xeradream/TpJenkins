

import org.junit.jupiter.api.Test;
import tpJenkins.exercice3.Delivery;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DeliveryTest {

    @Test
    public void testGetPrixLivraison() {
        Delivery delivery = new Delivery();
        delivery.delivery(5, 25);
        double actualPrix = delivery.getPrixLivraison();
        assertEquals(10.0, actualPrix);
    }
}
