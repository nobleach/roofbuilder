package dev.nobleach.parking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class AppTest 
{
    @Test
    public void shouldReturn5()
    {
        int actual = App.findMinimumSpan(Arrays.asList(12, 6, 5, 2), 3);
        assertEquals(5, actual);
    }

    @Test
    public void shouldReturn6()
    {
        int actual = App.findMinimumSpan(Arrays.asList(12, 6, 5, 8, 1, 2), 4);
        assertEquals(6, actual);
    }
}
