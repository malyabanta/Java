package JavaMultithreading;

import java.util.Random;

public class threadingDemo implements Runnable {

    int x = 10;

    public  void updateMultipliedValue(int y)
    {
        x = x*y;

    }
    public  int getMultipliedValue()
    {
        return x;
    }


    public void run() {
        //System.out.print("do trasaction");
        doTraction();


    }

    public void doTraction()
    {
        updateMultipliedValue( 2);
        int t = getMultipliedValue();
        System.out.println("value of t -> "+ t + " thread id ->" + Thread.currentThread().getId());

    }
}
