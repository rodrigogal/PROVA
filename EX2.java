package com.mycompany.prova;

public class EX2 {
     public static void main(String[] args) {
        double percent = 1.5;
        double novoSala, salaAnterior = 1000.00;
        
        for(int i = 1996; i < 2023; i++){
            novoSala = (percent/100) * salaAnterior + salaAnterior;
            salaAnterior = novoSala;
            percent = percent * 2;
        }
        System.out.println("O salario atual é: " + salaAnterior);
    }
}

