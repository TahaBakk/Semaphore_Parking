import java.util.concurrent.Semaphore;

/**
 * Created by x3727349s on 24/11/16.
 */
public class parking {

    public void entra(int coches) {
        for (int i = 0; i < coches; i++) {
            Coche pk = new Coche();
            pk.start();
        }

    }
}
