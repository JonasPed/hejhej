package sandbox;

import java.time.ZonedDateTime;
import java.util.concurrent.Callable;

public class CallableType implements Callable<Long> {
    @Override
    public Long call() {
        boolean x = true;
        while(x) {
            System.out.println("Work done: " + ZonedDateTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        return 1234L;
    }
}
