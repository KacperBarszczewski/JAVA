package person;

import person.Person;

public class Personnel extends Person {
    private String education;
    private  String workplace;
    public void initiate2(){
        initiate();

        System.out.print("Education: ");
        this.education = scanner.nextLine();

        System.out.print("Workplace: ");
        this.workplace = scanner.nextLine();
    }

    public void print2() {
        print();
        System.out.println("education: "+this.education+", workplace: "+this.workplace);
    }
}
