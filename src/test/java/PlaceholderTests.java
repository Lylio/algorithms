import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlaceholderTests {

    @Test
    public void testStringValueIsNotNull() {
        String colour = "blue";
        assertNotNull(colour);
    }

    @Test
    public void testIntegerValuesAreEqual() {
        int x = 4;
        assertEquals(x, 4);
    }

    @Test
    public void testBooleanValueIsTrue() {

        List<String> colours = new ArrayList<String>();
        colours.add("blue");
        colours.add("red");
        colours.add("green");
        colours.add("yellow");

        Boolean result = false;

        if (colours.get(1) == "red") {
            result = Boolean.TRUE;
        } else {
            result = Boolean.FALSE;
        }

        Assert.assertTrue(result);

    }
}
