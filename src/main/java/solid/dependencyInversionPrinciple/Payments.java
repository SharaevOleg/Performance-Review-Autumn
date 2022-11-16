package solid.dependencyInversionPrinciple;

import java.math.BigDecimal;

public interface Payments {
    void doTransaction(BigDecimal amount);
}
