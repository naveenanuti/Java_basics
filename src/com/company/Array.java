package com.company;

public class Array {
 public static void main(String[] args)
 {

     int i[] = new int [5];

     i[0]= 1200;
     i[1]= 1500;
     i[4]= 2000;
/*
     String stuRollNo = new String[2][3];
     stuRollNo[1][2] = "RL1234";*/



     System.out.println(i[0]);
     System.out.println(i[1]);
     System.out.println(i[4]);

     // control structures
     int m []= {10,20,30,40,50};
     int n= 0;
// for- each loop in iteration statements
     for (int k:m)
     {
         System.out.println(k);
     }

     System.out.println("hello");


    /* while (n<5) {
         System.out.println(m[n]);
         n++;

     }*/
 }
}
