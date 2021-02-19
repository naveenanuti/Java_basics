package oops;

public class EncapsulationEx1 {
    public static void main(String[] args) {
        EncapsulationEx enc = new EncapsulationEx();
        enc.setAccountNO(121);
        enc.setStudentNO(152);
        System.out.println(enc.getAccountNO());
        System.out.println(enc.getStudentNO());
    }
}
