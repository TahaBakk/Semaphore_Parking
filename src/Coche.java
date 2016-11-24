/**
 * Created by x3727349s on 24/11/16.
 */
public class Coche extends Thread{

    @Override
    public void run() {
        try {
            plaza.acquire();
        } catch (InterruptedException e) {
            System.out.println("received InterruptedException");
            return;
        }
        //System.out.println("Thread " + this.getId() + " start using Crunchify's car - Acquire()");
        System.out.println("El coche "+ getId()+" consigue plaza");
        try {
            sleep(1000);
        } catch (Exception e) {

        } finally {

            // Release Lock
            plaza.release();
        }
        //System.out.println("Thread " + this.getId() + " stops using Crunchify's car -  Release()\n");
        System.out.println("El coche "+getId()+ " abandona el parking");
    }
}

}
