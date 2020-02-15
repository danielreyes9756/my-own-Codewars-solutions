public class FindOdd {
	public static int findIt(int[] a) {
  	for(int i=0;i<a.length;i++){
      int aux = 0;
      for(int j=0;j<a.length;j++) {
        if(a[i]==a[j])aux++;
      }
      if(aux%2!=0){return a[i];}
    }
    return 0;
  }
}