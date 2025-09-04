package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String oikea = "java123";
        int maxYritykset = 3;
        for (int i = 0; i < tries.length && i < maxYritykset; i++) {
            if (tries[i].equals(oikea)) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}

/*
 ### 4. Salasanayritykset (`PasswordAttempts`)
Metodi `public static String login(String[] tries)` — oikea salasana on `java123`. Tarkista **enintään kolme** ensimmäistä yritystä.
- Palauta `Tervetuloa!` jos jokin niistä on oikein.
- Muuten `Liian monta virheellistä yritystä.`
 */