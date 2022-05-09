package spring.boot.controller.DTO;

import spring.boot.entity.Account;
import spring.boot.entity.Bill;

import java.util.List;
import java.util.stream.Collectors;

public class AccountDTO {
    private Long accountId;
    private String name;
    private String email;
    private List<BillDTO> bill;

    public AccountDTO(Account account) {
        accountId = account.getAccountId();
        name = account.getName();
        email = account.getEmail();
        bill = account.getBill().stream().map(BillDTO::new).collect(Collectors.toList()); //map преобразует один класс в другой все благодаря стриму
    }

    public AccountDTO(Long accountId, String name, String email, List<BillDTO> bill) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BillDTO> getBill() {
        return bill;
    }

    public void setBill(List<BillDTO> bill) {
        this.bill = bill;
    }
}
