package com.company;

public class StringEX {
      //static String sname = "Naveen";
//      static StringBuffer sname = new StringBuffer("Naveen");
      static StringBuilder sname = new StringBuilder("Naveen");

    public static void main(String[] args) {
        StringBuilder sname1 = sname.append("Reddy");
        System.out.println(sname1);

    }
}
