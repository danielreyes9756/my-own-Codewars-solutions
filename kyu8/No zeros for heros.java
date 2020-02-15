public class NoBoring {
    public static int noBoringZeros(int n) {
        if (n == 0) return n;
        String aux=n+"";
        return Integer.parseInt(aux.replaceAll("0+$",""));
    }
}