import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String basePath = new File("").getAbsolutePath();
        try (BufferedReader fis = new BufferedReader(new FileReader(basePath + "\\plik.txt"))
        ) {
            String line;
            while ((line = fis.readLine()) != null) {
                list.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Not find file");
            return;
        } catch (IOException e) {
            System.out.println("Error read file");
        }

        System.out.println("size: " + list.size());

        for (String worker : list) {
            System.out.println(worker);
        }

        //2////////////////////
        System.out.println("///////2");
        HashSet<String> hashList = new HashSet<>();

        try (BufferedReader fis = new BufferedReader(new FileReader(basePath + "\\plik.txt"))
        ) {
            String line;
            while ((line = fis.readLine()) != null) {
                hashList.add(line);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Not find file");
            return;
        } catch (IOException e) {
            System.out.println("Error read file");
        }

        System.out.println("size: " + hashList.size());
        System.out.println("Is there Kacper Barszczewski: " + hashList.contains("Kacper  Barszczewski"));

        for (String worker : hashList) {
            System.out.println(worker);
        }

        //3////////////////////
        System.out.println("///////3");
        TreeSet<String> treeList = new TreeSet<>();

        try (BufferedReader fis = new BufferedReader(new FileReader(basePath + "\\plik.txt"))
        ) {
            String line;
            while ((line = fis.readLine()) != null) {
                treeList.add(line);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Not find file");
            return;
        } catch (IOException e) {
            System.out.println("Error read file");
        }

        System.out.println("size: " + treeList.size());
        System.out.println("Is there Kacper Barszczewski: " + treeList.contains("Kacper  Barszczewski"));

        for (String worker : treeList) {
            System.out.println(worker);
        }

        //4////////////////////
        System.out.println("///////4");
        ArrayList<String> arrayList = new ArrayList<>();

        try (BufferedReader fis = new BufferedReader(new FileReader(basePath + "\\plik.txt"))
        ) {
            String line;
            while ((line = fis.readLine()) != null) {
                arrayList.add(line);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Not find file");
            return;
        } catch (IOException e) {
            System.out.println("Error read file");
        }

        System.out.println("size: " + arrayList.size());
        System.out.println("Is there Kacper Barszczewski: " + arrayList.contains("Kacper  Barszczewski"));

        for (String worker : arrayList) {
            System.out.println(worker);
        }

        System.out.println("\nAfter sorting:");
        Collections.sort(arrayList);

        for (String worker : arrayList) {
            System.out.println(worker);
        }
    }
}