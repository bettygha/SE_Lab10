package main;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    Integer[] expectedArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void testNullReturnsNull() throws IllegalArgumentException {
        Assert.assertNull(
                "Testing a null argument",
                Main.flattenStream(null)
        );
    }

    @Test
    public void flattenStream() {
        Integer[][] arr = {
                { 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8, 9 }
        };
        Assert.assertArrayEquals(
                "Testing a flat array",
                expectedArray,
                Main.flattenStream(arr).toArray()
        );
    }
}