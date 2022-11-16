package solid.interfaceSegregationPrinciple;

public class TerminalPaymentService implements WebMoneyPayment, CreditCardPayment{
    @Override
    public void payWebMoney() {
        //logic
    }
    @Override
    public void payCreditCard() {
        //logic
    }
}
