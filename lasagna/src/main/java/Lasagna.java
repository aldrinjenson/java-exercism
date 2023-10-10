public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int currMinutes) {
        return 40 - currMinutes;

    }

    public int preparationTimeInMinutes(int numLayers) {
        return numLayers * 2;
    }

    public int totalTimeInMinutes(int numLayers, int minutesInOven) {
        return numLayers * 2 + minutesInOven;
    }

}
