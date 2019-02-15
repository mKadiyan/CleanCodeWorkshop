package com.thoughtworks.account;

import com.thoughtworks.error.BalanceException;

public class Account {
    private String customerFirstName;
    private String customerLastName;
    private int areaCode;
    private int telephoneNumber;
    private double accountBalance;
    private boolean isAccountActive = true;
    private String accountType ="";

    public void addBalance(double i){
        if(i < 1.0)
            throw new BalanceException("Balance is not valid");
        this.accountBalance += i;
    }

    public void updateAccountBalance(){
        if(this.accountBalance < 1.0)
            throw new BalanceException("Balance is not valid");
        switch (accountType){
            case "Individual" :
                //Below part will update the account balance by applying 10 % of interest rate
                this.accountBalance += this.accountBalance * 5/100;
                break;
            case "Salary" :
                //Below part will update the account balance by applying 10 % of interest rate
                this.accountBalance += this.accountBalance * 10/100;
                break;
            default:
                //Below part will update the account balance by applying 10 % of interest rate
                this.accountBalance += this.accountBalance * 5/100;
        }



    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isAccountActive() {
        return isAccountActive;
    }

    public void setAccountActive(boolean accountActive) {
        isAccountActive = accountActive;
    }
}
