package spring.boot.controller.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class BillDTO2 {
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("isDefault")
    private boolean isDefault;

    public BillDTO2(BigDecimal amount, boolean isDefault) {
        this.amount = amount;
        this.isDefault = isDefault;
    }

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

    public BillDTO2() {

    }
}
