package person;

import java.util.Scanner;

public class Person {

    private String lastname;
    private String name;
    private String street;
    private int code;
    private String city;
    Scanner scanner = new Scanner(System.in);

    public void initiate() {
        System.out.print("Last name: ");
        this.lastname = scanner.nextLine();

        System.out.print("Name: ");
        this.name = scanner.nextLine();

        System.out.print("Street: ");
        this.street = scanner.nextLine();

        System.out.print("Code: ");
        this.code = scanner.nextInt();

        scanner.nextLine();
        System.out.print("City: ");
        this.city = scanner.nextLine();

    }


    public void print() {
        System.out.println("lastname=" + lastname + ", name=" + name + ", street=" + street + ", code=" + code + ", city=" + city);
    }
}
