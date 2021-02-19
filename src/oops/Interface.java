package oops;

interface ATM{

    int interestRate =8;
    public void withdrawlamount(int accountNo, int amount);
    public void pinchange(int currentPin, int otp, int newpin, int confirmnewpin);
    public void balanceTransfer(int fromaccount, int toaccount);
    public void ministatement(int lasttransactioncount);

}
interface ATM1{
    int comInterestRate=10;
    int interestRate =8;
    public  void depositAmount(int accountNo, int amount);
    public  void withdrawlFromApp(int currentPin, int otp, int newpin, int confirmnewpin);
}












