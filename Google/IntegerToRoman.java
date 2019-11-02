class Solution {
    public String intToRoman(int num) {
        String[] M = {"","M","MM","MMM","MMMM"};
        String[] D = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] C = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] X = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        return M[num/1000] + D[(num%1000)/100] + C[(num%100)/10] + X[(num%10)];
    }
}
