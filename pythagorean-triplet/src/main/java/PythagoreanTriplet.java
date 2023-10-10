import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    int a, b, c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int targetSum;
        int maxFactor;

        TripletListBuilder thatSumTo(int sum) {
            targetSum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();

            for (int a = 1; a <= maxFactor; a++) {
                for (int b = a + 1; b <= maxFactor; b++) {
                    int c = targetSum - a - b;
                    if (c > b && a * a + b * b == c * c) {
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }

            return triplets;
        }
    }
}
