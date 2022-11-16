package solid.dependencyInversionPrinciple;

import java.math.BigDecimal;

public class Cash implements Payments{
    @Override
    public void doTransaction(BigDecimal amount) {
        //logic
    }
}
