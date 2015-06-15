import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldCreateAnItemObject(){
        Parser parser = new Parser();

        Item item = parser.parse("1 juice at 30.0");

        assertEquals(new Item("juice", 30.0, Values.NON_TAXABLE, Values.NON_IMPORTED),item);
    }
}