package lld1.ExceptionHandling;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String s){
        super("not found from exception class");
    }
}
