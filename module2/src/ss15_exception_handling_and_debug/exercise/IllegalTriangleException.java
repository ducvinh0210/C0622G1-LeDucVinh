package ss15_exception_handling_and_debug.exercise;

public class IllegalTriangleException extends Exception {
    public void IllegalArgumentException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
