public class PigLatin {
    static String symbols = "!?";
    public static String pigIt(String str) {
        String[] arr=str.split(" ");
        for(int i = 0; i < arr.length; i++) {
          if(!symbols.contains(arr[i])) {
            if(arr[i].length() > 1){
              String aux = arr[i].substring(1,arr[i].length());
              arr[i]=aux+arr[i].charAt(0)+"ay";
            } else {
              arr[i]+="ay";
            }
          }
        }
        String res="";
        for(String i : arr){
          res+= i + " ";
        }
        return res.trim();
    }
}