package com.company;

public class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String insufficient_funds)
    {
        super(insufficient_funds);
    }
}
