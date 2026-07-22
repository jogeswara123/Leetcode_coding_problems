import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
       StringBuilder sb = new StringBuilder();
       for (int digit : digits) {
        sb.append(digit);
       }
       String s = sb.toString();
        BigInteger a = new BigInteger(s);
        BigInteger b = new BigInteger("1");
        BigInteger c=a.add(b);
        String s1=c.toString();
        int d[] = new int[s1.length()];
        for(int i=0;i<s1.length();i++){
            d[i]=s1.charAt(i)-'0';
        }
        return d;
    }
}