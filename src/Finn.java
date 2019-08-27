import java.util.NoSuchElementException;

public class Finn
{
    public static int min(int[] a)
    {
        if(a.length < 1)
            throw new NoSuchElementException("Tabellen er tom!");

        int m = 0;
        for(int i = 1; i <a.length; i++)
            if(a[i] < a[m]) m = i;


        return m;
    }

    public static int[] minmaks(int[] a)
    {
        int min = 0;
        int max = 0;

        for(int i = 1; i < a.length; i++)
        {
            if(a[i] < a[min])
                min = a[i];

            else if(a[i] > a[max])
                max = a[i];
        }

        return new int[]{min,max};
    }

    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] >= maksverdi)
            {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdateres
            }
        }
        return m;   // returnerer indeks/posisjonen til største verdi

        // [10, 5, 7, 2, 9, 1, 3, 8, 4, 6]
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    } // maks

}
