package exception;

public class TryWithMultipleCatchBlocks {
    public static void main(String[] args) {
        int i [] = {10,20};
        try{
            System.out.println(10/1);
            System.out.println(i[2]);
        }
        catch (ArithmeticException ar)
        {
            System.out.println("Don't divide with zero, you will get infinite value atleast divide with 1");
            System.out.println(10/1);
        }
        catch (ArrayIndexOutOfBoundsException aioobe)
        {
            System.out.println("You are accessing not in the range");
            System.out.println(i.length);
        }
     finally {
            System.out.println("clean up code");
            System.out.println("session close");
        }
    }
}
