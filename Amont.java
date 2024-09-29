public class Amount {
    private double amount;
    private TransactionType transactionType;
    private String date;

    public Amount(double amount, TransactionType transactionType, String date) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction on " + date + " - " + transactionType + ": " + amount;
    }
}
