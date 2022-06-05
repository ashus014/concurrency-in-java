package src;

import static src.ThreadColor.*;

public class MainThead {

    public static void main(String[] args) throws InterruptedException {

        System.out.println( ANSI_PURPLE + "Hello from Main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("---ANOTHER THREAD---");
        anotherThread.start();
        //Thread.sleep(1);

        //creating anonymous Thread Class
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Running from Anonymous Class");
            }
        }.start();

        //Passing my runnable reference while instantiating Object
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello from Main thread...AGAIN!!!");

    }
}
