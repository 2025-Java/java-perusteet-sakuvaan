package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        String tulos = " ";
        if(n == 0){
            tulos="nolla";
        }

        else if(n > 0 && n % 2 == 0){
            tulos="positiivinen parillinen";
        }

        else if(n > 0 && n % 2 != 0){
            tulos="positiivinen pariton";
        }

        else if(n < 0 && n % 2 == 0){
            tulos="negatiivinen parillinen";
        }

        else if(n < 0 && n % 2 != 0){
            tulos="negatiivinen pariton";
        }
        return tulos;
    }
}


/*
### 1. Luvun ominaisuudet (`NumberProperties`)
Metodi `public static String describe(int n)` palauttaa jonkin seuraavista:
- `positiivinen parillinen`
- `positiivinen pariton`
- `negatiivinen parillinen`
- `negatiivinen pariton`
- `nolla`
 */