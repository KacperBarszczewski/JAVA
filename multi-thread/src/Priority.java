public class Priority implements Runnable {
    int count;
    Thread thread;
    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.println(thread.getName() + " Start working");

        do {
            count++;
            if (currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println(currentName + " working");
            }
        } while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + thread.getName() + " end working");
    }
}
