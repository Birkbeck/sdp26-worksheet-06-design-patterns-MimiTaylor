package adapter;

public class XpayToPayDAdapter implements PayD {

    // using composition 'HAS-A' Xpay object.
    // it is referencing any object that implements Xpay interface
    // xpayObject name might be a bit misleading but I get it. (obvs you cannot instantiate an interface)
    Xpay xpayObject;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpayObject = xpay;
    }


    @Override
    public String getCustCardNo() {
        return xpayObject.getCreditCardNo();
    }

    @Override
    public String getCardOwnerName() {
        return xpayObject.getCustomerName();
    }

    @Override
    public String getCardExpMonthDate() {
        return xpayObject.getCardExpMonth();
    }

    @Override
    public int getCVVNo() {
        return xpayObject.getCardCVVNo();
    }

    @Override
    public double getTotalAmount() {
        return xpayObject.getAmount();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        xpayObject.setCreditCardNo(custCardNo);
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpayObject.setCustomerName(cardOwnerName);
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        xpayObject.setCardExpMonth(cardExpMonthDate);
    }

    @Override
    public void setCVVNo(int cVVNo) {
        xpayObject.setCardCVVNo((short) cVVNo);
    }

    @Override
    public void setTotalAmount(double totalAmount) {
        xpayObject.setAmount(totalAmount);    }
}

// derek banas - adapter design pattern
// https://www.youtube.com/watch?v=qG286LQM6BU&t=734s
