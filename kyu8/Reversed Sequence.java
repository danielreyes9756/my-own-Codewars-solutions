public class Sequence{
  public static int[] reverse(int n){
    //your code
    int res[] = new int [n];
    int count = 0;
    for(int i = n; i > 0;i--){
      res[count]=i;
      count++;
    }
    return res;
  }
}