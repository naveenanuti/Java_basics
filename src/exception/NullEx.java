package exception;

public class NullEx {
    public static void main(String[] args) {
        String s = "Naveen kumar anuti";
        //s.charAt(2);
        //System.out.println(s.charAt(2));
        //System.out.println(s.trim());
        String s1[] = s.split("a");
        for(String str:s1)
        {
            System.out.println(str);
        }

    }
}
