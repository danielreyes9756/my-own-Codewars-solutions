public class Solution {
  public static int century(int number) {
    if(number == 100) return 1;
    return number%100==0 ? number/100 : number/100+1;
  }
}