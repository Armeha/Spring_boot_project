package spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.controller.DTO.DepositDTO;
import spring.boot.service.DepositService;

@RestController
public class DepositController {

    private final DepositService depositService;

    @Autowired
    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }


@PostMapping("/deposit")
    public Object deposit(@RequestBody DepositDTO depositDTO) {
        return depositService.deposit(depositDTO.getAccountId(), depositDTO.getAmount());
    }
}
