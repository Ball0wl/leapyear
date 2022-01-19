package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class leapyear {
    public static void main (String[]args){

        boolean check=true;
        while(check==true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Gib ein Jahr ein und lass es uns auf Schaltjahr-sein überprüfen.");
            int jahr = sc.nextInt();
            System.out.println(new GregorianCalendar().isLeapYear(jahr));
            System.out.println("Möchten Sie ein weiteres Jahr überprüfen lassen? y oder n");
            String jaNe = sc.next().toUpperCase();
            if(jaNe.equals("N")){
                System.out.println("Bis bald!");
                check=false;
            } else if(jaNe.equals("Y")){
            }
            else{
                check = false;
                System.out.println(jaNe+" ist keine gültige Angabe. Das Programm wird beendet.");
            }
        }
    }
}
