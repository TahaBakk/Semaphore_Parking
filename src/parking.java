import java.util.concurrent.Semaphore;

/**
 * Created by x3727349s on 24/11/16.
 */
public class parking {

    private static final int numSemaphore = 10;
    private final Semaphore plaza = new Semaphore(numSemaphore, true);

    public void entra() {
        for (int i = 0; i < 15; i++) {
            Coche pk = new Coche();
            pk.start();
        }

}
