package com.card.Bank_Card_Registration.Service;

import com.card.Bank_Card_Registration.Model.BankCardModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@Service
public class BankCardService {

    private final HashSet<BankCardModel> bankcards=new HashSet<>();
    public String checkPin(BankCardModel bankCardModel){
        String pin=String.valueOf(bankCardModel.getPin());
        if(pin.length()<5 ){
            return "the pin must be four digits!";
        }
        bankcards.add(bankCardModel);
        return "pin saved!";
    }
    public String checkName(BankCardModel bankCardModel){
        if(bankCardModel.getHolderName()==null || bankCardModel.getHolderName().isEmpty()){
            return " the Holder Name must not be empty";
        }
        bankcards.add(bankCardModel);
        return "name saved!";
    }
    public String checkCardNumber(BankCardModel bankCardModel){
        String cardNumber=String.valueOf(bankCardModel.getCardNumber());
        if(cardNumber.length()<17){
            return "Dear" +bankCardModel.getHolderName()+ ",the card number must be 16 digits!";
        }
        bankcards.add(bankCardModel);
        return "card number saved!";
    }
    public String checkCvv(BankCardModel bankCardModel){
        String cvv=String.valueOf(bankCardModel.getCvv());
        if(cvv.length()<4){
            return "the cvv of your bank card must be 4 digits!";
        }
        bankcards.add(bankCardModel);
        return "cvv saved!";
    }
    public HashSet<BankCardModel> getCardData(){
        return bankcards;
    }
    public HashSet<BankCardModel> deleteCardData(@RequestBody BankCardModel bankCardModel){
        bankcards.remove(bankCardModel);
        return bankcards;
    }

}
