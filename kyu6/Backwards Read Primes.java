public class BackWardsPrime {
	
public static String backwardsPrime(long start, long end) {
    String result="";
    for (long i = start ; i <= end; i++) {
        if(i > 11 && isPrime(i) ) {
          
          long inverted=0;
          long num = i;
          while(num > 0){
            long res= num%10;
            inverted = inverted*10 +res;
            num/=10;
          }
          
        if(inverted != i){
            if(isPrime(inverted)) result+= " " + i;
          }
        }
    }
    System.out.print(result);
    return result.trim();
	}
  public static boolean isPrime(long number) {
   long count = 2;
  
    while (count!=number){
      if (number % count == 0)
        return false;
      count++;
    }
    return true;
  }
}