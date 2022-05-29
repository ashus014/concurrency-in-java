package src;

public class MainThead {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello from Main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        //Thread.sleep(1);

        //creating anonymous Thread Class
        new Thread(){
            public void run(){
                System.out.println("Running from Anonymous Class");
            }
        }.start();


        System.out.println("Hello from Main thread");

    }
}
