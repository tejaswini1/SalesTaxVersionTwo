import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnTrueForTaxableItem() {
        Item item = new Item("CD", 30.0, Values.TAXABLE, Values.IMPORTED);

        boolean actual = item.isTaxable();

        assertEquals(true, actual);
    }


    @Test
    public void shouldReturnFalseForTaxableItem() {
        Item item = new Item("juice", 30.0, Values.NON_TAXABLE, Values.IMPORTED);

        boolean actual = item.isTaxable();

        assertEquals(false, actual);
    }

    @Test
    public void shouldReturnTrueIfItemIsImported() {
        Item item = new Item("juice", 30.0, Values.NON_TAXABLE, Values.IMPORTED);

        boolean actual = item.isImported();

        assertEquals(true, actual);
    }

    @Test
    public void shouldReturnFalseIfItemIsImported() {
        Item item = new Item("juice", 30.0, Values.NON_TAXABLE, Values.NON_IMPORTED);

        boolean actual = item.isImported();

        assertEquals(false, actual);
    }

    @Test
    public void shouldReturnNameAndCostOfItem() {
        Item item = new Item("juice", 30.0, Values.NON_TAXABLE, Values.NON_IMPORTED);

        String actual = item.toString();

        assertEquals("juice", actual);
    }

}