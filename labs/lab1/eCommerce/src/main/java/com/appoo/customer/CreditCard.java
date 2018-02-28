package com.appoo.customer;

public class CreditCard
{

    private String holderName;
    private int cardNumber;
    private int accountBalance;
    private double spendingLimit;

    public CreditCard(String name, int card, int balance, double limit, int level)
    {
        holderName = name;
        cardNumber= card;
        accountBalance = balance;
        spendingLimit = limit;
    }

    public String getName()
    {
        return holderName;
    }

    public int getCreditCardNumber()
    {
        return cardNumber;
    }

    public int getBalance()
    {
        return accountBalance;
    }

    public double getSpendingLimit()
    {
        return spendingLimit;
    }

    public void setCardNumber(int cardNumber)
    {

        if( getSize(cardNumber) >= 13  && getSize(cardNumber) <= 16 )
        {
            this.cardNumber = cardNumber;
        }
        else
        {
            System.out.println("Error: Invalid card number");
        }

    }

    private int getSize(long d){
        int count = 0;

        while (d > 0) {
            d = d / 10;
            count++;
        }

        return count;
    }

}