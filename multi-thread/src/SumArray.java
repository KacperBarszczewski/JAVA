public class SumArray {
    private int sum;

    int sumArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println(Thread.currentThread().getName() + " compute the subtotal " + sum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread has been discontinued");
            }
        }
        return sum;
    }
}

class MyThreadSync implements Runnable {
    Thread thread;
    static SumArray sa = new SumArray();
    int a[], answer;

    MyThreadSync(String name, int nums[]) {
        thread = new Thread(this, name);
        a = nums;
    }

    public static MyThreadSync createAndStart(String name, int nums[]) {
        MyThreadSync myThreadSync = new MyThreadSync(name, nums);
        myThreadSync.thread.start();
        return myThreadSync;
    }

    public void run() {
        System.out.println(thread.getName() + " start new working");
        answer = sa.sumArray(a);
        System.out.println(thread.getName() + " count sum = " + answer);
        System.out.println(thread.getName() + " end working");
    }

}
