package exception;

public class ThrowsEx {
    public static void main(String[] args) throws InterruptedException {
        ThrowsEx t = new  ThrowsEx();
        t.m1();
    }
        public void m1() throws InterruptedException{
            Thread.sleep(5000);
            System.out.println("hello");
        }



}
