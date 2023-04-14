//project 1
package main;
//import java.math.*;
import main.Utils.utils_1;

public class run_main{
    public static void main(String[] args) throws Exception{
        //Normal Print Statement
        System.out.println("Hello World");
        //Creating another Class instance
        //Call method 1, Call method 2, Print method 2 return value
        writing_script writing = new writing_script();
        writing.helloWorld();
        writing_script.helloMars();
        System.out.println(writing_script.helloMars());

         // find the closest int for the double
        double x = 79.52;    
        System.out.println(Math.round(x));  
        
        //2nd Class instance
        //utils_1 util = new utils_1();
        utils_1.helloMars_utils();
    }
}