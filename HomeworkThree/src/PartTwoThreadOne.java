/**
 * implements runnable
 */

public class PartTwoThreadOne implements Runnable{

    //define the variables
    private PartTwoDemo demo;
    private int threadNumber;

    //constructor
    public PartTwoThreadOne(PartTwoDemo demo, int threadNumber){
        this.demo = demo;
        this.threadNumber = threadNumber;
    }


    public void run(){
        try{
            while(true){

                //use synchronize
                synchronized(demo) {
                    int number = demo.add();
                    //the print statement
                    System.out.println("The thread " + threadNumber + " inserted: " + number);
                }
                //sleep for 0.5 second
                Thread.sleep(500);
                }
            }catch(InterruptedException exc){
                System.out.println("Error");
            }
    }

}
