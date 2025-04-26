
class TransactionException extends Exception {
    public TransactionException(String message) {
        super(message);
    }

    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class TransactionProcessor {

    public void processTransaction(String transactionId, double amount) throws TransactionException {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Amount cannot be negative.");
            }
            System.out.println("Transaction " + transactionId + " processed for amount: $" + amount);

        } catch (IllegalArgumentException e) {
            throw new TransactionException("Failed to process transaction ID: " + transactionId + " with amount: $" + amount, e);
        }
    }
    public static void main(String[] args) {
        TransactionProcessor processor = new TransactionProcessor();
        try {
            processor.processTransaction("TXN12345", -100.0);  
        } catch (TransactionException e) {
            System.err.println("Custom Exception Caught:");
            System.err.println("Message: " + e.getMessage());
            System.err.println("Cause: " + e.getCause());
        }
    }
}
