package exceptions;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String messsage){
        super(messsage);
    }
    public InvalidAgeException(String messsage,Throwable throwable){
        super(messsage,throwable);
    }
}
