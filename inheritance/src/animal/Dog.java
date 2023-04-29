package animal;

public class Dog extends Mammal {
    protected double length;

    public Dog() {
    }

    public Dog(double length) {
        this.length = length;
    }

    public Dog(String name, int age, double weight, double length) {
        super(name, age, weight);
        this.length = length;
    }

    public Dog(String name, int age, double weight, int legsNumber, double length) {
        super(name, age, weight, legsNumber);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void HauHau() {
        System.out.println("Hau Hau!!!");
    }

    @Override
    public void getVoice() {
        System.out.println("Hau Hau");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "length=" + length +
                ", legsNumber=" + legsNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
