public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    int count = 0;
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] % divider == 0){ 
        count++;
      }
    }
    int res [] = new int[count];
    count=0;
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] % divider == 0){ 
        res[count]=numbers[i];
        count++;
      }
    }
    return res;
  }
}