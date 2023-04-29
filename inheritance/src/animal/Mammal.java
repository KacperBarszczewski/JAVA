package animal;

public class Mammal extends Animal {
    protected int legsNumber;

    public Mammal() {
    }

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Mammal(String name, int age, double weight, int legsNumber) {
        super(name, age, weight);
        this.legsNumber = legsNumber;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    public void birth() {
        System.out.println("Child birth");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

    @Override
    public void getVoice() {
        System.out.println("sound");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "legsNumber=" + legsNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
