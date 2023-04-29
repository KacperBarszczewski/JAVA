import javax.naming.Name;
import java.io.*;
import java.util.Scanner;

public class DataManagement {
    String name;
    String lastname;

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = scanner.nextLine();

        System.out.print("Last Name: ");
        this.lastname = scanner.nextLine();

    }

    public void writeDataToFile() {
        String basePath = new File("").getAbsolutePath();

        try (BufferedWriter fis = new BufferedWriter(new FileWriter(basePath + "\\plik2.txt"))
        ) {
            fis.write(this.name);
            fis.newLine();
            fis.write(this.lastname);
            fis.newLine();

        } catch (IOException e) {
            System.out.println("Error read file");
        }
    }

    public void readDataFromFile() {
        String basePath = new File("").getAbsolutePath();

        try (BufferedReader fis = new BufferedReader(new FileReader(basePath + "\\plik2.txt"))
        ) {
            String line;
            while ((line = fis.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Not find file");
            return;
        } catch (IOException e) {
            System.out.println("Error read file");
        }
    }
}
