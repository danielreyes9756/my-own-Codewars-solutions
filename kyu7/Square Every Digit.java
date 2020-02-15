public class SquareDigit {
  public int squareDigits(int n) {
    String x = ""+n;
    String res="";
    for(int i = 0 ; i < x.length();i++){
      res+=""+(int)Math.pow(Integer.parseInt(x.charAt(i)+""),2);
    }
    return Integer.parseInt(res);
  }
}