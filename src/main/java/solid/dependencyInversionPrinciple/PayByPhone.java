package solid.dependencyInversionPrinciple;

import java.math.BigDecimal;

public class PayByPhone implements Payments {
    @Override
    public void doTransaction(BigDecimal amount) {
        //logic
    }
}
