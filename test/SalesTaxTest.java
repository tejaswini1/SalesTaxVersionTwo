import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class SalesTaxTest {


    @Test
    public void shouldReturnTotalCostOfItem(){
        HashMap<Item, Double> items = new HashMap<Item, Double>();
        Item tempItem = new Item("CD", 30.0, Values.TAXABLE, Values.IMPORTED);
        items.put(tempItem, 31.5);
        SalesTax salesTax = new SalesTax(items);

        salesTax.calculate();



        assertEquals("CD 34.65\n", salesTax.toString());
    }

}