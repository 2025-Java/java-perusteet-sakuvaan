package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {

        int temp;
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }
        if (a > c) {
            temp = c;
            c = a;
            a = temp;
        }
        if (b > c) {
            temp = c;
            c = b;
            b = temp;
        }
        String list = a + "," + b + "," + c;
        return list;
    }
}

/*
 ### 2. Kolmen luvun järjestäminen (`SortThree`)
Metodi `public static String ascending(int a, int b, int c)` palauttaa luvut nousevassa järjestyksessä muodossa `a,b,c` (ei välilyöntejä).
 */