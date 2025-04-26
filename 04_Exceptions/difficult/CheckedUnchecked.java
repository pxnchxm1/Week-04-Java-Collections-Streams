// Problem Statement 6: Throwing and Handling Checked and Unchecked
// Exceptions
// Problem:
// Create a method that processes data and throws both checked and unchecked exceptions.
// Handle both types of exceptions in the main method.
//==================================================================================================
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CheckedUnchecked {
    public static void processData(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        try{
            int a = 6;
            int b = 0 ;
            int c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: Division by zero.");
        }
    }
    public static void main(String[] args) {
        try{
            processData(7);
        }catch(InvalidAgeException e){
            System.out.println("Caught InvalidAge exception: " + e.getMessage());
        }
        try{
            processData(20);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        
        
    }
}
