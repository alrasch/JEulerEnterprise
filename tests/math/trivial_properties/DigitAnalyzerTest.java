package math.trivial_properties;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitAnalyzerTest {
    @Test
    void testCrossProduct(){
        DigitAnalyzer analyzer = new DigitAnalyzer();
        long[] numbers = {
                1L,
                5L,
                10L,
                25L,
                31415L,
                123456789L
        };
        long[] expectations = {
                1L,
                5L,
                0L,
                10L,
                60L,
                362880L
        };

        for(int i = 0; i < numbers.length; i++) {
            assertEquals(expectations[i], analyzer.getCrossProduct(numbers[i]));
        }
    }
}
