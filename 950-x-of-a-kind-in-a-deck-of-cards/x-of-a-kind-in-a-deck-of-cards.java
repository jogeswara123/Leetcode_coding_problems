class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:deck){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int gcdValue = 0;

        for (int freq : map.values()) {
            gcdValue = gcd(gcdValue, freq);
        }

        return gcdValue > 1;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}