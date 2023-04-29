import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        int[] tab = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        ////////////////////////////////////////////////////
        System.out.println("Tab: " + Arrays.toString(tab));

        for (int i = 0; i < tab.length - 1; i++) {

            if (tab[i] > tab[i + 1]) {
                int temp = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = temp;
            }
        }
        System.out.println("After one loop Tab: " + Arrays.toString(tab));
        /////////////////////////////////////////////////////////
        int counter = 0;
        tab = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
                counter++;
                counter++;
            }
            counter++;
        }
        System.out.println("After two loop Tab: " + Arrays.toString(tab) + " iterations: " + counter);
        ////////////////////////////////////////////////////////////
        counter = 0;
        boolean bool;
        tab = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < tab.length; i++) {
            bool = false;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                    bool = true;
                }
                counter++;
                counter++;
            }
            counter++;
            if (!bool) {
                break;
            }
            counter++;
        }
        System.out.println("After two loop Tab: " + Arrays.toString(tab) + " iterations: " + counter);


        //2////////////////////////////////////////////////////////
        System.out.println("//////2");

        tab = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Tab: " + Arrays.toString(tab));

        int index = 0;
        int min = 100;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                index = i;
            }
        }
        System.out.println("the minimum value is on the index: " + index);
        /////////////////////////////////////////////////////////
        tab = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        counter = 0;
        int minIndex = 0;
        int maxIndex = 0;


        for (int i = 0; i < tab.length; i++) {

            for (int j = i; j < tab.length; j++) {
                counter++;

                if (tab[i] < tab[minIndex]) {
                    minIndex = i;
                } else if (tab[i] > tab[maxIndex]) {
                    maxIndex = i;
                }
                counter++;
                counter++;
            }
            counter++;

        }
        System.out.println("Tab: " + Arrays.toString(tab) + " the minimum on index: " + minIndex + " the maximum on index: " + maxIndex + " iterations: " + counter);
        //3//////////////////////////////////////////////////////
        System.out.println("/////3 ");

        tab = new int[]{1, 10, 9, 7, 3, 6, 5, 8, 2, 4};

        System.out.println("Tab before: " + Arrays.toString(tab));

        quickSort(tab, 0, tab.length - 1);

        System.out.println("Tab after: " + Arrays.toString(tab));

    }

    public static void quickSort(int[] tab, int min, int max) {
        if (min < max) {
            int tempIndex = partition(tab, min, max);
            quickSort(tab, min, tempIndex - 1);
            quickSort(tab, tempIndex + 1, max);
        }
    }

    private static int partition(int[] tab, int min, int max) {
        int pivot = tab[max];
        int i = min - 1;
        for (int j = min; j <= max - 1; j++) {
            if (tab[j] <= pivot) {
                i++;
                change(tab, i, j);
            }
        }
        change(tab, i + 1, max);
        return i + 1;
    }

    private static void change(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}