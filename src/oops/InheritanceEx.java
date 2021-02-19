package oops;

public class InheritanceEx {

    public static void main(String[] args) {
        Child c1= new Child();
        c1.add(40 ,20);
        c1.mul(12,13);
        Parent p1= new Parent();
        p1.sub(100,50);
        Parent p2= new Child();
        p2.add(100,200);
        //System.out.println(l=3);
    }
}
