import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnTrueForTaxableItem(){
        Item item = new Item("CD", 30.0, true, true);

        boolean actual = item.isTaxable();

        assertEquals(true, actual);
    }

}