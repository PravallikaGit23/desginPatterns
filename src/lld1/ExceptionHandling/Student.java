package lld1.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Student {
    private int id;
    private String name;

    public void divideExampleAE() { //throws ArithmeticException{
      //  try {
            int a = 10;
            int b = 0 ;
            int c = b>0 ? a / b : 0;
            System.out.println(c);
 //UncheckedException - logical solution not need to handle instaed solve the logical error.
//        }
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }

//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at lld1.ExceptionHandling.Student.divideExampleAE(Student.java:10)
//        at lld1.ExceptionHandling.Client.main(Client.java:10)

    }

    public void getById() {
        String string = getFromApi();
        System.out.println(string.length());
        /*
                Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "string" is null
                at lld1.ExceptionHandling.Student.getById(Student.java:27)
                at lld1.ExceptionHandling.Client.main(Client.java:11)
        */
    }
    public String getFromApi() {
        return null;
    }

    public void readFile(){

            try {
                File file = new File("abc.txt");
                FileReader fileReader = new FileReader(file);

                System.out.println("Printing after exception inside try");
            } catch (FileNotFoundException ex) {
                System.out.println("File not found. Please check the filename");
            }

            System.out.println("Printing after exception from readFile");

    }

    public void readFile2() throws FileNotFoundException {
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);

        System.out.println("Printing after exception inside try");
    }

    /*
     * Java allows us to have multiple catch blocks.
     * if the exceptions are unrelated (they are not part of the same hierarchy)
     * then ordering in multiple catch blocks does not matter
     *
     * if they are related, the more specific exception class needs to come
     * first and then the more generic class
     * */
    public void doSomething4() {
        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);


            if(true) {
                throw new SQLException();
            }

            if(true) {
                throw new IOException();
            }
        } catch (SQLException ex) {
            System.out.println("Retry");
        } catch (FileNotFoundException ex) {
            System.out.println("Please try again by inputting correct filenam");
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        } catch (Exception ex) {
            System.out.println("exception caught");
        }

        System.out.println("Executing  normally from now on");
    }

    public int printFirst(){
        try{
            if(false) {
                throw new IOException("io exception thrown");
            }
            System.out.println("Printing after exception inside try");
            //before returning anything from try finally will be executed always.
            return 1;   // without if it is - unreachable statement
        }
        catch(IOException e){
            System.out.println("IO exception thrown");
        }
        finally {
            // This block will get executed no matter what
            // Including if there is a return
            // Finally block is used to clean up resources
            // End the connection
            // Close the file, etc
            System.out.println("finally executed from now on");
            return 2;
        }

        // What is the difference between final, finally and finalize
        // final -> declare a variable as constant. Can also be attached at a class level
        // which means the class cannot be extended
        // finally -> block that is used with try-catch
        // finalize -> a method called right before an object is destroyed


    }
    public Student findStudentById(int id) throws StudentNotFoundException {
        if(true)
           throw new StudentNotFoundException("Student with id is not found.");

        return null;
    }



}
