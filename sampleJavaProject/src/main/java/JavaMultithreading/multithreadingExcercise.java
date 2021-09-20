package JavaMultithreading;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class multithreadingExcercise {
    public static void main(String[] args)
    {

        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i =0;i<10;i++){
            service.execute(new threadingDemo());
        }

        service.shutdown();
        //service.awaitTermination(1,TimeUnit.DAYS);

    }



}
