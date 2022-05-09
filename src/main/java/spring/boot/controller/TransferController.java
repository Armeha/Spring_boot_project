package spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.controller.DTO.TransferDTO;
import spring.boot.service.TransferService;

@RestController
public class TransferController {
    private final TransferService transferService;
    @Autowired
    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public Object transfer(@RequestBody TransferDTO transferDTO){
      return   transferService.transfer(transferDTO.getAccountIdFrom(), transferDTO.getAccountIdTo(), transferDTO.getAmount());

    }
}
