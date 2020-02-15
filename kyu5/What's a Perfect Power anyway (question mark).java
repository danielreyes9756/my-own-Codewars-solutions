public class PerfectPower {
  public static int[] isPerfectPower(int n) {
    int max = (int)Math.ceil(Math.sqrt(n));
    for(int i = 2; i <= max; i++){
      for(int j = 2; j <= max; j++){
        if(Math.pow(i,j)>n) break;
        if(Math.pow(i,j) == n) return new int [] {i,j};
      } 
    }
    return null;
  }
}