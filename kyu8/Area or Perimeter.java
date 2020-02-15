public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        return l==w ? l*l : 2*l+2*w;
    }
}