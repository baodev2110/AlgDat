package hjelpeklasser;

public class Tabell
{
    private Tabell(){}



    // finner minste tall i array mellom et intervall
    public static int min(int[] a, int fra, int til)
    {
        if(fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Ugyldig intervall");

        int minPos = fra;
        int minVal = a[fra];

        for(int i = fra; i < til; i++)
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
