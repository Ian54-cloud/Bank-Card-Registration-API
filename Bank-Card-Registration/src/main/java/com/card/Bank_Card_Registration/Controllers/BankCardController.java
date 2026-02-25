package com.card.Bank_Card_Registration.Controllers;

import com.card.Bank_Card_Registration.Model.BankCardModel;
import com.card.Bank_Card_Registration.Service.BankCardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("/banks")
public class BankCardController {

    private BankCardService bankCardService;
    public BankCardController(BankCardService bankCardService){
        this.bankCardService=bankCardService;
    }
   @PostMapping("/cards")
    public BankCardModel insertCardDetails(@RequestBody BankCardModel bankCardModel){
        bankCardService.checkCardNumber(bankCardModel);
        bankCardService.checkCvv(bankCardModel);
        bankCardService.checkName(bankCardModel);
        bankCardService.checkPin(bankCardModel);
        return bankCardModel;
   }
@GetMapping("/cards")
    public HashSet<BankCardModel>getCardData(){
        return bankCardService.getCardData();
}
@DeleteMapping("/cards")
    public HashSet<BankCardModel>deleteCardData(@RequestBody BankCardModel bankCardModel){
        return bankCardService.deleteCardData(bankCardModel);
}

}
