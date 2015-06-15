import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class ImportedTaxTest {

    @Test
    public void shouldReturnTotalCostOfItem(){
        ArrayList<Item> items = new ArrayList<Item>();
        Item tempItem = new Item("juice", 30.0, Values.NON_TAXABLE, Values.IMPORTED);
        items.add(tempItem);
        ImportedTax importedTax = new ImportedTax(items);

        importedTax.calculate();



        assertEquals("juice 31.5\n", importedTax.toString());
    }

    @Test
    public void shouldReturnOriginalCostOfItemWhichIsNotImported(){
        ArrayList<Item> items = new ArrayList<Item>();
        Item tempItem = new Item("juice", 30.0, Values.NON_TAXABLE, Values.NON_IMPORTED);
        items.add(tempItem);
        ImportedTax importedTax = new ImportedTax(items);

        importedTax.calculate();



        assertEquals("juice 30.0\n", importedTax.toString());
    }

}