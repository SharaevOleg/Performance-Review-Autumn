package solid.interfaceSegregationPrinciple;

public class InternetPaymentService implements WebMoneyPayment,
        CreditCardPayment,
        PhoneNumberPayment{
    @Override
    public void payWebMoney() {
        //logic
    }
    @Override
    public void payCreditCard() {
        //logic
    }
    @Override
    public void payPhoneNumber() {
        //logic
    }
}
