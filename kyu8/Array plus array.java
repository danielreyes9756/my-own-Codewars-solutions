public class Sum {
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    // arr1 + arr2 is not working...
    int res=0;
    for(int i = 0; i < arr1.length;i++){
      res+=arr1[i]+arr2[i];
    }
    return res;
  }
}