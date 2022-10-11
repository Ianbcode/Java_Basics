package main;
//project 1

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
    }
}