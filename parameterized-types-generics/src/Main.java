public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        HomeAnimal<Dog> homeDog = new HomeAnimal<>(myDog);

        Cat myCat = new Cat();
        HomeAnimal<Cat> homeCat = new HomeAnimal<>(myCat);

        homeDog.showType();
        homeDog.sleepOnTheCouch();

        homeCat.showType();
        homeCat.sleepOnTheCouch();

//        Shark myShark = new Shark();
//        HomeAnimal<Shark> homeShark = new HomeAnimal<>(myShark);

    }
}

class Animal {

}

class Dog extends Animal implements Run, Speak {


    @Override
    public void run() {
        System.out.println("Dog run");
    }

    @Override
    public void speak() {
        System.out.println("Hau Hau");
    }
}

class Cat extends Animal implements Run, Speak {

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void speak() {
        System.out.println("Miau Miau");
    }
}

class Shark extends Animal {

}

interface Run {
    void run();
}

interface Speak {
    void speak();
}

class HomeAnimal<T extends Animal & Run & Speak> {
    T ob;

    HomeAnimal(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is " + ob.getClass().getName());
    }

    void sleepOnTheCouch() {
        System.out.println(" Sleep on th couch");
    }


}