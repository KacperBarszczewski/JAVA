import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = 9 - i;
        }

        for (int i : tab) {
            System.out.print(i + " ");
        }

        //2///////////////////////////////
        System.out.println();
        int[] tab2 = new int[10];
        Random random = new Random();
        int max = 0;
        int min = 100;

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = random.nextInt(100) + 1;
            if (tab2[i] > max) {
                max = tab2[i];
            }
            if (tab2[i] < min) {
                min = tab2[i];
            }
        }

        for (int i : tab2) {
            System.out.print(i + " ");
        }
        System.out.println("| min:" + min + " max:" + max);

        System.out.println();
        ////////////////////////////
        int[][] matrix = new int[10][10];
        int num = 0;

        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                matrix[i][j] = 0;

                if (i == j) {
                    matrix[i][j] = num;
                    num++;
                }

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //2//////////////////////////////
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("str1: ");
        String str1 = scanner.nextLine();

        System.out.print("str2: ");
        String str2 = scanner.nextLine();

        String result = str1.concat(str2);
        String result2 = str2.concat(str1);

        if (result.equals(result2)) {
            System.out.println("String folding is alternating");
        } else {
            System.out.println("String folding is not alternating");
        }

        if (result2.equals(result)) {
            System.out.println("String folding is alternating");
        } else {
            System.out.println("String folding is not alternating");
        }

        //2//////////////////////////////
        System.out.println();

        System.out.print("Enter the word: ");
        String word = scanner.nextLine().toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Word" + word + "is palindrome");
        } else {
            System.out.println("Word" + word + "is not palindrome");
        }

    }
}