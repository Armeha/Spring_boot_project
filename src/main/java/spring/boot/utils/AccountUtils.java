package spring.boot.utils;

import spring.boot.entity.Account;
import spring.boot.entity.Bill;
import spring.boot.exceptions.NotDefaultBillException;

public class AccountUtils {
    public static Bill findDefaultBill(Account accountFrom) {
        return accountFrom.getBill().stream()
                .filter(Bill::getDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("Unable to find default bill for account with id: "
                        + accountFrom.getAccountId()));
    }
}
