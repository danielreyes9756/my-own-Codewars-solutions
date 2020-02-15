public class Kata {
  public static int[] digitize(long n) {
    String aux = ""+n;
    int [] res = new int [aux.length()];
    int count =0;
    for(int i = aux.length()-1; i >= 0; i--){
      res[count]=Character.getNumericValue(aux.charAt(i));
      count++;
    }
    return res;
  }
}