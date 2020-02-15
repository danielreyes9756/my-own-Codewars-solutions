public class PrimeDecomp {
   
    public static String factors(int n) {
      String res = "";
      int count = 0;
      for (int i = 2; i <= n; i++){
        count = 0;
        while (n % i == 0){
            count++;
            n/=i;
        }
        if (count == 1) res+="(" + i + ")";
        if (count > 1) res+="(" + i + "**" + count + ")";
      }
      return res;
    } 
}