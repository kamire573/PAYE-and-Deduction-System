package com.jstevenperry.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//      variables declaration
        String fullName;
        double grossSalary, netSalary, nhif, nssf, vat, personalRelief, PAYEE;

        /* Get username */
        System.out.println("Enter your full name:");
        fullName = scan.nextLine();

//      Get gross salary
        System.out.println("Enter your Gross Salary Ksh:");
        grossSalary = scan.nextDouble();

//      calculate percentage tax amount to be charged
        nhif = .02*grossSalary;
        nssf = .12*grossSalary;
        vat = .12*grossSalary;
        personalRelief =

//      Calculate PAYEE
        PAYEE = nhif + nssf + vat;

//      Calculate net salary
        netSalary = grossSalary - PAYEE;

        System.out.println("Your salary is Ksh: + netSalary");
        
    }
}
