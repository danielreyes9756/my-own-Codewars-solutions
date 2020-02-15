public class MorseCodeDecoder {

    public static String decode(String morseCode) {      
      if(morseCode.trim().indexOf(' ') == -1 ){
        return MorseCode.get(morseCode.trim());
      }
       String aux=morseCode.trim().replaceAll("   ","* ");
       String [] v = aux.split(" "); 
       String res= "";
       for(int i = 0; i < v.length; i++){
         if(v[i].contains("*")){
           res+= MorseCode.get(v[i].substring(0,v[i].length()-1)) + " ";
         } else {
           res+=MorseCode.get(v[i]);
         }
       }
       return res;
    }
}