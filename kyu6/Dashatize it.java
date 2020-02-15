public class Solution {

    public static String dashatize(int num) {
      String n = ""+num;
      String res = "-";
      for(int i = 0; i < n.length(); i++) {
        if(n.charAt(i) % 2 != 0){
          res+="-"+n.charAt(i)+"-";
        } else {
          res+=n.charAt(i);
        }
      }
      res+="-";
      res=res.replaceAll("[-]{2,}","-");
      return res.substring(1,res.length()-1);
    }
}