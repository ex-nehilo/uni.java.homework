package firstTask.employeesTask.classes;

public class SalaryException extends Exception{
    public SalaryException() {
    }

    public SalaryException(String message) {
        super(message);
    }

    public SalaryException(String message, Throwable cause) {
        super(message, cause);
    }

    public SalaryException(Throwable cause) {
        super(cause);
    }

    public SalaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
