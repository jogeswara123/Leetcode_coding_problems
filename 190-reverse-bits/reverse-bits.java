class Solution {
    public int reverseBits(int n) {
        String s= Integer.toBinaryString(n);
        String c=String.format("%32s", s).replace(' ', '0');
        String b=new StringBuilder(c).reverse().toString();
        long a=Long.parseLong(b,2);
        return (int)a;
    }
}