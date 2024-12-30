package lld1.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {
    public static void main(String[] args) { // throws FileNotFoundException { - exception thrown to JVM
        Student student = new Student();
        //student.divideExampleAE();
        //student.getById();
        //student.readFile();
//        try {
//            student.readFile2();
//        }catch(FileNotFoundException e) {
//           System.out.println("File not found");
//           // e.printStackTrace(); -prints exception.
//        }

 //       student.doSomething4();

 //       System.out.println(student.printFirst());
        try {
            student.findStudentById(5);
        }
        catch (StudentNotFoundException e){
           System.out.println(e);
        }
        System.out.println("last statement in main");
    }
}
