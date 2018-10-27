package test;

import kata.Summation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummationTest {

    @Test
    public void shouldReturn36()
    {
        Assertions.assertEquals(36, Summation.summation(8));
    }
}
