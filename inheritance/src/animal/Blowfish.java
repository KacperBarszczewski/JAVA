package animal;

public class Blowfish extends Fish {
    protected boolean isInflated;

    public Blowfish() {
    }

    public Blowfish(boolean isInflated) {
        this.isInflated = isInflated;
    }

    public Blowfish(String name, int age, double weight, boolean isInflated) {
        super(name, age, weight);
        this.isInflated = isInflated;
    }

    public Blowfish(String name, int age, double weight, boolean isSaltwater, boolean isInflated) {
        super(name, age, weight, isSaltwater);
        this.isInflated = isInflated;
    }

    public boolean isInflated() {
        return isInflated;
    }

    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }

    public void blowing() {
        System.out.println("Blowing");
    }

    @Override
    public void getVoice() {
        System.out.println("Suuuu");
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "isInflated=" + isInflated +
                ", isSaltwater=" + isSaltwater +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
