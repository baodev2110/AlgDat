package hjelpeklasser;

public class Table
{
    // finner minste tall i array mellom et intervall
    public static int min(int[] a, int from, int to)
    {
        if(from < 0 || to > a.length || from >= to)
            throw new IllegalArgumentException("Ugyldig intervall");

        int minPos = from;
        int minVal = a[from];

        for(int i = from; i < to; i++)
        {
            if(a[i] < minVal)
            {
                minPos = i;
                minVal = a[minPos];
            }
        }
        return minPos;
    }

    // finner minste tall i hele tabellen
    public static int min(int[] a)
    {
        return min(a, 0, a.length);
    }

    public static int maks(int[] a, int fra, int til)
    {
        int sist = til - 1;         // siste posisjon i tabellen
        int m = fra;              // indext til største verdi
        int maxVerdi = a[fra];    // største verdi@
        int temp = a[sist];     // tar vare på siste verdi
        a[sist] = 0x7fffffff;

        for (int i = fra; ; i++)
        {
            if (a[i] >= maxVerdi)
            {
                if (i == sist)
                {
                    a[sist] = temp;
                    return temp >= maxVerdi ? sist : m;
                }
                else
                {
                    maxVerdi = a[i];
                    m = i;
                }
            }
        }
    }
}
