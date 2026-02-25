package com.card.Bank_Card_Registration.Model;

import java.time.LocalDate;

public class BankCardModel {
    private long cardNumber;
    private int cvv;
    private int pin;
    private String holderName;

    public BankCardModel() {

    }

    public BankCardModel(long cardNumber, int cvv, int pin,  String holderName) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.holderName = holderName;
        this.pin=pin;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public long getCardNumber(){
        return cardNumber;
    }
    public void setCvv(int cvv){
        this.cvv=cvv;
    }
    public int getCvv(){
        return cvv;
    }
    public void setPin(int pin){
        this.pin=pin;
    }
    public int getPin(){
        return pin;
    }
    public void setExpiryDate(LocalDate expiryDate){
        this.expiryDate=expiryDate;
    }


    public void setHolderName(String holderName){
        this.holderName=holderName;
    }

    public String getHolderName() {
        return holderName;
    }
}
