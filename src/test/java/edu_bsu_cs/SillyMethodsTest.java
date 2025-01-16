package edu_bsu_cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SillyMethodsTest {
    @Test
    public void testDidGeuss42Correctly(){
        SillyMethods sillyMethods = new SillyMethods();
        boolean result = sillyMethods.didGuess42(42);
        Assertions.assertTrue(result);
    }

    @Test
    public void testDidGeuss42Incorrectly(){
        SillyMethods sillyMethods = new SillyMethods();
        boolean result = sillyMethods.didGuess42(17);
        Assertions.assertFalse(result);
    }

    @Test
    public void testCountTo10(){
        SillyMethods sillyMethods = null;
        String result = String.valueOf(sillyMethods.countTo(10));
        Assertions.assertEquals("0 1 2 3 4 5 6 7 8 9 10", result);
    }
    @Test
    public void testCountTo15(){
        SillyMethods sillyMethods = new SillyMethods();
        String result = String.valueOf(sillyMethods.countTo(15));
        Assertions.assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", result);
    }
}
