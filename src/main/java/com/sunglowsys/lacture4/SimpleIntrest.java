package com.sunglowsys.lacture4;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter principle Amount ");
        float  p = sc.nextFloat();
        System.out.println(" Enter Rate of i ntrest ");
        float r = sc.nextFloat();
        System.out.println(" Enter time ");
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println(" principle amount " + p);
        System.out.println("Rate of intrest" + r);
        System.out.println(" Time" + t);
        System.out.println(" simple intrest " + si);

    }
}
