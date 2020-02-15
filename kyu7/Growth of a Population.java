class Arge {   
    public static int nbYear(int p0, double percent, int aug, int p) {
        int res=0;
        while(p>p0){
          p0 += p0* percent/100 + aug;
          res++;
        }
        return res;
    }
}