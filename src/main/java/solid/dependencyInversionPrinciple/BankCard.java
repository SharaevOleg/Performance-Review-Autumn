package solid.dependencyInversionPrinciple;

import java.math.BigDecimal;

public class BankCard implements Payments{
    @Override
    public void doTransaction(BigDecimal amount) {
        //logic
    }
}
