
class PrimeCalculator {

    boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    int nth(int nth) {

        if (nth <= 0) {
            throw new IllegalArgumentException();
        }

        int i = 2;
        int count = 0;
        while (true) {
            System.out.println(i);
            if (isPrime(i)) {
                count++;
                if (count == nth)
                    return i;
            }
            i++;

        }

    }

}
