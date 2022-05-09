package spring.boot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private String name;
    private String email;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Bill> bill;

    public Account(String name, String email, List<Bill> bill) {
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public Account() {
    }

    public Long getAccountId() {
        return accountId;
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

    public List<Bill> getBill() {
        return bill;
    }

    public void setBill(List<Bill> bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bill=" + bill +
                '}';
    }
}
