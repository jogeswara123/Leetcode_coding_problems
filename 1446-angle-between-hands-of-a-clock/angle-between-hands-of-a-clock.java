class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12){
            hour=0;
        }
        double a=Math.abs(30*hour-(5.5*minutes));
        a=Math.min(a,360-a);
        return a;
    }
}