package Entities;

public class Account {

    private String holder;
    private final int accountNumber;
    private double balance;

    public Account(String holder, int accountNumber) {
        this.holder = holder;
        this.accountNumber = accountNumber;
    }

    public Account(String holder, int accountNumber, double deposit) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.deposit(deposit);
    }

    /*
     * Os métodos Get e Set foram incluídos neste código para cumprir com a proposta do enunciado,
     * mesmo que não sejam utilizados diretamente neste momento.
     */

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }

    public String toString() {
        return "Account " +
                this.accountNumber +
                ", Holder: " +
                this.holder +
                ", Balance: $ " +
                String.format("%.2f", this.balance);
    }
}