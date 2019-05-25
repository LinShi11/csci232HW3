/**
 * @author Lin Shi
 *
 * Threading Part two question
 *
 * the only other class being PartTwoThreadOne
 * create a extremely huge array and try to use the three threads to add random numbers
 *
 */

public class PartTwoDemo {

    //define the private pointer and array
    private int[] array;
    private int index;

    //constructor
    public PartTwoDemo(){
        this.array = new int[99999999];
        this.index = 0;
    }

    // add random numbers
    public int add(){
        int num = (int)(Math.random() * 1000);
        this.array[this.index] = num;
        this.index ++;
        return num;
    }

    // the main function
    public static void main(String[] args){
        PartTwoDemo demo = new PartTwoDemo();
        //start four threads
        new Thread(new PartTwoThreadOne(demo, 1), "Thread 1").start();
        new Thread(new PartTwoThreadOne(demo, 2), "Thread 2").start();
        new Thread(new PartTwoThreadOne(demo, 3), "Thread 3").start();
        new Thread(new PartTwoThreadOne(demo, 4), "Thread 4").start();
    }


}
