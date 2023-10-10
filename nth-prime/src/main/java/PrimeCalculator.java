import java.util.HashMap;

class PrimeCalculator {

    boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    int nth(int nth) {
        int count = 1;
        int num = 2;

        while (count < nth) {

        }

    }

}
