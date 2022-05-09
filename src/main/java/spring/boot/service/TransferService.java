package spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.entity.Account;
import spring.boot.entity.Bill;
import spring.boot.exceptions.NotDefaultBillException;
import spring.boot.utils.AccountUtils;

import java.math.BigDecimal;

@Service
public class TransferService {
    private final AccountService accountService;

    @Autowired
    public TransferService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Object transfer(Long accountIdFrom, Long accountIdTo, BigDecimal amount) {
        Account accountFrom = accountService.getById(accountIdFrom);
        Account accountTo = accountService.getById(accountIdTo);
        Bill bill = AccountUtils.findDefaultBill(accountFrom);

        Bill billTo =AccountUtils.findDefaultBill(accountTo);
        bill.setAmount(bill.getAmount().subtract(amount));
        billTo.setAmount(billTo.getAmount().add(amount));
        accountService.update(accountFrom);
        accountService.update(accountTo);
        return "Success";


    }



}