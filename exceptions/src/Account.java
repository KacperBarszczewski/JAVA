public class Account {
    String owner;
    int balance;
    int accountNumber;

    public Account(String owner, int balance, int accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public void transfer(int howMMoney) throws NotEnoughMoneyException {
        if (this.balance >= howMMoney) {
            this.balance = this.balance - howMMoney;
        } else {
            throw new NotEnoughMoneyException("Not enough money in the account");
        }
    }
}

class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String s) {
        super(s);
    }
}
