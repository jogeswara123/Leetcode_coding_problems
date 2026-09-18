class Solution {
    public double myPow(double x, int n) {
       long exp = n;           // convert to long to avoid overflow

    if (exp < 0) {          // handle negative power
        x = 1 / x;
        exp = -exp;
    }

    double result = 1;

    while (exp > 0) {
        if ((exp % 2) == 1) {   // if exponent is odd
            result *= x;
        }
        x *= x;                 // square the base
        exp /= 2;               // reduce exponent
    }

    return result;
    }
}