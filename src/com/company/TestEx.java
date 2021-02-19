package com.company;

public class TestEx
{
 public static void main(String[] args){
     Test t = new Test();
     int addResult = t.add(60,70);
     System.out.println(addResult);
     Test.sub(40,30);
     int subResult = Test.sub(40,30);
     System.out.println(subResult);

     TestEx te =new TestEx();
     te.instanceMethod();
 }

    private void instanceMethod() {

        Test t = new Test();
        int iaddResult = t.add(70,70);
        System.out.println(iaddResult);
        Test.sub(120,30);
        int isubResult = Test.sub(120,30);
        System.out.println(isubResult);
    }


}
