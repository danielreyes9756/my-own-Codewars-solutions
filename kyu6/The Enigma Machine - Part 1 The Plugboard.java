public class Plugboard {
    private String wires;
    public Plugboard(String wires) throws InvalidPlugboardWiresException {
        if(wires.length()>20 || wires.length() % 2 != 0 || !this.uniq(wires)){
          throw new InvalidPlugboardWiresException();
        } 
       this.wires=wires;
    }

    public String process(String wire) {
        // Your code here
        for(int i = 0; i < wires.length(); i++){
          if(wires.charAt(i) == wire.charAt(0)){
            if(i%2==0){
              return ""+wires.charAt(i+1);
            } else {
              return ""+wires.charAt(i-1);
            }
          }
        }
        return wire;
    }
    public boolean uniq(String wire){
      for(int i = 0; i < wire.length(); i++){
        for(int j=i+1 ; j < wire.length(); j++){
          if(wire.charAt(i) == wire.charAt(j)) return false;
        }
      }
      return true;
    }
}