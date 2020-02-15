class Solution{
    public static String removeDuplicateWords(String s){
         String [] aux = s.split(" ");
        String res="";
        for( int i = 0; i < aux.length; i++ ) {
          if(!res.contains(aux[i])) res+=aux[i] + " ";
        }
        return res.trim();
    }
}