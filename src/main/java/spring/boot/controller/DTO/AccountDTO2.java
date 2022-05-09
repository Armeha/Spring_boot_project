package spring.boot.controller.DTO;

import java.util.List;

public class AccountDTO2 {
    private String name;
    private String email;
    private List<BillDTO2> bill;

    public AccountDTO2(String name, String email, List<BillDTO2> bill) {
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public AccountDTO2() {
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

    public List<BillDTO2> getBill() {
        return bill;
    }

    public void setBill(List<BillDTO2> bill) {
        this.bill = bill;
    }
}
