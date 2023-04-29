public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread start working");

        MyThreadVer3 myThreadVer1 = MyThreadVer3.createAndStart("Thread nr.1");
        MyThreadVer3 myThreadVer2 = MyThreadVer3.createAndStart("Thread nr.2");
        MyThreadVer3 myThreadVer3 = MyThreadVer3.createAndStart("Thread nr.3");

        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread break working");
            }
        } while (myThreadVer1.thread.isAlive() || myThreadVer2.thread.isAlive() || myThreadVer3.thread.isAlive());

        System.out.println("Main thread end working");

        //2///////////////////////////
        System.out.println("/////////2");

        TickTock tt = new TickTock();
        MyThreadClock myThreadClock1 = MyThreadClock.createAndStart("tik", tt);
        MyThreadClock myThreadClock2 = MyThreadClock.createAndStart("tak", tt);

        try {
            myThreadClock1.thread.join();
            myThreadClock2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread stop working");
        }


        //3///////////////////////////
        System.out.println("/////////3");

        Priority mt1 = new Priority("High priority");
        Priority mt2 = new Priority("Low priority");
        Priority mt3 = new Priority("Thread nr.1 Normal priority");
        Priority mt4 = new Priority("Thread nr.2 Normal priority");
        Priority mt5 = new Priority("Thread nr.3 Normal priority");

        mt1.thread.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thread.setPriority(Thread.NORM_PRIORITY-2);

        mt1.thread.start();
        mt2.thread.start();
        mt3.thread.start();
        mt4.thread.start();
        mt5.thread.start();

        try{
            mt1.thread.join();
            mt2.thread.join();
            mt3.thread.join();
            mt4.thread.join();
            mt5.thread.join();
        }catch (InterruptedException e){
            System.out.println("Main Thread start working");
        }
        System.out.println("\nHigh priority Thread count to "+mt1.count);
        System.out.println("Low priority Thread count to "+mt2.count);
        System.out.println("nr.1 Thread normal priority  count to "+mt3.count);
        System.out.println("nr.2 Thread normal priority  count to "+mt4.count);
        System.out.println("nr.3 Thread normal priority  count to "+mt5.count);


        //4///////////////////////////
        System.out.println("/////////4");
        int a[]={1,2,3,4,5};
        MyThreadSync myThreadSync1=MyThreadSync.createAndStart(" Thread nr.1",a);
        MyThreadSync myThreadSync2=MyThreadSync.createAndStart(" Thread nr.2",a);

        try{
            myThreadSync1.thread.join();
            myThreadSync2.thread.join();
        }catch (InterruptedException e){
            System.out.println(" Main thread end working");
        }

    }
}
