import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemsTest {

    @Test
    public void shouldReturnTrueIfItemISAvailble(){
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("juice", 10.0, Values.NON_TAXABLE, Values.NON_IMPORTED));
        Items items = new Items(itemList);

        boolean actual = items.isAvailable(new Item("juice", 10.0, Values.NON_TAXABLE, Values.NON_IMPORTED));

        assertEquals(true, actual);
    }

}