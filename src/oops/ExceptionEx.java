package oops;


public class ExceptionEx {
    public static void main(String[] args) throws InterruptedException {
        /*int i = 10; int j = 20;
        System.out.println(i/j);
        try{
        System.out.println(i/0);
        }
        catch (Exception e)
        {
            System.out.println(i/1);
        }
        System.out.println("hello");
    }*/
        ExceptionEx e = new ExceptionEx();
        e.sleeping();
    }


    public void sleeping() throws InterruptedException {
         System.out.print("hello");
         Thread.sleep(10000);

         System.out.println("hi");
        }


}


