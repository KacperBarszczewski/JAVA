public class MyThreadVer3 implements Runnable {
    Thread thread;

    MyThreadVer3(String name) {
        thread = new Thread(this, name);
    }

    public static MyThreadVer3 createAndStart(String name) {
        MyThreadVer3 myThreadVer3 = new MyThreadVer3(name);
        myThreadVer3.thread.start();
        return myThreadVer3;
    }

    public void run() {
        System.out.println(thread.getName() + " start working");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(thread.getName() + " it's working, counter: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " break working");
        }
        System.out.println(thread.getName() + " end working");

    }
}
