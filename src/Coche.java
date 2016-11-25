import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Created by x3727349s on 24/11/16.
 */
public class Coche extends Thread{

    final int numSemaphore = 5;
    final Semaphore plaza = new Semaphore(numSemaphore, true);

    @Override
    public void run() {

        Random rd = new Random();
        int numEstada=0;

        try {
            //coche aparca
            plaza.acquire();
            System.out.println("El coche "+ getId()+" consigue plaza");
        } catch (InterruptedException e) {
            System.out.println("received InterruptedException");
            return;
        }
        try {
             numEstada = rd.nextInt(60)+1;
            sleep(numEstada);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // El coche sale
            plaza.release();
            System.out.println("El coche "+getId()+ " abandona el parking"+numEstada);

        }
    }
}


