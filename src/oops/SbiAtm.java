package oops;

public abstract class SbiAtm implements ATM, ATM1 {

    public void withdrawlamount(int accountNo, int amount) {
     System.out.println("sbi WD");

    }
    public void pinchange(int currentPin, int otp, int newpin, int confirmnewpin) {
        System.out.println("sbi Pc");
    }

}
