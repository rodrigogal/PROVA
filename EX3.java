package com.mycompany.prova;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0, hrs, min, sec;
        double massaI, massaF;
        System.out.println("Massa do material em gramas");
        
        massaI = sc.nextDouble();
        massaF = massaI;
        
        while (massaF >= 0.5) {
            massaF/= 2;
            t += 50;
        }
        System.out.println();
        System.out.println("A massa incial é " + massaI + "g. ");
        System.out.println("A massa final é " + massaF + "g. ");
        
        hrs = (t / 3600);
        min = (t / 60);
        sec = t; 
        System.out.println(hrs + " horas, " + min + " minutos, " + sec + " segundos");
    }
}
