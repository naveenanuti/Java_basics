package oops;

public class SbiAtm1 extends SbiAtm {


    public void balanceTransfer(int fromaccount, int toaccount) {
        System.out.println("SBI BT");
    }
    public void ministatement(int lasttransactioncount) {
        System.out.println("SBI MS");
    }
    public void depositAmount(int accountNo, int amount) {
        System.out.println("SBI Deposit Amount");
    }
    public void withdrawlFromApp(int currentPin, int otp, int newpin, int confirmnewpin) {
        System.out.println("SBI withdrawl from APP");
        System.out.println(ATM1.comInterestRate);
    }
}
