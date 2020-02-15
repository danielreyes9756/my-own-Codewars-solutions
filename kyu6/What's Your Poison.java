public class FindThePoison {
    public int find(int[] rats) {
        int res=0;
        for(int i = 0; i < rats.length; i++){
            res+=Math.pow(2,rats[i]);
        }
      return res;
    }
}