package spring.boot.controller.DTO;

import spring.boot.entity.Bill;

import java.math.BigDecimal;

public class BillDTO {
    private Long billId;
    private BigDecimal amount;
    private boolean isDefault;






    public BillDTO(Bill bill){
        billId = bill.getBillId();
        amount= bill.getAmount();
        isDefault=bill.getDefault();

    }

    public BillDTO(Long billId, BigDecimal amount, boolean isDefault) {
        this.billId = billId;
        this.amount = amount;
        this.isDefault = isDefault;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
