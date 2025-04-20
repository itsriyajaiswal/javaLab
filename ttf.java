public class ExceptionHandlingExample {
    
    public static void checkNumber(int num) throws IllegalArgumentException {
        if (num < 0) {
           
            throw new IllegalArgumentException("Number cannot be negative!");
        }
        System.out.println("Number is valid: " + num);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Attempting to validate number...");
            
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            
            System.out.println("Execution of 'finally' block completed.");
        }
    }
}
