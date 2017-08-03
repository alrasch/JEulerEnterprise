package math.trivial_properties;

public class DigitAnalyzer {
    public long getCrossProduct(long n) {
        String string = Long.toString(n);
        long product = 1;
        for (int i = 0; i < string.length(); i++){
            product *= Integer.parseInt(string.substring(i, i+1));
        }
        return product;
    }
}
