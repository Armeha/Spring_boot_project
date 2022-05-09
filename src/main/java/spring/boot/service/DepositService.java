package spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.entity.Account;
import spring.boot.entity.Bill;
import spring.boot.utils.AccountUtils;

import java.math.BigDecimal;

@Service
public class DepositService {
    private AccountService accountService;
     @Autowired
    public DepositService(AccountService accountService) {
        this.accountService = accountService;



    }
    public Object deposit(Long accountId, BigDecimal paymentAmount) {
        Account account = accountService.getById(accountId);
        Bill defaultBill = AccountUtils.findDefaultBill(account);
        defaultBill.setAmount(defaultBill.getAmount().add(paymentAmount));
        accountService.update(account);
        return "Success";
    }
}
