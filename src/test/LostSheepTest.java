package test;

import kata.LostSheep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LostSheepTest {

    @Test
    public void shouldReturn6()
    {
        Assertions.assertEquals(6, LostSheep.lostSheeps(new int[]{3,2,1}, new int[]{4,5}, 21));
    }
}
