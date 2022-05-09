package spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spring.boot.controller.DTO.AccountDTO;
import spring.boot.controller.DTO.AccountDTO2;
import spring.boot.controller.DTO.BillDTO;
import spring.boot.controller.DTO.BillDTO2;
import spring.boot.entity.Account;
import spring.boot.entity.Bill;
import spring.boot.service.AccountService;

import javax.persistence.GeneratedValue;
import java.util.stream.Collectors;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts/{accountId}")
    public AccountDTO getById(@PathVariable Long accountId) {
        return new AccountDTO(accountService.getById(accountId));
    }

    @PostMapping("/accounts")
    public Long create(@RequestBody AccountDTO2 accountRequestDTO) { //это будет шаблоном для запроса
        return accountService.save(accountRequestDTO.getName(),
                accountRequestDTO.getEmail(), accountRequestDTO.getBill().stream()
                        .map(billDTO2 -> new Bill(billDTO2.getAmount(), billDTO2
                                .getDefault()))
                        .collect(Collectors.toList()));
    }
}
