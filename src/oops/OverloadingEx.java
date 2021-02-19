package oops;

class Overload{

    public void add(int i, int j)
    {
        System.out.println(i+j);
    }
    public void add(float f, int i)
    {
        System.out.println(f+i);
    }
    public void add(int i,float f, short s)
    {
        System.out.println(i+f+s);
    }
}
public class OverloadingEx {
    public static void main(String[] args) {
        Overload c = new Overload();
        c.add(40,88);
        c.add(124f,24);

    }
}

