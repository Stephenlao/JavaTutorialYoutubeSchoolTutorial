package javaTutorialSchool.week10.question4;

// create custom exception needs to using extends Exception
public class ValidationException extends Exception {
    public ValidationException(String name) {
        super(name);
    }
}
