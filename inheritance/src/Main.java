import animal.*;
import person.Personnel;

public class Main {
    public static void main(String[] args) {

        Personnel person1 = new Personnel();
        person1.initiate();
        person1.print();

        Animal[] animals = new Animal[9];

        animals[0] = new Animal();
        animals[1] = new Animal("Fido", 3, 12.5);
        animals[2] = new Dog("Lee", 3, 10, 4, 60);
        animals[3] = new Mammal();
        animals[4] = new Mammal("Buddy", 5, 21.0, 2);
        animals[5] = new Dog();
        animals[6] = new Dog("Max", 4, 15.3, 4, 50);
        animals[7] = new Fish();
        animals[8] = new Blowfish("Spiky", 1, 0.2, true, true);

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.getVoice();
            animal.eat();
            System.out.println();
        }


        System.out.println(animals[2].toString());
        animals[2].eat();
        animals[2].getVoice();
    }
}

