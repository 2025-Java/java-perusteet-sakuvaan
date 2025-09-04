package viikko1;

public class TimesTable {
    public static String table(int n) {
        String tulos = "";
        for(int i = 1; i <= 10; i++)
        {
            tulos +=  n + " x " + i + " = " + n * i + "\n";
        }
            return tulos;
        }
    }

/*
 ### 3. Kertotaulu (`TimesTable`)
Metodi `public static String table(int n)` palauttaa n:n kertotaulun 1..10, rivit muodossa `n x i = tulos` ja jokaisen rivin lopussa `\n`.
 */