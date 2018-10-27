package test;

import kata.SmallestInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestIntTest {

    @Test
    public void shouldReturn2()
    {
        Assertions.assertEquals(2, SmallestInteger.findSmallestInt(new int[]{78,56,232,2,12,11,43}));
    }
}
