package Office_Hours.Practice_09_16_2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
       // System.out.println(9/0); //Must occure during runtime
        Thread.sleep(3000); // Must occure during compile time
        System.out.println("Completed");

        new FileInputStream("Alex");
    }



}
