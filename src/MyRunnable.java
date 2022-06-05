package src;

import static src.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable");
    }
}
