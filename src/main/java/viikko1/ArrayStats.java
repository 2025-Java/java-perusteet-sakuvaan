package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        // TODO
        if (arr.length == 0){
        return 0.0;
    }
    int sum = 0;
    for (int n : arr) {
        sum += n;
    }
    return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        // TODO
        if (arr.length == 0){
        return Integer.MIN_VALUE;
    }
    int suurin = arr[0];
    for (int n : arr) {
        if (n > suurin) {
            suurin = n;
        }
    }
    return suurin;
    }
}

/*
 ### 5. Taulukon keskiarvo ja maksimi (`ArrayStats`)
- `public static double average(int[] arr)` — palauta keskiarvo `double`-tyyppisenä, tyhjän taulukon tapauksessa `0.0`.
- `public static int max(int[] arr)` — palauta suurin arvo, tyhjän taulukon tapauksessa `Integer.MIN_VALUE`.

 */