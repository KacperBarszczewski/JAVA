package animal;

public class Bird extends Animal {
    protected String featherColor;

    public Bird() {
    }

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void eat() {
        System.out.println("Bread");
    }

    @Override
    public void getVoice() {
        System.out.println("Cwir Cwir");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
