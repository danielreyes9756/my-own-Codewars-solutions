public class BitCounting {

	public static int countBits(int n){
    int result=0;
    String res = Integer.toBinaryString(n);
    for(int i=0; i<res.length(); i++){
      char a = res.charAt(i);
      if(a=='1'){result++;}
    }
      return result;
	}
}