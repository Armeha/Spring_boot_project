package spring.boot.entity;

import spring.boot.controller.DTO.BillDTO2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billId;
    private BigDecimal amount;
    private boolean isDefault;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean getDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public Bill(BigDecimal amount, boolean isDefault) {
        this.amount = amount;
        this.isDefault = isDefault;
    }
public  Bill(BillDTO2 billDTO2){
        amount = billDTO2.getAmount();
        isDefault=billDTO2.getDefault();
}
    public Long getBillId() {
        return billId;
    }

    public Bill() {
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", amount=" + amount +
                ", isDefault=" + isDefault +
                '}';
    }
}
