package solid.liskovSubstitutionPrinciple;

import java.math.BigDecimal;

public class DepositAccount extends Account {
    @Override
    public BigDecimal balance(String numberAccount) {
        //logic
        BigDecimal bigDecimal = null;
        return bigDecimal;
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        //logic
    }
}