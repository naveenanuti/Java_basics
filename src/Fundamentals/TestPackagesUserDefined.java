package Fundamentals;

import pakc1.TestPackage1;
import pakc2.TestPackage2;

import java.util.Date;

public class TestPackagesUserDefined {
    public static void main(String[] args)
    {
        TestPackage1 t1 = new TestPackage1();
        t1.m1();
        t1.m2();
        TestPackage2 t2 = new TestPackage2();
        t2.m3();
        t2.m4();

        Date d1 = new Date();
        System.out.println(d1);



    }

}
