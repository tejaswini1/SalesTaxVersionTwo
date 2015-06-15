import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnTrueForTaxableItem(){
        Item item = new Item("CD", 30.0, true, true);

        boolean actual = item.isTaxable();

        assertEquals(true, actual);
    }


    @Test
    public void shouldReturnFalseForTaxableItem(){
        Item item = new Item("juice", 30.0, false, true);

        boolean actual = item.isTaxable();

        assertEquals(false, actual);
    }

    @Test
    public void shouldReturnTrueIfItemIsImported(){
        Item item = new Item("juice", 30.0, false, true);

        boolean actual = item.isImported();

        assertEquals(true, actual);
    }

    @Test
    public void shouldReturnFalseIfItemIsImported(){
        Item item = new Item("juice", 30.0, false, false);

        boolean actual = item.isImported();

        assertEquals(false, actual);
    }

}