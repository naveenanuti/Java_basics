package oops;

public class HdfcAtm implements ATM {


    public void withdrawlamount(int accountNo, int amount) {
        System.out.println("HDFC WD");

    }
    public void pinchange(int currentPin, int otp, int newpin, int confirmnewpin) {
        System.out.println("HDFC Pc");

    }


    public void balanceTransfer(int fromaccount, int toaccount) {
        System.out.println("HDFC BT");

    }


    public void ministatement(int lasttransactioncount) {
        System.out.println("HDFC MS");

    }
}
