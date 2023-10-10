import java.util.HashMap;

class ResistorColor {
    int colorCode(String color) {
        HashMap<String, Integer> colorCodeMap = new HashMap<>();

        colorCodeMap.put("black", 0);
        colorCodeMap.put("brown", 1);
        colorCodeMap.put("red", 2);
        colorCodeMap.put("orange", 3);
        colorCodeMap.put("yellow", 4);
        colorCodeMap.put("green", 5);
        colorCodeMap.put("blue", 6);
        colorCodeMap.put("violet", 7);
        colorCodeMap.put("grey", 8);
        colorCodeMap.put("white", 9);
        return colorCodeMap.get(color);
    }

    String[] colors() {
        String[] clrs = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
        return clrs;
    }

}
