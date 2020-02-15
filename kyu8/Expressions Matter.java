public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        // Your Code here... Happy Coding!
        if((a==1 && b==1 && c==1) || (a==1 && c==1)) return a+b+c;
        if((a==1 && b==1) || (c==1 && b==1)) return a==b ? 2*c : 2*a;
        if(a==1 || c==1) return a==1 ? (1+b)*c : (1+b)*a;
        if(b==1) return a>=c ? (1+c)*a : (1+a)*c;
      return a*b*c;
    }
}