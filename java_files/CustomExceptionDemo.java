class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void checkMarks(int m) throws InvalidMarksException {
        if (m < 0 || m > 100)
            throw new InvalidMarksException("Invalid marks");
        System.out.println("Valid marks");
    }

    public static void main(String[] args) {
        try {
            checkMarks(120);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
