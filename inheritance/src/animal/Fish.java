package animal;

public class Fish extends Animal {
    protected boolean isSaltwater;

    public Fish() {
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Fish(String name, int age, double weight, boolean isSaltwater) {
        super(name, age, weight);
        this.isSaltwater = isSaltwater;
    }

    public boolean isSaltwater() {
        return isSaltwater;
    }

    public void setSaltwater(boolean saltwater) {
        isSaltwater = saltwater;
    }

    public void swim() {
        System.out.println("Swimming");
    }


    @Override
    public void eat() {
        System.out.println("Worm");
    }

    @Override
    public void getVoice() {
        System.out.println("None");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "isSaltwater=" + isSaltwater +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
