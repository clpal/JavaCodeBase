package exceptions;

public class InvalidUserException extends  RuntimeException{
    public  InvalidUserException(String message){
        super(message);
    }
    public  InvalidUserException(String message,Throwable throwable){
        super(message,throwable);

}
}
