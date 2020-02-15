public class Solution
{
    public static int[] rowWeights (final int[] weights)
    {
        int aux=0;
        int aux2=0;
        for(int i=0;i<weights.length;i++){
          if(i%2==0) aux+=weights[i];
          else aux2+=weights[i];
        }
        return new int[]{aux, aux2}; // Do your magic!
    }
}