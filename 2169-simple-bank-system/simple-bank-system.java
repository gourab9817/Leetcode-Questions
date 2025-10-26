class Bank {
    private long[] accounts;

    public Bank(long[] balance) {
        accounts = balance;
    }

    private boolean isValid(int account) {
        return account >= 1 && account <= accounts.length;
    }

    public boolean transfer(int fromAccount, int toAccount, long amount) {
        if (!isValid(fromAccount) || !isValid(toAccount)) return false;
        if (accounts[fromAccount - 1] < amount) return false;
        
        accounts[fromAccount - 1] -= amount;
        accounts[toAccount - 1] += amount;
        return true;
    }

    public boolean deposit(int account, long amount) {
        if (!isValid(account)) return false;
        accounts[account - 1] += amount;
        return true;
    }

    public boolean withdraw(int account, long amount) {
        if (!isValid(account)) return false;
        if (accounts[account - 1] < amount) return false;
        
        accounts[account - 1] -= amount;
        return true;
    }
}
