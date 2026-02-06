class MyTask implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyTask task = new MyTask();

        Thread t1 = new Thread(task);
        t1.start();
    }
}
