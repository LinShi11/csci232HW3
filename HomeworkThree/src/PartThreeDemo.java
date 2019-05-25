// import what is needed
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Lin Shi
 *
 * This working with file part 3 question
 *
 * it does not contain any other class
 * but it does use fileOne and fileTwo to read
 * and output to a diff.txt file
 *
 * it will read line to line from fileOne and fileTwo and compare it line to line
 * if they are different it will print the line from fileTwo to diff.txt
 * if they are the same nothing will be printed
 */

public class PartThreeDemo {
    // main function
    public static void main(String[] args){
        // add the paths to the files
        File fileOne = new File("fileOne.txt");
        File fileTwo = new File("fileTwo.txt");
        File outFile = new File("diff.txt");

        //try catch
        try{
            //use scanner to read and printwriter to write
            Scanner inputOne = new Scanner(fileOne);
            Scanner inputTwo = new Scanner(fileTwo);
            PrintWriter output = new PrintWriter(outFile);
            // when both of them has a line
            while(inputOne.hasNextLine() && inputTwo.hasNextLine()){
                // a temp string to hold what is in fileTwo
                String temp = inputTwo.nextLine();
                if(inputOne.nextLine().equals(temp)){
                    // if they are equal continue
                    continue;
                }
                else{// if they are different print to output of the temp
                    output.println(temp);
                }
            }

            // close all the files
            inputOne.close();
            inputTwo.close();
            output.close();
        }catch(FileNotFoundException e){// catch what could be wrong
            System.out.println("Error");
        }
    }

}
