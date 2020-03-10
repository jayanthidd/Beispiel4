package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// When is the next Impfung due
        byte age = 30;
        int lastyear =2000;
       boolean firstrefresh = false;
        int nextrefresh = naechsteZeckenImpfung(age, lastyear, firstrefresh);
        System.out.println("The next refresh is due in: " + naechsteZeckenImpfung(age, lastyear, firstrefresh));
        System.out.println("---------------------------");

        //Sort the contents of an array
        int[] feld = new int[] {99,98,97,96};
        feld = feldUmsortieren(feld);
        System.out.println(Arrays.toString(feld));
        System.out.println("---------------------------");

        //Is this year a leap year?
        System.out.println("Is the year leap: "+leapYear(2020));
        System.out.println("---------------------------");

        //Calculation of Income Tax
        double income;
        income = 11000;
        System.out.println("Tax for a salary of "+income+"€ is: "+berechneLohnsteuer(income)+"€");
        System.out.println("---------------------------");
    }
    public static double berechneLohnsteuer(double einkommen){
        double lohnsteuer =0;
        double balancesalary = 0;
        if (einkommen >=1000000) {
            balancesalary = einkommen - 1000000;
            lohnsteuer = 1725 + 2450 + 2100 + 12180 + 14400 + 455555 + balancesalary * 55 / 100;
            return lohnsteuer;
        }
        if (einkommen>=90000) {
            balancesalary = einkommen - 90000;
            lohnsteuer = 1725 + 2450 + 2100 + 12180 + 14400 + balancesalary * 50 / 100;
            return lohnsteuer;
        }
        if(einkommen>=60000){
            balancesalary = einkommen-60000;
            lohnsteuer = 1725 + 2450 + 2100 + 12180 + balancesalary * 48 / 100;
            return lohnsteuer;
        }
        if (einkommen>=31000){
            balancesalary = einkommen - 31000;
            lohnsteuer = 1725 + 2450 + 2100 + balancesalary * 42 / 100;
            return lohnsteuer;
        }
        if (einkommen>= 25000){
            balancesalary=einkommen-25000;
            lohnsteuer = 1725 + 2450 + balancesalary * 35 / 100;
            return lohnsteuer;
        }
        if (einkommen>=18000){
            balancesalary=einkommen-18000;
            lohnsteuer = 1725 + balancesalary * 35 / 100;
            return lohnsteuer;
        }
        if (einkommen>=11000) {
            balancesalary = einkommen - 11000;
            lohnsteuer = balancesalary * 25 / 100;
            return lohnsteuer;
        }
        return lohnsteuer;
    }

    public static boolean leapYear(int year){
       if (year % 400==0)
            return true;
       if (year % 100 == 0)
           return false;
       if (year % 4 == 0)
           return true;
    return false;
    }
    public static int[] feldUmsortieren (int[] feld){
    int[] sorted = new int [4];
    sorted [0] = feld [3];
    sorted [1] = feld [2];
    sorted [2] = feld [1];
    sorted [3] = feld [0];
     /*   int sorted;
        sorted = feld [0];
        feld [0]= feld [3];
        feld [3] = sorted;
        sorted = feld [1];
        feld [1] = feld [2];
        feld [2] = sorted;
      */
    return sorted;
    }


    public static int naechsteZeckenImpfung(int alter, int letztesImpfungsjahr, boolean ersteAuffrischung){
        int nextImpfung;
        if (ersteAuffrischung || alter >= 60)
            nextImpfung = letztesImpfungsjahr+3;
        else
            nextImpfung = letztesImpfungsjahr+5;
        return nextImpfung;
    }
}
