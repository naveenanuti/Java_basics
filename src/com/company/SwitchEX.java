package com.company;

import java.text.BreakIterator;

public class SwitchEX {
    public static void main(String[] args) {
        String atm = "WD";
        switch (atm)
        { case "WD":
                System.out.println("you can withdraw amount");
                break;

            case "BT":
                System.out.println("Amount transfer you can do");
                break;
                case "pc":
                System.out.println("pin change");
                break;

            default:System.out.println("Please select wd or bt or pi");
                break;

        }
    }



}
