public class Solution {
    public int isPower(int a) {
        if (a == 1) return 1;
    for (int idx = 2; idx * idx <= a; idx ++) {
        double val = Math.log (a)/Math.log (idx);
        if ((val - (int) val) < 0.00000001) return 1;
    }
    return 0;
    }
}
