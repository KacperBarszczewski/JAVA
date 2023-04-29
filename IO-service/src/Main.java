import java.io.*;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        FileInputStream fis;
//        int bajt;
//        String basePath = new File("").getAbsolutePath();
//
//        try {
//            fis = new FileInputStream(basePath + "\\plik.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("Not find file");
//            return;
//        }
//
//        try {
//            do {
//                bajt = fis.read();
//
//                if (bajt != -1) {
//                    System.out.println((char) bajt);
//                }
//
//            } while (bajt != -1);
//
//        } catch (IOException e) {
//            System.out.println("Error read file");
//        }
//
//        try {
//            fis.close();
//        } catch (IOException e) {
//            System.out.println("Error on close file");
//        }
        //2//////////////////////////////////////////////////////////////
        int bajt;
        String basePath = new File("").getAbsolutePath();

        try (FileInputStream fis = new FileInputStream(basePath + "\\plik.txt")) {
            do {
                bajt = fis.read();

                if (bajt != -1) {
                    System.out.println((char) bajt);
                }

            } while (bajt != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Not find file");
            return;
        } catch (IOException e) {
            System.out.println("Error read file");
        }

        //3//////////////////////////////////////////////////////////////
        try (FileInputStream fis = new FileInputStream(basePath + "\\plik.txt");
             BufferedWriter output = new BufferedWriter(new FileWriter(basePath + "\\output.txt"))
        ) {
            do {
                bajt = fis.read();

                if (bajt != -1) {
                    if (bajt == ' ') {
                        output.write('-');
                    } else {
                        output.write((char) bajt);
                    }

                }

            } while (bajt != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Not find file");
            return;
        } catch (IOException e) {
            System.out.println("Error read file");
        }
        //4/////////////////////////////////////
        DataManagement dataManagement = new DataManagement();

        dataManagement.readData();
        dataManagement.writeDataToFile();
        dataManagement.readDataFromFile();

        //5//////////////////////////////////////////
        Scanner scanner=new Scanner(System.in);

        System.out.print("the first three bill numbers: ");
        String threeNumbersAccount = scanner.nextLine();

        try (BufferedReader fis = new BufferedReader(new InputStreamReader(new URL( "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt").openStream()))) {
            String line;
            while ((line = fis.readLine()) != null) {
                String[] tab = line.split("\t");

                if(Objects.equals(threeNumbersAccount, tab[0].substring(0, 3))){

                    System.out.println("Your account is in: "+tab[1]);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Not find file");

        } catch (IOException e) {
            System.out.println("Error read file");
        }

    }
}