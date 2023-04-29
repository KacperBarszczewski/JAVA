public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("tik ");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread stop working");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("tak ");
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread stop working");
        }
    }
}

class MyThreadClock implements Runnable {
    Thread thread;
    TickTock ttOb;

    MyThreadClock(String name, TickTock tt) {
        thread = new Thread(this, name);
        ttOb = tt;
    }

    public static MyThreadClock createAndStart(String name, TickTock tt) {
        MyThreadClock myThreadClock = new MyThreadClock(name, tt);
        myThreadClock.thread.start();
        return myThreadClock;
    }

    public void run() {
        if (thread.getName().compareTo("tik") == 0) {
            for (int i = 0; i < 5; i++) {
                ttOb.tick(true);
                ttOb.tick(false);
            }


        } else {
            for (int i = 0; i < 5; i++) {
                ttOb.tock(false);
                ttOb.tock(true);
            }


        }
    }
}
