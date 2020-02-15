 public class Sum
  {
     public int GetSum(int a, int b)
     {
      if(a==b) return a;
      int res=0;
      if(b>a){
        for(int i = a ; i <= b; i++) 
          res+=i;
      } else {
        for(int i = b ; i <= a; i++)
          res+=i;
      }
      return res;
      }
  }