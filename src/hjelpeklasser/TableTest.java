package hjelpeklasser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest
{

    @Test
    void min()
    {
        int [] a = {1,2,3};
        int [] b = {3,2,1};
        int [] c = {2,3,1};

        assertEquals(2, Tabell.min(b, 2, 3));
    }

    @Test
    void maks()
    {
        int [] b = {3,2,1};


        assertEquals(0, Tabell.maks(b, 0, 3));

    }

    @Test
    void min2()
    {
        int [] a = {1,2,3};
        int [] b = {3,2,1};
        int [] c = {2,1,3};

        assertEquals(0, Tabell.min(a));
        assertEquals(2, Tabell.min(b));
        assertEquals(1, Tabell.min(c));
    }
}