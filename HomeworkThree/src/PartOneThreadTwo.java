/**
 * extends the thread class and override run
 * make the timing 3 seconds instead of one
 */
public class PartOneThreadTwo extends Thread{

    @Override
    public void run() {

        //counter
        int i = 0;

        // while loop to continue running
        while(true){
            System.out.println("\t" + i + " three second has passed");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                System.out.println("Error");
            }
            i ++;
        }
    }
}
