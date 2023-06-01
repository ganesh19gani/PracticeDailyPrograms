public class ThreadExample extends Thread {

    public void run() {

        System.out.println("Thread  is running.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(String.format("Ganesh %s", i));
                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
        System.out.println("Thread finished.");
    }

    public static void main(String[] args) {
        System.out.println("Main thread started.");
        ThreadExample thread1 = new ThreadExample();
        thread1.start();
        System.out.println("Main thread finished.");
    }
}






