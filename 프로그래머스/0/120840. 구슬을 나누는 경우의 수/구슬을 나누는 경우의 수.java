import java.math.*;

class Solution {
    public BigInteger solution(long balls, long share) {
        if (share > balls || share < 0) {
            return BigInteger.valueOf(0);
        }
        
        BigInteger numerator = new BigInteger("1");
        BigInteger denominator = new BigInteger("1");
        
        for (long i = 0; i < share; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(balls - i));
            denominator = denominator.multiply(BigInteger.valueOf(i + 1));
        }
        return (numerator.divide(denominator));
    }
}