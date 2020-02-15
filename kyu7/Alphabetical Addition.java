import java.util.TreeMap;

public class Kata {
    static String [] l = {"z","a","b","c","d","e","f","g","h","i","j","k",
    "l","m","n","o","p","q","r","s","t","u","v","w","x","y"};
    static TreeMap <String,Integer> map = new TreeMap <String,Integer>(); 
    public static String addLetters(String... letters) {
        for(int i = 0; i < l.length;i++){
          map.put(l[i],i);
        }
        int res=0;
        for(String x:letters){
          if(x==null){return "z";}
          res+=map.get(x);
        }
        int aux = res%26; 
        return l[aux];
    }
}