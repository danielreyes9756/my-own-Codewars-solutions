import java.util.List;
import java.util.ArrayList;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
		// your code
    long total = n*(n+1)/2;
    List <long[]> list = new ArrayList<long[]>(); 
    for(long i = 1; i < n; i++) {
      long j=(total-i)/(i+1);
      if(j<n && (j*i == total-j-i)){ 
        list.add(new long [] {i,j});
        
      }
    }
		return list;
	}
}