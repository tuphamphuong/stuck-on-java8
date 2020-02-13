package java9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class CompletableFutureAPIImprovement {
    public static void main(String[] args) {
        // In Java SE 9, Oracle Corp is going to improve CompletableFuture API to solve some problems raised in Java SE 8.
        // They are going add to support some delays and timeouts, some utility methods and better sub-classing.
        Executor exe = CompletableFuture.delayedExecutor(50L, TimeUnit.SECONDS);
    }
}
