/**
 * extends thread and override the run function
 * use sleep so it can have one second
 */
public class PartOneThreadOne extends Thread{

    @Override
    public void run() {

        // counter
        int i = 0;

        // while loop to continue running
        while(true){
            System.out.println( i + " one second has passed");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error");
            }
            i++;
        }
    }
}
