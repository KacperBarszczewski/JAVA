public class Main {
    enum Figures {
        SQUARE(2),
        RECTANGLE(4),
        CIRCLE(8),
        TRAPEZOID(16),
        RHOMBUS(32),
        TRIANGLE(64),
        OVAL(128),
        HEXAGON(256);

        private int value;

        Figures(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Figures figures;

        for (Figures f : Figures.values()) {
            System.out.println(f.ordinal() + " | " + f + " |value: " + f.getValue());
        }

        //2/////////////////////////////////////////////////
        System.out.println("////////////2");

        TrafficLights trafficLights = new TrafficLights();
        System.out.println(trafficLights.toString());

        for (int i = 0; i < 10; i++) {
            trafficLights.changeColor();
            System.out.println(trafficLights.toString());
        }

    }
}