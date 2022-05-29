package src;

public class MainThead {

    public static void main(String[] args) {

        System.out.println("Hello from Main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
    }
}
