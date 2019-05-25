/**
 * @author Lin Shi
 *
 * Threading Part One question
 *
 * the other classes being PartOneThreadOne and PartOneThreadTwo
 * PartOneThreadOne is the one second
 * PartOneThreadTwo is the three second
 * only override the run() in both of the thread classes
 */

public class Demo {
    public static void main(String[] args){

        //create a new instance of the class
        PartOneThreadOne threadOne = new PartOneThreadOne();
        PartOneThreadTwo threadTwo = new PartOneThreadTwo();

        //use start so it is thread
        threadOne.start();
        threadTwo.start();

    }
}
