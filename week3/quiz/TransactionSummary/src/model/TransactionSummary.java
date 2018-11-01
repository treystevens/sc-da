package model;

import java.util.ArrayList;
import java.util.List;

public class TransactionSummary {

    private String name;
    private List<Transaction> transactions;

    public TransactionSummary(String name) {

        this.name = name;
        transactions = new ArrayList<>();
    }

    // getters
    public String getName() {
        return name;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }
    public int getNumTransactions() {
        return transactions.size();
    }

    // REQUIRES: t is not already within transactions
    // MODIFIES: this
    // EFFECTS: adds the given transaction t to the list of transactions
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: computes the average amount of money spent on a transaction
    public double averageTransactionCost() {

        int totalAmount = 0;

        for(Transaction t : transactions){
            totalAmount += t.getAmount();
        }
        return totalAmount / transactions.size();
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS:  returns the average cost of all transactions of type specificType in this
    //           TransactionSummary
    public double specificTypeAverage(TransactionType specificType) {

        double totalAmount = 0;
        int count = 0;
        boolean valid = false;

        for(TransactionType type : TransactionType.values()){
            if(type.equals(specificType)){
                valid = true;
            }
        }

        if(!valid) return 0;

        for(Transaction t : transactions){
            if(t.getType().equals(specificType)){
                totalAmount += t.getAmount();
                count++;
            }

        }

        return totalAmount / count;
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: returns the largest transaction (in terms of cost) in this TransactionSummary
    public Transaction largestTransaction() {

        int largest = 0;
        Transaction largestTrans = null;

        for(Transaction t : transactions){
            if(t.getAmount() > largest){
                largest = t.getAmount();
                largestTrans = t;
            }
        }
        return largestTrans;
    }

    // EFFECTS: returns true if the given transaction is contained within the list of transactions
    public boolean contains(Transaction t) {

        return transactions.contains(t);
    }


}
