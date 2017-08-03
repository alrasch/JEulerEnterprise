package problems.batch1;

public class Problem9 {
    public int solve() {
        for(int i = 1; i < 981; i++) {
            for (int j = 1; j < i; j++) {
                int k = 1000 - j - i;

                if (k * k == i * i + j * j) {
                    return i*j*k;
                }
            }
        }
        return -1;
    }
}
