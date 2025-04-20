// Define a custom exception
class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
   
    public static void checkString(String input) throws NoMatchException {
        if (!"India".equals(input)) {
            
            throw new NoMatchException("String does not match 'India'");
        }
        System.out.println("The string matches: " + input);
    }

    public static void main(String[] args) {
        String testString = "Japan"; 
        try {
            System.out.println("Checking the string...");
            checkString(testString);
        } catch (NoMatchException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            
            System.out.println("Process completed!");
        }
    }
}
