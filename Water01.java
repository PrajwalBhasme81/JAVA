public class Water01 {

    public void checkPurity(boolean isPure) {
        if (isPure) {
            System.out.println("The water is pure.");
        }
        if (!isPure) {
            System.out.println("The water is not pure.");
        }
    }

    public void checkTemperature(int temperature) {
        if (temperature > 30) {
            System.out.println("The water is warm.");
        }
        if (temperature <= 30 && temperature >= 10) {
            System.out.println("The water is cool.");
        }
        if (temperature < 10) {
            System.out.println("The water is cold.");
        }
    }

    public void checkVolume(int volume) {
        if (volume > 1000) {
            System.out.println("Large volume of water.");
        }
        if (volume <= 1000 && volume >= 500) {
            System.out.println("Medium volume of water.");
        }
        if (volume < 500) {
            System.out.println("Small volume of water.");
        }
    }

    public void checkSource(String source) {
        if ("Tap".equals(source)) {
            System.out.println("Tap water.");
        }
        if ("Bottle".equals(source)) {
            System.out.println("Bottled water.");
        }
        if ("Well".equals(source)) {
            System.out.println("Well water.");
        }
    }
}