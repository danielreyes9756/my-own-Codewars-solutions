public class Kata
 {
  public static int squareSum(int[] n)
  { 
   int res=0;
   for(int i=0;i<n.length;i++){ 
     res+=Math.pow(n[i],2);
    }
   return res;
  }
 }