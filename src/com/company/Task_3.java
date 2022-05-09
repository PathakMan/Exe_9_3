package com.company;

class AccountMan {
    String owner, AccountNumber;
    int Balance;

    public AccountMan(String owner, String AccountNumber, int Balance) {
        this.owner = owner;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void Transfer(int amount) throws InsufficientFundsException {
        if (Balance > amount) {
            Balance -= amount;
        } else {
            throw new InsufficientFundsException ("Insufficient Funds");
        }
    }

}

public class Task_3 {

    public static void main(String[] args) throws InsufficientFundsException
    {
        AccountMan U1 = new AccountMan("Manthan","3256 4587 9856 1254",6000);
        AccountMan U2 = new AccountMan("lily","4512 5623 7946 4613",5500);

        try
        {
            U2.Transfer(2500);
        }
        catch (InsufficientFundsException IF)
        {
            System.out.println(IF);
        }
        finally
        {
            System.out.println("Balance on your Bank Account is " + U2.Balance);
        }

    }
}
