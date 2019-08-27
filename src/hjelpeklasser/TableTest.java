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

        assertEquals(2, Table.min(b, 2, 3));
    }

    @Test
    void maks()
    {
        int [] b = {3,2,1};


        assertEquals(0, Table.maks(b, 0, 3));

    }

    @Test
    void min2()
    {
        int [] a = {1,2,3};
        int [] b = {3,2,1};
        int [] c = {2,1,3};

        assertEquals(0, Table.min(a));
        assertEquals(2, Table.min(b));
        assertEquals(1, Table.min(c));
    }
}